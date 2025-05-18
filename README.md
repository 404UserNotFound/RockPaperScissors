# Rock Paper Scissors
Simple Command Line Rock Paper Scissors Game.

Pre-requisites:
*JAVA 21 (Amazon Corretto 21.0.7)*
*Maven 3.9.5*

Repository:
https://github.com/404UserNotFound/RockPaperScissors

# How to run:
*Unzip project/clone the repository to your local machine.
*Open a terminal and navigate to the project directory.
*Run the following command to build the project:
```bash
mvn clean package
```
*After the build is complete, navigate to the target directory:
```bash
cd <TARGET_DIRECTORY>
```
*Run the JAR file using the following command:
```bash
java -jar rock-paper-scissors-1.0-SNAPSHOT.jar
```

# How to play:
*Run JAR file with java -jar command

*Enter how many rounds you wish to play for, this must be a positive integer.

*Enter your choice by typing one of: rock, paper, scissors. Your input is not case-sensitive.

*The computer will randomly choose its own move.

*The winner and moves for each round will be displayed along with count of current round out of total rounds.

*A scoreboard will be displayed at the end of the game.