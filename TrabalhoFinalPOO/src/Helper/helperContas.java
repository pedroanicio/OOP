/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.util.ArrayList;
import conta.contaCorrente;
import conta.contaPoupanca;
import javax.swing.JOptionPane;
import view.contacorrenteView;



/**
 *
 * @author pedro
 */
public class helperContas {
    private contacorrenteView contacorrenteview;
    int codigo = 0;
    private ArrayList listaConta;
    private ArrayList listaPoup = new ArrayList();
    private ArrayList listaCorr = new ArrayList();
    
    private static helperContas instance;
    
    private helperContas(){
        listaConta = new ArrayList();
    }
    
    public static synchronized helperContas getInstance(){
        if(instance==null){
            instance = new helperContas();
        }
        
        return instance;
    }
    
    public ArrayList getListaAgencia(){
            return listaConta;
    }
    public int soma(){
        codigo++;
        return codigo;
    }
    public int subt(){
        codigo--;
        return codigo;
    }
    public void addContaCorrente(contaCorrente conta1){
        listaConta.add(conta1);
        listaCorr.add(conta1);
    }
    public void addContaPoupanca(contaPoupanca conta2){
        listaConta.add(conta2);
        listaPoup.add(conta2);
    }

    public int excluirCorrente(int Codigo){
    contaCorrente temp = null;
    int qtdeR=0;
    for(int i = 0; i<listaCorr.size(); i++){
        temp = (contaCorrente) listaCorr.get(i);
        if(Codigo == temp.getCodigo()){
            listaConta.remove(i);
            qtdeR++;
        }
    }
    return qtdeR;
    }
    
    public int excluirPoupanca(int Codigo){
    contaPoupanca temp = null;
    int qtdeR=0;
    for(int i = 0; i<listaPoup.size(); i++){
        temp = (contaPoupanca) listaPoup.get(i);
        if(Codigo == temp.getCodigo()){
            listaConta.remove(i);
            qtdeR++;
        }
    }
    return qtdeR;
    }
    
    public contaCorrente pesquisarCorrente(int codigo){
            contaCorrente temp = null;
            for(int i = 0; i<listaCorr.size(); i++){
                temp = (contaCorrente) listaCorr.get(i);
                if(codigo == temp.getCodigo()){
                    return temp;
                }
            }
            return null;
        }
    
    public contaPoupanca pesquisarPoupanca(int codigo){
            contaPoupanca temp = null;
            for(int i = 0; i<listaPoup.size(); i++){
                temp = (contaPoupanca) listaPoup.get(i);
                if(codigo == temp.getCodigo()){
                    return temp;
                }
            }
            return null;
        }
    
    
    
    public int alterarCorrente(contaCorrente contacorrente){
            contaCorrente temp = null;
            int totalObjetos = 0;
            for(int i = 0; i<listaCorr.size(); i++){
                temp = (contaCorrente) listaCorr.get(i);
                if(temp.getCodigo() == contacorrente.getCodigo()){
                    temp.setNome(contacorrente.getNome());
                    temp.setEndereco(contacorrente.getEndereco());
                    temp.setCpf(contacorrente.getCpf());
                    temp.setRg(contacorrente.getRg());
                    temp.setRenda(contacorrente.getRenda());                   
                    totalObjetos++;
                }
            }
            return totalObjetos;
        }
    
    public int alterarPoupanca(contaPoupanca contapoupanca){
            contaPoupanca temp = null;
            int totalObjetos = 0;
            for(int i = 0; i<listaPoup.size(); i++){
                temp = (contaPoupanca) listaPoup.get(i);
                if(temp.getCodigo() == contapoupanca.getCodigo()){
                    temp.setNome(contapoupanca.getNome());
                    temp.setCpf(contapoupanca.getCpf());
                    temp.setRenda(contapoupanca.getRenda());                   
                    totalObjetos++;
                }
            }
            return totalObjetos;
        }
    
    
    
    public void listarContasCorrent(int agencia) {
        contaCorrente p = null;
        System.out.println("Contas: ");
        for (int i = 0; i < listaCorr.size(); i++) {
            p = (contaCorrente) listaCorr.get(i);
            if(agencia == (Integer)p.getAgencia()){
                System.out.println(p);
            }
            
        }
        System.out.println("fim.");
    }
    
    public void listarContasPoup(int agencia) {
        contaPoupanca p = null;
        System.out.println("Contas: ");
        for (int i = 0; i < listaPoup.size(); i++) {
            p = (contaPoupanca) listaPoup.get(i);
            if(agencia == (Integer)p.getAgencia()){
                System.out.println(p);
            }
            
        }
        System.out.println("fim.");
    }
}
