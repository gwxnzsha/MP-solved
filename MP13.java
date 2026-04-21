/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gwenith Zasha Marie
 */
public class MP13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char [] vowel = {'a', 'e', 'i', 'o', 'u'};
        
        String line = scn.nextLine().toLowerCase();
        
        int output = 0;
        
        for(int i = 0; i < line.length(); i++){
            char count = line.charAt(i);
            
            for(char v : vowel){
                if(count == v){
                    output++;
                    break;
                }
            }
        }
        System.out.println(output);
       
    }
    
}
