package com.softuni.entity;

public class Calculator {
    private double leftOperand;
    private String operator;
    private double rightOperand;

    public double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public Calculator() {
    }

    public Calculator(double leftOperand, String operator, double rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public double calculateResult(){
        switch(this.operator){
            case "+":
                return this.leftOperand + this.rightOperand;
            case "-":
                return this.leftOperand - this.rightOperand;
            case "*":
                return this.leftOperand * this.rightOperand;
            case "/":
                return this.leftOperand / this.rightOperand;
            default:
                return 0;
        }
    }
}
