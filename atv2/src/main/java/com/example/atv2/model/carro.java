package com.example.atv2.model;

/**
 * carro
 */
public class carro {

    private int id;    
    private int year;
    private double value;
    private String model;
    private String board;
    private String color;

    public carro(int id, double value, String color, String model,int year,String board) {
        this.id = id;
        this.model = model;
        this.value = value;
        this.year = year;
        this.board = board;
        this.color = color;
    }

    @Override
    public String toString() {
        return 
           "\t> Carro numero " + id +
        ";\n\t> Modelo: " + model + 
        ";\n\t> Valor: R$" + value +
        ";\n\t> Ano:  "+ year + 
        ";\n\t> Placa:  " + board +
        ";\n\t> Cor: " + color;
    }
}