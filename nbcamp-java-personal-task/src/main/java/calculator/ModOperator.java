package calculator;

public class ModOperator implements ArithmeticCalculator2{
    @Override
    public double operate(double num1, double num2) {
        return num1 % num2;
    }
}
