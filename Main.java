import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         // Combination formula: C(n,r) = n! / (r! * (n-r)!)
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the combination part n: ");
        int n = inp.nextInt();
        System.out.print("Enter the combination part r: ");
        int r = inp.nextInt();
        int top = 1;
        int under = 1;
        int under2 =1;
        // n*(n-1)*(n-2)...*1 / [(r*(r-1)*(r-2)..*1) * (n-r)*(n-r-1)*....*1]
        if (n>r) {
            for (int i = 1; i <= n; i++) {
                top = top * i;

            }
            for (int x = 1; x <= r; x++) {
                under = under * x;
            }

            for (int y = 1; y <= n - r; y++) {
                under2 = under2 * y;

            }

            int result = top / (under * under2);
            System.out.print("C(" + n + "," + r + ")" + "=" + result);
        } else {
            System.out.print("You must enter the number that n is bigger than r.");

        }
    }
}