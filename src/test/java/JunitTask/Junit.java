package JunitTask;

import org.hamcrest.MatcherAssert;

public class Junit {

    public double Multiply(double firstNumber, double secondNumber) {

        if (firstNumber >= 0 && firstNumber <= 100 && secondNumber >= 0 && secondNumber <= 100) {
            return firstNumber * secondNumber;
        }
        return 0;
    }

    public int Subtract(int firstNumber, int secondNumber) {
        if (firstNumber > 0 && secondNumber > 0 && firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        }
        return -1;
    }

    public double Divide(double numberToBeDivided, double divisor) {
        if (numberToBeDivided > 0 && divisor > 0 && numberToBeDivided > divisor) {
            return numberToBeDivided / divisor;
        }
        return 0;
    }
    public double SimpleDivide(double firstNumber, double secondNumber){
        return firstNumber/secondNumber;
    }



}
