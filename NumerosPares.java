// RA: 5157519 
public class NumerosPares {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 2; i <= 100; i+=2) {
            System.out.printf("[%d] %d%n",++j, i);
        }
    }
}
