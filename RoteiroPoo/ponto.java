/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RoteiroPoo;

/**
 *
 * @author pedro
 */
public class ponto {

    private double x;
    private double y;
    private String descricao;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ponto(double x, double y, String descricao) {
        this.x = x;
        this.y = y;
        this.descricao = descricao;
        descricao = "px";
        System.out.println("Atributos x e y foram inicializados." + this.x + " " + this.y);
    }

    public ponto(double y, String descricao) {
        this.y = y;
        this.descricao = descricao;
    }

    public ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ponto(double x) {
        this.x = x;
    }

    public ponto() {
    }

    @Override
    public String toString() {
        return "ponto{" + "x=" + x + ", y=" + y + ", descricao=" + descricao + '}';
    }

    public void incrementarCoordenadas(double deltaX, double deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }

    public void imprimirCoordenadas() {
        System.out.println("(x,y) = " + "(" + x + "," + y + ")");
    }

    public void zerarCoordenadas() {
        x = 0;
        y = 0;
    }

}
