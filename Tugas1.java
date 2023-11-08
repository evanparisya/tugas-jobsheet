import java.util.Scanner;

/**
 * Tugas1
 */
public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){
            for(int k = 0; k < N-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
