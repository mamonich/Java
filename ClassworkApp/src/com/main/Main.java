package com.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumber  = scanner.next();
        String operand      = scanner.next();
        String secondNumber = scanner.next();

        Calculator calculator = new Calculator(firstNumber, secondNumber, operand);
        calculator.doOperand();
    }
}
