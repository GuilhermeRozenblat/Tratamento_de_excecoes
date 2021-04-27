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
public class Main {
    public static void main(String[] args){
        
        try{
            Cliente cliente1 = new Cliente();
            cliente1.setCpf("145678901112");
            
        }
        catch(DadoInvalidoException e){
            System.out.println(e.getMessage());  
        }
        
        try{

            CadastroCliente listaClientes = new CadastroCliente();
            
            Cliente cliente2 = new Cliente();
            cliente2.setCpf("22222222222");
            listaClientes.inserir(cliente2);
            
            Cliente cliente3 = new Cliente();
            cliente3.setCpf("22222222222");
            listaClientes.inserir(cliente3);
            
            listaClientes.printar();
            
            listaClientes.buscar("44444444444");
           

        }
        catch(DadoInvalidoException | RepositorioException | ClienteJaExistenteException | ClienteInexistenteException e){
             System.out.println(e.getMessage());
        }
                
              
        
    }
}



