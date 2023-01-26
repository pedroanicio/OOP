/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta;

/**
 *
 * @author pedro
 */
public class contaCorrente {
    private String nome, endereco;
    private long cpf, rg;
    private double renda;
    private int agencia;
    private int codigo;

    public contaCorrente(String nome, String endereco, long cpf, long rg, double renda, int agencia) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.renda = renda;
        this.agencia = agencia;
        mostrar();
    }

    
    public contaCorrente(String nome, String endereco, long cpf, long rg, double renda, int agencia, int codigo) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.renda = renda;
        this.agencia = agencia;
        this.codigo = codigo;
        this.mostrar();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "contaCorrente{" + "nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", rg=" + rg + ", renda=" + renda + ", agencia=" + agencia + ", codigo=" + codigo + '}';
    }
    
    public void mostrar(){
        System.out.println("conta Corrente{" + "nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", rg=" + rg + ", renda=" + renda + ", agencia=" + agencia + ", codigo=" + codigo + '}');
    }
    
    

    
    
}
