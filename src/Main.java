import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner data = new Scanner(System.in);
        System.out.println("1st value");
        a = data.nextInt();

        System.out.println("2nd value");
        b = data.nextInt();

        System.out.println("3nd value");
        c = data.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else {
                    if (a > b) {
                        System.out.println("c > a > b");
                } else {
                        System.out.println("c > b > a");
                }
            }
        }
}
