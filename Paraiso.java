public class Paraiso {
    public static void main(String[] args) {
        try {
            if (args[0].equalsIgnoreCase("uberaba") || args[0].equalsIgnoreCase("uniube")) {
                System.out.println("Paraiso");
                return;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Execute de novo com uma palavra valida!");
            return;
        }
        System.out.println("Resto do mundo");
    }
}