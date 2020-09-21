package main.java.com.example.calculator;

public abstract class AbstractBinaryOperation implements Operation{
    private double operandA;
    private double operandB;

    public AbstractBinaryOperation(double operandA, double operandB) {
        this.operandA = operandA;
        this.operandB = operandB;
    }

    public double getOperandA() {
        return operandA;
    }

    public double getOperandB() {
        return operandB;
    }
}
