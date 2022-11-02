/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RoteiroPoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class testPonto {

    public static void main(String[] args) {
//        System.out.println("Início do programa");
//        
//        ponto p1 = new ponto(1,5);
//        
//        p1.imprimirCoordenadas();
//        p1.incrementarCoordenadas(4, 3);
//        p1.imprimirCoordenadas();
//        int w = p1.getX();
//        System.out.println(w);
//        p1.setX(3);
//        
//        
//        p1.imprimirCoordenadas();
//        p1.incrementarCoordenadas(5, 2);
//        p1.zerarCoordenadas();
//        p1.imprimirCoordenadas();
//        
//        ponto p2 = new ponto(4);
//        p2.imprimirCoordenadas();
//        p2.incrementarCoordenadas(6, 9);
//        
//        ponto p3 = new ponto(0,4);
//        p3.imprimirCoordenadas();
//        
//        ponto p4 = new ponto();
//        p4.imprimirCoordenadas();
//        
//        
//        ponto p5 = new ponto(10,20);
//        ponto p6 = new ponto(5,8);
//        p5.incrementarCoordenadas(2, 3);
//        p5.imprimirCoordenadas();
//        System.out.println(p5); //toString
//        

        String text = null;
        double x, y;
        ponto p1 = null;
        String descricao = null;
        ArrayList listaPontos = new ArrayList();

        do {
            descricao = JOptionPane.showInputDialog("Digite o valor da descrição: ");

            text = JOptionPane.showInputDialog("Digite o valor de X: ");
            x = Double.parseDouble(text);
            if (x < 0) {
                break;
            }
            text = JOptionPane.showInputDialog("Digite o valor de y: ");
            y = Double.parseDouble(text);
            if (y < 0) {
                break;
            }

            p1 = new ponto(x, y, descricao);
            if (p1 != null) {
                listaPontos.add(p1);
                System.out.println("p1.size = " + listaPontos.size());
            }
            JOptionPane.showMessageDialog(null, "ponto p " + p1);

            //JOptionPane.showMessageDialog(null, descricao + " x = " + x + " y = " + y);
        } while ((x >= 0) && (y >= 0));
        ponto temp = null;
        for (int i = 0; i < listaPontos.size(); i++) {
            temp = (ponto) listaPontos.get(i);
            JOptionPane.showMessageDialog(null, "objeto " + (i + 1) + "=" + temp);

        }

        JOptionPane.showMessageDialog(null, "fim do programa");
    }
}
