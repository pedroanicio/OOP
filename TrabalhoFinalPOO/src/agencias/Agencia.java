/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencias;

import conta.contaCorrente;
import conta.contaPoupanca;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Agencia {

    private int codigo;
    private String descricao;
    private ArrayList agencia;

    public Agencia(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        agencia = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Integer> getAgencia() {
        return agencia;
    }

    public void setAgencia(ArrayList<Integer> agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "agencia{" + "codigo=" + codigo + ", descricao=" + descricao + ", agencia=" + agencia + '}';
    }

    public int addCorrente(contaCorrente conta) {
        agencia.add(conta);
        return 1;
    }
    public int addPoupanca(contaPoupanca conta) {
        agencia.add(conta);
        return 1;
    }
    

    public void listarContas() {
        contaCorrente p = null;
        System.out.println("Contas: ");
        for (int i = 0; i < agencia.size(); i++) {
            p = (contaCorrente) agencia.get(i);
            System.out.println(p);
        }
        System.out.println("fim.");
    }

}
