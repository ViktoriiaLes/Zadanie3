public class Test {
    public static void main(String[] args) {
        MyMath math1 = new MyMath();
        System.out.printf("6 is even: %s\n",math1.isEven(6));
        System.out.printf("5 is even: %s\n",math1.isEven(5));

        System.out.printf("4 is odd: %s\n",math1.isOdd(4));
        System.out.printf("3 is odd: %s\n",math1.isOdd(3));

        System.out.printf("Result of calling math1.circleField(2.5) is %5.2f\n",math1.circleField(2.5));

        int power1=math1.power(6);
        System.out.printf("Result of calling math1.power(6) is %d", power1);

    }
}

