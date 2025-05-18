# Rock Paper Scissors
Simple Command Line Rock Paper Scissors Game.

Pre-requisites:
*JAVA 21 (Amazon Corretto 21.0.7)*

*Apache Maven 3.9.9*

Repository:
https://github.com/404UserNotFound/RockPaperScissors

# How to run:
* Unzip project/clone the repository to your local machine.

* Run the following command to build the project:

```bash
mvn clean package
```
* After the build is complete, navigate to the newly created /target directory:
```bash
cd target
```
* Run the JAR file using the following command:
```bash
java -jar RockPaperScissors-1.0-SNAPSHOT.jar
```

#How to run tests:

* Run all tests using the following command:
```bash
mvn test
```

# How to play:
* Run the jar.

* Enter how many rounds you wish to play for, this must be a positive integer.

* Enter your move by typing one of: rock, paper, scissors. Your input is not case-sensitive.

* A scoreboard will be displayed at the end of the game.