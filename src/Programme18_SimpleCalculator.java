public class Programme18_SimpleCalculator {
    /**
     * 18. Sum Calculator
     * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
     * Write the following methods (instance methods):
     * ● Method named getFirstNumber without any parameters, it needs to return the value of the firstNumber field.
     * ● Method named getSecondNumber without any parameters, it needs to return the value of the secondNumber field.
     * ● Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
     * ● *Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
     * ● Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
     * ● Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of the secondNumber from the firstNumber.
     * ● Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
     * ● Method named getDivisionResult without any parameters, it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of
     * secondNumber is 0 then return 0.
     * TEST EXAMPLE
     * TEST CODE: Write the bellow code into main method
     * SimpleCalculator calculator = new SimpleCalculator();
     * calculator.setFirstNumber(5.0);
     * calculator.setSecondNumber(4);
     * System.out.println("add= " + calculator.getAdditionResult());
     * System.out.println("subtract= " + calculator.getSubtractionResult());
     * calculator.setFirstNumber(5.25);
     * calculator.setSecondNumber(0);
     * System.out.println("multiply= " + calculator.getMultiplicationResult());
     * PRIME TESTING
     * System.out.println("divide= " + calculator.getDivisionResult());
     * NOTE: All methods should be defined as public NOT public static.
     * NOTE: In total, you have to write 8 methods.
     */
    double firstNumber;
    double secondNumber;

    public static void main(String[] args) {
        Programme18_SimpleCalculator calculator = new Programme18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * method for addition of two number
     * @return
     */
    public double getAdditionResult() {
        return firstNumber + secondNumber;

    }

    /**
     * method for subtraction of two number
     * @return
     */
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    /**
     * method for multiplication of two number
     * @return
     */
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;

    }

    /**
     * method for division of two number
     * @return
     */
    public double getDivisionResult() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            return 0;
        }
    }
}