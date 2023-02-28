public class MultiplosDeQuatro {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 8; i <= 124; i+=4) { // (30 * 4 = 120)
            System.out.printf("[%d] - %d%n",++j,i); 
        }
        
        System.out.println("<<OU>>\n\n");

        j = 1;
        for (int i = 5; j <= 30; i++) {
            if (i % 4 == 0) {
                System.out.printf("[%d] - %d%n",j, i);
                j++;
            }
        }
    }
}