/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Gwenith Zasha Marie
 */
public class MP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();

        if (budget <= 10) {
            System.out.println("Invalid");
            return; 
        }

        int itemsBought = 0;

        while (true) {
            double price = scanner.nextDouble();

            if (price == 0) {
                break;
            }

            if (price < 0) {
                continue;
            }

            if (price >= budget) {
                break;
            }

            budget -= price;
            itemsBought++;
        }

        System.out.println(itemsBought);
        System.out.println((int) budget);        
    
    }
    
}
