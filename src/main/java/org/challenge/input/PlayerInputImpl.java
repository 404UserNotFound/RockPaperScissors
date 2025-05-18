package org.challenge.input;

import org.challenge.model.Move;

import java.util.Scanner;

public final class PlayerInputImpl implements PlayerInput {
    private final Scanner scanner;

    public PlayerInputImpl(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Move getPlayerMove() {
        while (true) {
            System.out.print("Enter move: ");
            String moveInput = scanner.nextLine().trim().toUpperCase();
            try {
                return Move.valueOf(moveInput);
            } catch (IllegalArgumentException e) {
                System.out.printf("%n Your move %s was invalid, please try again.%n", moveInput);
            }
        }
    }
}
