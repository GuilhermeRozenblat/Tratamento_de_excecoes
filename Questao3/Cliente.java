/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

/**
 *
 * @author Guilherme
 */

public class Cliente {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws DadoInvalidoException{
        
        if(cpf.length() == 11){
            this.cpf = cpf;
        }
        else{
            throw new DadoInvalidoException("CPF invalido, não possui 11 digitos");
        }
        
    }
    
    
}
