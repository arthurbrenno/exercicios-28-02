import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero>> ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial*=i;
        }
        System.out.println(fatorial);
    }
}