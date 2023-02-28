// RA: 5157519 
public class MostrarSequencia {

    public static void main(String[] args) {
        for (int k = 1; k <= 5; k++) {
            System.out.printf("[%d]%n", k);
            int j = 5;
            for (int i = 1; i <= 11; i++) {
                if (i <= 6) {
                    System.out.println("*".repeat(i));
                } else {
                    System.out.println("*".repeat(j--));
                }
            }
            System.out.println();
        }

    }
}