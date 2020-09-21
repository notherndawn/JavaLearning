package main.java.com.example.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MathExpressionParser {
    private static final Logger logger = LogManager.getRootLogger();
    String[] expSplit;
    int size;

    public MathExpressionParser(String exp) {
        this.expSplit = exp.split(" ");
        this.size = expSplit.length;
    }

    public double getOperand() {
        if (size == 3) {
            return Integer.parseInt(expSplit[0]);
        } else {
            return 0;
        }
    }

    public double getSecondOperand() {
        if (size == 3) {
            return Integer.parseInt(expSplit[2]);
        } else {
            return Integer.parseInt(expSplit[1]);
        }
    }

    public String getOperation() {
        if (size == 3) {
            return expSplit[1];
        } else {
            return expSplit[0];
        }
    }


}
