package calculator;

public class AddOperator implements ArithmeticCalculator2{
    @Override
    public int operate(int num1, int num2) {
        return num1 + num2;
    }
}