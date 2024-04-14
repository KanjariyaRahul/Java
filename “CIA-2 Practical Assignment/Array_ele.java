import java.util.Scanner;

class Perform {
    Perform() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("==============================");
        int[] a = new int[n + 1];

        System.out.print("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be inserted: ");
        int e = sc.nextInt();
        System.out.println("================================");
        System.out.print("Enter the position: ");
        int p = sc.nextInt();

        if (p >= 1 && p <= n + 1) {
            for (int i = n; i >= p; i--) {
                a[i] = a[i - 1];
            }
            a[p - 1] = e;
            n++;
            System.out.println("=============================");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println("Position Invalid");
        }
        sc.close();
    }
}
class Array_ele{
    public static void main(String args[]) {
        new Perform();
    }
}
