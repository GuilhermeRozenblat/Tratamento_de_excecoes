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
public class ContaCorrente {
    private float limite = 10000;
    private float saldo;
    private float valorLimite;

    public ContaCorrente(float saldo) {
        this.saldo = saldo;
    }
   
    public void sacar(float valor) throws IllegalArgumentException{
        if (valor <= 0){
            throw new IllegalArgumentException("Não é possivel sacar valores negativos");
        }
        if (valor > saldo){
            throw new IllegalArgumentException("Não existe saldo suficiente para o saque");
        }
        if (valor > valorLimite){
            throw new IllegalArgumentException("Valor maior que o limite determinado");
        }
        else{
            saldo = saldo - valor;
            System.out.println("Valor sacado: " + valor );
            System.out.println("Novo Saldo: " + saldo );
        }
    }
    public void depositar(float valor) throws IllegalArgumentException{
        if (valor <= 0){
            throw new IllegalArgumentException("Não é possivel depositar valores negativos");
        }  
        else{
            saldo = saldo + valor;
            System.out.println("Valor depositado: " + valor );
            System.out.println("Novo Saldo: " + saldo );
        }
    }
        
    public void setValorLimite(float valor) throws IllegalArgumentException{
        if (valor < 0){
            throw new IllegalArgumentException("Valores negativos não sao permitidos");
        }
        if (valor > limite){
            throw new IllegalArgumentException("Valor maior que o limite permitido pelo banco");
        }
        else{
            valorLimite = valor;
            System.out.println("Novo valor limite: " + valorLimite);
            
        }
            
    }

}
