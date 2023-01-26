/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta;

/**
 *
 * @author pedro
 */
public class contaPoupanca {
    private String nome;
    private long cpf;
    private double renda;
    private int agencia;
    private int codigo;

    public contaPoupanca(String nome, long cpf, double renda, int agencia, int codigo) {
        this.nome = nome;
        this.cpf = cpf;
        this.renda = renda;
        this.agencia = agencia;
        this.codigo = codigo;
        mostrar();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "contaPoupanca{" + "nome=" + nome + ", cpf=" + cpf + ", renda=" + renda + ", agencia=" + agencia + ", codigo=" + codigo + '}';
    }
    
    public void mostrar(){
        System.out.println("conta Poupança{" + "nome=" + nome + ", cpf=" + cpf + "renda=" + renda + ", agencia=" + agencia + ", codigo=" + codigo + '}');
    }
    
    
    
}
