package main.java.com.example.calculator;

public class BinaryMinusOperation extends AbstractBinaryOperation{

    public BinaryMinusOperation(double operandA, double operandB) {
        super(operandA, operandB);
    }

    @Override
    public String getOperationSymbol() {
        return "-";
    }

    @Override
    public double doProcess() {
        return getOperandA() - getOperandB();
    }
}
