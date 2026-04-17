/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gwenith Zasha Marie
 */
public class MP2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String input = scn.nextLine();  
        
            String[] line = input.split(" ");

                String outlier = scn.nextLine();

                int count = 0;
                int num = 0;

                for(String area : line){
                    if(area.equals(outlier)){
                        count++;
                    }else{
                        num++;
                    }
                }

            System.out.println(count);
            System.out.println(num);
    }
    
}
