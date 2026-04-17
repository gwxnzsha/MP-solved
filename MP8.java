/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gwenith Zasha Marie
 */
public class MP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        
        int [] cand = new int[5];
        
        for(int i = 0; i < 20; i++){
            System.out.print("#" + (i +1) + " Vote [1-5]: ");
            int voter = scn.nextInt();
            
            if(voter >= 1 && voter <= 5){
                cand[voter - 1]++;
            }else{
                System.out.println("Invalid");
                i--;
            }
            
        }
        
        System.out.println("\nTotal Votes: ");
        for(int i = 0; i < 5; i++){
            System.out.println("Candidate " + (i + 1) + ": " + cand[i]);
            
        }
        
        int winner = 0;
        int highest = 0;
        boolean tie = false;
        
        for(int i =0; i < 5; i++){
            if(cand[i] > highest) {
                highest = cand[i];
                winner = i + 1;
                tie = false;
            }else if (cand[i] == highest) tie = true;            
     
    }
         if(tie == false) {
             System.out.println("\n Winner: " + winner );
         }else if (tie) {
                System.out.println("\nTie detected");
            } 

        scn.close();
        
        
        
    }
    
}
