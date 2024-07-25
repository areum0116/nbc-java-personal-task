package calculator;

public class DivideOperator implements ArithmeticCalculator2{
    @Override
    public double operate(double num1, double num2) throws BadInputException {
        if (num2 == 0) throw new BadInputException("0 cannot be used as a second parameter in division");
        else return num1 / num2;
    }
}
