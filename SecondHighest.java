/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

import java.util.Scanner;
import static nestlab.SimpleArraySort.bool;

/**
 *
 * @author DEJI
 */
public class SecondHighest {
    static boolean bool = true;
    static int t = 0;
    static int[] sorted;
    public static void main(String[] args){
        int arr[] = new int[]{10, 20, 5, 6, 30, 1, 2}; 
        int max=0;
        int max2=0;
        for(int i=0;i<arr.length;i++){
        if (arr[i] > max) {
            max2 = max;
            max = arr[i];
        }
        else if (arr[i] > max2){
            max2 = arr[i];
        }
    }
        System.out.println(max2);
}
    
    
}
