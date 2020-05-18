/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum;

import java.util.Scanner;

/**
 *
 * @author shob
 */
public class TugasPratikum2 { 
   
    public static void main(String[] args)
    {
        String kalimat = " ";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kalimat: ");

        kalimat = input.nextLine();
        
        ConvertString(kalimat);
        
    }
    
    public static void ConvertString(String kalimat)
    {
        String text[] = kalimat.split(" ");
        
        System.out.println("---Hasil---");
        
        for(String result : text){
            System.out.println(result.toUpperCase()+" = "+ result.length());
        }
    }
    
}
