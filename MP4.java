/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gwenith Zasha Marie
 */
public class MP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int multi = scn.nextInt();
        
        if(multi <= 1){
            System.out.println("INVALID INPUT");
            return;
        }
        
        if(multi > 25){
            System.out.println("EXCEEDS MAXIMUM SIZE");
            return;
        }
        
        for(int i = 1; i <= multi; i++){
            for(int j = 1; j <= multi; j++){
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
    
}
