/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Gwenith Zasha Marie
 */
public class MP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         int n = 5; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" "); 

            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" "); 

            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
