/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;

/**
 *
 * @author Guilherme
 */
public class TesteContaCorrente {
    public static void main(String[] args){
        ContaCorrente conta1 = new ContaCorrente(1000);
        
        try{
            
            conta1.depositar(500);
            conta1.setValorLimite(2500);
            conta1.sacar(-100);
            
        }
        
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            
        }
        
    }
}
