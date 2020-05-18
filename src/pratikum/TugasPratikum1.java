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

public class TugasPratikum1 {
    
    
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bilangan: ");
        
        n = input.nextInt();    
        
        Deret(n);
        
    }
    
    
    private static void Deret(int n)
    {
        int x = 1;
        double total = 0;
        int angka[] = new int[20];
        
        for(int i = 0; i<=n-1; i++){
            x = x + i;
            angka[i] = x;
            
            total += angka[i];
            
            System.out.println(angka[i]);
        }
        
        total = total / n;
        
        System.out.println("Rata-rata N: " + total);
    }
}
