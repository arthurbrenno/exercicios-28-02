import java.util.Scanner;

public class Vogal {
    public static void main(String[] args) {
        if ("aeiou".contains(args[0].toUpperCase())) {
            System.out.println("Vogal");
        }
    }
}