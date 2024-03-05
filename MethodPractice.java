public class MethodPractice {

    public static void main(String[] args) {

        int a = 10;
        int b = 5 + 5;
        int c = a + b;
        System.out.println("első: " + c);
        System.out.print("második: ");
        sum1(a, b);
        System.out.print("harmadik: ");
        sum1(b, c);
        System.out.print("negyedik: ");
        sum2(a, b, c);
        System.out.println("ötödik: " + sum3());
        int sum4 = sum4(40, 20);
        System.out.println("hatodik: " + sum4);
        int subtraction = subtraction1(10, -10);
        System.out.println("hetedik: " + subtraction);
    }

    private static void sum1 ( int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    private static void sum2(int a, int b, int c){
        int sum = a + b +c;
        System.out.println(sum);
    }
    private static int sum3() {return 15 + 12;
    }
    private static int sum4(int numa, int numb){
        return numa + numb;
    }

    private static int subtraction1( int a, int b){
        return a - b;
    }
}
