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
public class RepositorioException extends Exception {
    public RepositorioException(){
        super("Não é possivel adicionar um novo cliente - número maximo de clietes atingido!");
    }
}
