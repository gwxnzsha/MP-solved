/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gwenith Zasha Marie
 */
public class MP14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int net = scn.nextInt();
        
        int sum = 0;
        int ave;
        
        for(int i = 0; i < net; i++){
            net = scn.nextInt();
            sum+=net;
        }
        ave = sum / net;
        
        for(int i = 0; i < net; i++){
            if(net >= 85){
                System.out.println("FAST");
            }else if(net < 85){
                System.out.println("SLOW");
            }
        }

        System.out.println(ave);
        if(ave >= 85){
                System.out.println("FAST");
            }else if(ave < 85){
                System.out.println("SLOW");
            }
        
        
    }
    
}
