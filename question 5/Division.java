import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.println("please enter the numerator:"); // numerator
        int a = input.nextInt();
        System.out.println("please enter the denominator");// denominator
        int b = input.nextInt();

        System.out.println();
        System.out.println(a);
        System.out.println("-");// numerator denominator format
        System.out.println(b);
        System.out.println();

        System.out.println("the answer is: "+a/b);// result output and division

        input.close();
    }
}