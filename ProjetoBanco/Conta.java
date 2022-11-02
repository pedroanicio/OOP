/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoBanco;

/**
 *
 * @author 0072383
 */
public class Conta {
    private int codigo;
    private String nome;
    private double saldo;

    public Conta(int codigo, String nome, double saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "codigo=" + codigo + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
    public void debito(double deb){
        saldo = saldo+deb;
        System.out.println("Novo saldo: "+saldo);
    }
    public void imprimeDadosConta(){
        System.out.println("Codigo: "+codigo);
        System.out.println("Nome: "+nome);
        System.out.println("Saldo: "+saldo);
    }
    
    
}
