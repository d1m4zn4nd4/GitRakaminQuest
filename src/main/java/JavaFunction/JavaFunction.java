package JavaFunction;

import static JavaOperator.JavaOperator.SubstractionFunc;

public class JavaFunction {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        int z = 10;

        addition(x,y);
        SubstractionFunc(z,x);
        addition(y,z);
    }

    public static int addition(int a, int b) {
        int additionResult = a + b;
        System.out.println(a+" + "+b+" = "+additionResult);
        return  additionResult;
    }
}
