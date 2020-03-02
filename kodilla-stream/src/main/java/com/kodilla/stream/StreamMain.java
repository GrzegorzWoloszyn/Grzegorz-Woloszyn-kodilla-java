package com.kodilla.stream;

import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FuctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a,b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a,b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a,b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a,b) -> a / b);

        System.out.println("Calculating expressions with method reference");
        expressionExecutor.executeExpression(10, 5, FuctionalCalculator::multiplayAByB);
        expressionExecutor.executeExpression(10, 5, FuctionalCalculator::subAFromB);
        expressionExecutor.executeExpression(10, 5, FuctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(10, 5, FuctionalCalculator::addAToB);



    }
}
