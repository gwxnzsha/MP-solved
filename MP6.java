/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Gwenith Zasha Marie
 */
public class MP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner (System.in);
        
       int [] grades = new int[10];
       
       int sum = 0;
       int highest;
       int lowest;
       int passed = 0;
       
       for(int i = 0; i < 10; i++){
           System.out.println("Input student #" + (i + 1) + " grades: ");
           grades[i] = scn.nextInt();
           
       }
       
       highest = grades[0];
       lowest = grades[0];
       
       for(int i = 0; i < 10; i++){
           sum += grades[i];
           
           if(grades[i] > highest){
               highest = grades[i];
           }
           
           if(grades[i] < lowest){
               lowest = grades[i];
           }
           
           if(grades[i] >= 75){
               passed++;
           }
       }
       
        double average = (double) sum / 10;
       
        System.out.println("\nAverage: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Passed: " + passed);
        
    }
    
}
