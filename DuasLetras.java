public class DuasLetras {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        if (args[0].equalsIgnoreCase("xw") || args[0].equalsIgnoreCase("yw")) {
            System.out.println("POO");
        } 
        else if ((args[0].equalsIgnoreCase("x") || args[0].equalsIgnoreCase("y")) && args[1].equalsIgnoreCase("w")) {
            System.out.println("POO");
        } 
        else {
            System.out.println("FUI");
        }
    }
}