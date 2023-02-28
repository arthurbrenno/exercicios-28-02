// RA: 5157519 .
public class TresLetras {
    public static void main(String[] args) {
        if (args.length == 0 || args.length == 1 || args.length == 2) {
            return;
        }

        System.out.println(
        args[0].equalsIgnoreCase("k") ||
        args[1].equalsIgnoreCase("r") ||
        args[2].equalsIgnoreCase("v") ? 
        "PINDAMOIANGABA" : "BOROGODO");
    }
    
}
