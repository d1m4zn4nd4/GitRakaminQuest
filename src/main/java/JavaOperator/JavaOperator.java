package JavaOperator;

public class JavaOperator {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + addition);
        System.out.println("a - b = " + subtraction);
        System.out.println("a * b = " + multiplication);
        System.out.println("a / b = " + division);
        System.out.println("a % b = " + remainder);

        // Comparison Operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);

        System.out.println("\nComparison Operators:");
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreaterThan);
        System.out.println("a < b: " + isLessThan);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println("a <= b: " + isLessOrEqual);

        // Logical Operators
        boolean x = true;
        boolean y = false;
        boolean andOperator = x && y;
        boolean orOperator = x || y;
        boolean notOperatorX = !x;
        boolean notOperatorY = !y;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + andOperator);
        System.out.println("x || y: " + orOperator);
        System.out.println("!x: " + notOperatorX);
        System.out.println("!y: " + notOperatorY);
    }

    public static int SubstractionFunc(int a,int b){
        int SubstractionResult = a - b;
        System.out.println(a+" + "+b+" = "+SubstractionResult);
        return SubstractionResult;
    }
}
