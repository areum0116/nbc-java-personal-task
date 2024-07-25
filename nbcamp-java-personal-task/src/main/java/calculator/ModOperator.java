package calculator;

public class ModOperator implements ArithmeticCalculator2{
    @Override
    public int operate(int num1, int num2) {
        return num1 % num2;
    }
}
