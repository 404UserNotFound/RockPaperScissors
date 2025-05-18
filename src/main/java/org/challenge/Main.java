package org.challenge;

import org.challenge.computer.ComputerMoveGenerator;
import org.challenge.computer.ComputerMoveGeneratorImpl;
import org.challenge.evulator.MoveEvaluator;
import org.challenge.evulator.MoveEvaluatorImpl;
import org.challenge.input.PlayerInput;
import org.challenge.input.PlayerInputImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please input how many rounds you would like to play: ");
        int numOfRounds = validateNumOfRounds(scanner);

        PlayerInput playerInput = new PlayerInputImpl(scanner);
        ComputerMoveGenerator computerMove = new ComputerMoveGeneratorImpl();
        MoveEvaluator moveEvaluator = new MoveEvaluatorImpl();

    }

    private static int validateNumOfRounds(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine();
                int rounds = Integer.parseInt(input);
                if (rounds <= 0) {
                    throw new NumberFormatException();
                }
                return rounds;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a positive integer: ");
            }

        }
    }
}