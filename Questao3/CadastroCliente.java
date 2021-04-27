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
import java.util.ArrayList;

public class CadastroCliente {
    
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private int totalClientes = 0;
    
    public CadastroCliente(){   
        this.totalClientes = 0;
        this.listaClientes = new ArrayList<>();
        
    }
    public void inserir(Cliente cliente) throws RepositorioException, ClienteJaExistenteException{
       
        if (totalClientes == 0){
            listaClientes.add(cliente);
            totalClientes = totalClientes + 1;
        }
        else{
            if(totalClientes > 10){
                throw new RepositorioException();
            } 
            else{
                for (int i = 0; i < totalClientes; i++){
                    if(listaClientes.get(i).getCpf().equals(cliente.getCpf())){
                       
                    }
                    else{
                        listaClientes.add(cliente);
                        totalClientes +=1;
                    }      
                }
            }     
        
        } 
    }
    
    public void printar(){
        for(int i = 0; i < totalClientes; i++){
            System.out.println(listaClientes.get(i).getCpf());
        }
    }
    
    public void buscar(String cpf) throws ClienteInexistenteException, ClienteJaExistenteException{
        for (int i = 0; i < listaClientes.size(); i++){
            if(cpf.equals(listaClientes.get(i).getCpf())){
                throw new ClienteJaExistenteException("Cliente ja cadastrado");
            }
            else{
                throw new ClienteInexistenteException("Cliente inexistente");
            }
                
        }
    }
}
