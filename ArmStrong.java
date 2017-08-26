/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DEJI
 */
public class ArmStrong {
    public static void main(String[] args){
        //This Algorithm ONLY determines whether a 3-digit number is an armstrong number or not
        int num1, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an armstrong");
        String n= input.nextLine();
        if(n.length()==3){
        i = Integer.decode(n);
        int store=0;
        int original = i;
        for(int j=0;j<n.length();j++){
            num1 = i%10;
            i = i/10;
            int cube = num1*num1*num1;
            store+=cube;
        }
        if(store==original){
            System.out.println("");
            System.out.println("Armstrong");
        }
        else{
            System.out.println("");
            System.out.println("Not ArmStrong");
        }
        }else{
            System.out.println("Algorithm does not support non 3-digit numberss");
        }
    }
    
}
