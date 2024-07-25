package calculator;

public class CircleCalculator extends Calculator{

    // Return the area of the circle.
    public double calculateCircleArea(int radius) {
        double result = Math.pow(radius, 2) * PI;
        circleList.add(result);
        return result;
    }

    // Print all the circle area answers.
    public void inquiryCircleResults() {
        System.out.print("Stored circle area answers : ");
        for (Double v : circleList) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
