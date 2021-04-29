/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

/**
 *
 * @author Guilherme
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        String[] listaPalavras = frase.split(" ");

        Map<String, Integer> i = new TreeMap<>();

        for (String palavra : listaPalavras) {
            if (i.containsKey(palavra)){
                
            }
            else{
                i.put(palavra, 0);
                
            }
            i.put(palavra, i.get(palavra) + 1); 
        }
        for(Map.Entry<String, Integer> entry : i.entrySet()){
            System.out.println(entry.getKey()+ " - " + entry.getValue()+ " vez(es)");
        }

        

    }
}