/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

/**
 *
 * @author DEJI
 */
public class ThirdFromLast {
    public static void  main(String[] args){
        int[] arr = {1,2,3,4,5,7,2,3};
        int storeNum = 0;
        //using Java predefined method
        System.out.println(arr[arr.length-3]+"gotten using predefined method");
        //implementing using Single Iteration
        for(int i=0;i<arr.length;i++){
            if(i>=2){
            storeNum = arr[i-2];
            }
        }
        System.out.println(storeNum+"gotten using single iteration");
    }
}
