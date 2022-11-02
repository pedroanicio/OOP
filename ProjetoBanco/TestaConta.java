/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoBanco;

/**
 *
 * @author 0072383
 */
public class TestaConta
{
  public static void main(String args[])
  {
	   Conta c1 = new Conta(1, "José", 500);
	   c1.imprimeDadosConta();
	   
	   c1.debito(12222);
	   c1.imprimeDadosConta();
	   
	   Conta c2 = new Conta(2, "Marcos", 1500);
	   c2.imprimeDadosConta();
	   
	   c2.debito(12222);
	   c2.imprimeDadosConta();	   
	   
	   Conta c3 = new Conta(3, "Maria", 1500);
	   c3.imprimeDadosConta();
	   
	   c3.debito(12222);
	   c3.imprimeDadosConta();	   

  }
}
  