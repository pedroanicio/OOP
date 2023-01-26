/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;


import conta.contaCorrente;
import java.util.ArrayList;
import agencias.Agencia;
/**
 *
 * @author pedro
 */
public class helperAgencia {
    private ArrayList listaAgencia;
    
    private static helperAgencia instance;
    
    private helperAgencia() {
            listaAgencia = new ArrayList();
    }
    
    public static synchronized helperAgencia getInstance() {
		if (instance == null){
			instance = new helperAgencia();
                }

		return instance;
	}
    
    /**
         * Adicionar uma agencia ao helper
         * @param conjunto a ser adicionado
         */
    
    public void addAgencia(Agencia agencia){
        listaAgencia.add(agencia);
        
    }
    
            /**
         * Excluir uma agencia pelo código
         * @param codigoConjunto
         * @return 
         */
    public int excluir(int codigoAgencia){
        Agencia temp = null;
        int qtdeR=0;
        for(int i = 0; i<listaAgencia.size(); i++){
            temp = (Agencia)listaAgencia.get(i);
            if( codigoAgencia == temp.getCodigo()){
                listaAgencia.remove(i);
                qtdeR++;
            }
        }
    return qtdeR;
    }
    
         /**
         * Retornar o objeto pesquisado
         * @param codigoConjunto
         * @return 
         */
    public int pesquisar(int codigoAgencia){
        Agencia temp = null;
        for(int i = 0; i<listaAgencia.size(); i++){
            temp = (Agencia) listaAgencia.get(i);
            if(codigoAgencia == temp.getCodigo()){
                return temp.getCodigo();
            }
        }
        return 0;
    }
    
    public int alterar(Agencia agencia){
        Agencia temp = null;
        int totalObjetos = 0;
        for(int i = 0; i<listaAgencia.size(); i++){
            temp = (Agencia) listaAgencia.get(i);
            if(temp.getCodigo()==agencia.getCodigo()){
                temp.setDescricao(agencia.getDescricao());
                totalObjetos++;
            }
        }
        return totalObjetos;
    }
    
    public void imprimirAgencias(){
        System.out.println(listaAgencia);        
    }
    
    public void imprimir(){
        Agencia temp = null;
        for(int i = 0; i<listaAgencia.size(); i++){
            System.out.println(listaAgencia);
        }
    }
       
}