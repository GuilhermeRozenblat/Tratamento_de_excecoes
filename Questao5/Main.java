/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 *
 * @author Guilherme
 */

public class Main {
     public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("oi");
        arrayList.add("ola");
        arrayList.add("tudo bem");
        
        String arraylist = arrayList.toString();
        HashSet<String> hashSet = new HashSet<>(arrayList);
        String hashset = hashSet.toString();
        
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(hashSet);
        String priorityqueue = priorityQueue.toString();
                
        ArrayDeque<String> arrayDeque = new ArrayDeque<>(priorityQueue);
        String arraydeque = arrayDeque.toString();
        
        TreeSet<String> treeSet = new TreeSet<>(arrayDeque);
        String treeset = treeSet.toString();
        
        System.out.println(arraylist);
        System.out.println(hashset);   
        System.out.println(priorityqueue);
        System.out.println(arraydeque);
        System.out.println(treeset);
        
        //A ordenaçao é feita de forma diferenete em cada tipo de Collection
    }
}
