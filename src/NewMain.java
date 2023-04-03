import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n=");
        int n = scan.nextInt();
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * 1;
        }
        System.out.println(n + "! = " + f);
    }
}
