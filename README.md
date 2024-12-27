 # Sum Program

This project demonstrates a simple Java program that performs basic arithmetic operations (addition, subtraction, multiplication, and division) on two integers provided by the user.

## Features
- Accepts two integer inputs from the user.
- Performs the following operations:
  - Addition
  - Subtraction
  - Multiplication
  - Division (with a check to prevent division by zero).
- Outputs the results of the operations.

## Prerequisites
- Java Development Kit (JDK) installed on your system.
- Basic understanding of Java programming.

## How to Run
1. Clone or download the project files.
2. Open the project folder in your preferred Integrated Development Environment (IDE) or text editor.
3. Compile the program using the following command:
   ```bash
   javac Sum.java
   ```
4. Run the program with:
   ```bash
   java Sum
   ```
5. Follow the prompts to enter two integer values.

## Sample Output
### Input:
```
Enter the value of 'a' and 'b':
10
5
```

### Output:
```
Output for addition: 15
Output for subtraction: 5
Output for multiplication: 50
Output for division: 2
```

### Notes:
- If the second integer (`b`) is 0, the program will display:
  ```
  Division by zero is not allowed.
  ```

## Known Issues
- The program accepts only integer inputs. If a non-integer input is provided, it will throw a `NumberFormatException`.

## License
This project is released under the MIT License. Feel free to use, modify, and distribute it as you see fit.

