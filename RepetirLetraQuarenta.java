// RA: 5157519 .
public class RepetirLetraQuarenta {
    public static void main(String[] args) { 
        args[0] += " ";
        for (int i = 1; i <= 8; i++) {
            System.out.printf("( %s)%n", args[0].repeat(5));
        }
    }
}