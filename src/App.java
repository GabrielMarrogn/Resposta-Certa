import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            System.out.println("resposta " +(i+1) +": " +arr[i]);
        }

        sc.close();
    }
}
