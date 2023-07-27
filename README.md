# Mortgage Calculator (Java)

This repository contains a simple mortgage calculator developed using Java. The calculator is designed to accept user inputs for the principal loan amount, annual interest rate, and loan period, then compute the monthly mortgage payment.

## Features

The program includes the following features:

1. Validation of user input:
    - Ensures the principal amount is within the range of $1,000 and $1,000,000.
    - Ensures the annual interest rate is between 1% and 30%.
    - Ensures the loan period is between 1 and 30 years.

2. Computation of the monthly mortgage payment using the formula:

    M = P[r(1+r)^n/((1+r)^n)-1)]

    where:
    - M is your monthly payment.
    - P is the principal loan amount.
    - r is your monthly interest rate (annual interest rate divided by 12).
    - n is number of payments (number of months the loan will be paid).

## Usage

To run the program, follow the instructions below:

1. Clone the repository to your local machine or download the Main.java file.
2. Open a terminal window.
3. Navigate to the directory containing Main.java.
4. Compile the Java file using the command `javac Main.java`.
5. Run the program using the command `java Main`.
6. Follow the prompts in the terminal to provide the required inputs.

## Contributing

Your contributions are always welcome! Please feel free to submit a pull request.

## License

This project is [MIT](http://opensource.org/licenses/MIT) licensed.

## Contact

If you have any questions, feel free to contact me.

