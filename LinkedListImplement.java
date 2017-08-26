/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

import java.util.LinkedList;

/**
 *
 * @author DEJI
 */
public class LinkedListImplement {
    public static void main(String[] args){
        LinkedList<String> LList = new LinkedList<String>();
        //adding 4 items to the list
        LList.add("item1");
        LList.add("item2");
        LList.add("item3");
        LList.add("item4");
        //adding elements at terminal positions
        LList.addFirst("First Item");
        LList.addLast("Last Item");
        //removing element at terminal positions
        /*LList.removeFirst();
        LList.removeLast();*/
        //printing list elements;
        for(int i=0; i<LList.toArray().length;i++){
            System.out.println(LList.get(i));
        }
        /*to copy all elements of an already existing array into a new array, use:
        newList.add(existingList);*/
    }
    
}
