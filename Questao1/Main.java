/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

/**
 *
 * @author Guilherme
 */
public class Main {
    public static void main(String[] args){
        
        try{
            
        }
        catch(NumberFormatException ex){
            System.out.println("Uma aplicaçao tentou converter uma string para um tipo númerico, mas a string nao está no formato apropriado");
            System.out.println(ex.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println("Um método recebeu um argumento ilegal ou impróprio");
            System.out.println(e.getMessage());
        }
    }
    
}
