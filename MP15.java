/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gwenith Zasha Marie
 */
public class MP15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String inp = scn.nextLine();
        String rev = new StringBuilder(inp).reverse().toString();
        
        if(inp.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        
        scn.close();
    }
    
}
