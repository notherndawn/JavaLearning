package main.java.com.example.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getRootLogger();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        MathExpressionParser parser = new MathExpressionParser(expression);
        String oper = parser.getOperation();
        logger.debug("Operation:" + oper);
        switch(oper){
            case "+":
                PlusOperation operation1 = new PlusOperation(parser.getOperand(),parser.getSecondOperand());
                logger.info(operation1.doProcess());
            case "-":
                BinaryMinusOperation operation2 = new BinaryMinusOperation(parser.getOperand(),parser.getSecondOperand());
                logger.info(operation2.doProcess());
        }
    }
}
