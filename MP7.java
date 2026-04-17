/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gwenith Zasha Marie
 */
public class MP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int [] num = new int [15];
        
        for(int i = 0; i < num.length; i++){
            System.out.println("Input #" + (i + 1) + ": ");
            num[i] = scn.nextInt();
        }
        
        int odd = 0, even = 0, neg = 0, pos = 0;
        
        for(int i = 0; i < num.length;i++){
            
        if(num[i] == 0) continue; 
        
        if (num [i] % 2 == 0)even++;

        if (num [i] % 2 != 0) odd++;
        
        if (num[i] < 0) neg++;
        
        if (num[i] > 0) pos++;
        
        
        
     
         }
        
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
        System.out.println("Negative: " + neg);
        System.out.println("Positive: " + pos);

    }
    
}
