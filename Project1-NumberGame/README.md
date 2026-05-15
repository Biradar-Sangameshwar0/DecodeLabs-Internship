Java Project 1 – Number Guessing Game

Description

This project is a Java based Number Guessing Game developed as part of my DecodeLabs Industrial Internship journey.

The program generates a random number between 1 and 100, and the user must guess the correct number using logical hints provided by the system. At the beginning, user have to chose the Difficulty level (Easy/medium/Hard)

Random number generation using Java (Here the system automatically sets random number) User input handling with Scanner (Now, we the user must guess and input no's until the correct answer is guessed)
Conditional logic (If our guessed no. is larger than the actual, it indicates with - Too High and If our guessed no. is smaller than the actual, it indicates with -Too Low and If our guessed no. is equal to the actual, it indicates with - correct)
Attempt tracking system (It indicates no. of attempts left or completed)
Score calculation feature (If no. of attempts left =4, score=4*10=>40)
Hint System:

Too High
Too Low
Correct Guess
The project also includes:

Attempt tracking
Score calculation
Maximum attempt limit
Interactive user experience
Features

Random number generation
User input using Scanner
Conditional statements
Loop implementation
Attempt counter
Score system
Input validation
Beginner-friendly game design
Technologies Used

Java
VS Code
JDK 17+
How to Run

Compile:

javac NumberGame.java

Run:

java NumberGame

Sample Output

=== Welcome to Number Guessing Game === Guess a number between 1 and 100 You have only 10 attempts.

Enter your guess: 50 Too low! Try again.

Enter your guess: 75 Too high! Try again.

Enter your guess: 63 Congratulations! You guessed the correct number. Total attempts: 3 Your score: 80

Learning Outcomes

This project helped strengthen:

Core Java programming
Conditional logic
Loops
Random class usage
Scanner class
Problem-solving skills
Backend logic development
Project Highlights

Improved programming confidence
Strengthened logical thinking
Built foundational Java development skills
Enhanced debugging and testing experience
