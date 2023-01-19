package hw;

class TestException {
    public static void main(String args[]) {
        {
            try {
                int d = 0;
                int a = 42 / 0;
            } catch (ArithmeticException e) {

            }
            System.out.println("деление на 0");
        }
    }
}