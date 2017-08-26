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
public class DuplicateCheck {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,2,5,6,7,3}; //replace with array elements of choice
        try{
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
            System.out.println(arr[i]+" is duplicated");
            }
        }
        }
        }catch(Exception ex){
            
        }
    }
    
}
