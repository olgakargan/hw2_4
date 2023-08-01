package hw11;

public class Calculator {
    public int add (int a, int b) {
        return a+b;
    }
    public double add (double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator  =  new Calculator();
        System.out.println(calculator.add(5, 10));
        System.out.println(calculator.add(4.5, 8.6));
    }
}
