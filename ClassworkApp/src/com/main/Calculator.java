package com.main;

public class Calculator {

    private Double firstNumber;
    private Double secondNumber;
    private String operand;

    public Calculator(String firstNumber, String secondNumber, String operand) {

        verifyNumbers(firstNumber, secondNumber);
        this.operand = operand;
    }

    private void verifyNumbers(String firstNumber, String secondNumber) {
        try {
            this.firstNumber = Double.valueOf(firstNumber);
            this.secondNumber = Double.valueOf(secondNumber);
        }catch (NumberFormatException e){
            System.out.println(e);
            System.exit(0);
        }
    }

    public void doOperand(){
        try {
            double result;


            switch (operand){
                case "+"->{
                    result = firstNumber + secondNumber;
                    showResult(result);
                    break;
                }
                case "-"->{
                    result = firstNumber - secondNumber;
                    showResult(result);
                    break;
                }
                case "*"->{
                    result = firstNumber * secondNumber;
                    showResult(result);
                    break;
                }
                case "/"->{
                    result = firstNumber / secondNumber;
                    isInfinity(result);
                    showResult(result);
                    break;
                }
                default -> {
                    throw new WrongMathOperationException("Нету такой операции для калькулятора");
                }
            }
        }catch (Exception e){
            System.out.println(e);
            System.exit(0);
        }
    }

    private void isInfinity(double result) {
        if(Double.isInfinite(result)){
            throw new ArithmeticException("Ошибка! Деление на 0 - запрещено");
        }
    }

    private void showResult(double result) {
        System.out.println(result);
    }

}
