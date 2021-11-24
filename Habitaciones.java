/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hotel;

/**
 *
 * @author erikj 
 * Siguiendo los conceptos de TDD, el Hotel Baluartes lo contrata
 * para que usted realice la siguiente aplicación para el cobro de sus
 * habitaciones.Cuentan con 3 tipos de habitación, Junior = $1,000, Double =
 * $1,300 y Suite = $1,500. Y pueden estar 2 personas con este costo, la Junior
 * soporta máximo 3 y la Double soporta hasta 5 personas, si hay más de dos
 * personas en la habitación se incrementa 100 por cada una de las personas
 * adicionales. El costo a pagar depende del tipo de habitación y la cantidad de
 * personas y la cantidad de días a ocupar. Deberá realizar el cálculo del iva =
 * 16% y 2% de impuesto de hospedaje. Siguiendo la metodología TDD, realice al
 * menos 3 checkpoints en su GIT donde siga este proceso. Y realice al menos 2
 * pruebas unitarias por cada tipo de habitación.
 *
 */
public class Habitaciones {
public String redireccion(String tipo, int personas,int dias){
    String valor = "";
    if(tipo.equals("Junior")){
        valor = Junior(personas,dias);
    }else if(tipo.equals("Double")){
       valor = Double(personas,dias);
    }else if(tipo.equals("Suite")){
        valor = Suite(personas,dias);
    }
    return valor;
}
private String Junior(int personas,int dias){
    int subtotal = 1000;
    String resultado = "";
    int total = 0;
    int  iva =16; 
    int extra = 0;
    int hospedaje = 0;
    if(personas>=1&personas<=3){
        if(personas>1){
            extra = personas - 2;
        }
        subtotal = subtotal+(extra*100);
        subtotal = subtotal*dias;
        iva =((1000*16)/100);
        hospedaje = ((1000*2)/100);
        total = iva + hospedaje + subtotal;
        resultado = ""+total;
    }else{
        resultado = "Minimo 1 persona y maximo 3 personas";
        
    }
    return resultado;
}
private String Double(int personas,int dias){
    int subtotal = 1300;
    String resultado = "";
    int total = 0;
    int  iva =16; 
    int hospedaje = 0;
    int extra = 0;
    if(personas>=1&personas<=5){
        if(personas>1){
            extra = personas - 2;
        }
        subtotal = subtotal+(extra*100);
        subtotal = subtotal*dias;
        iva =((1300*16)/100);
        hospedaje = ((1300*2)/100);
        total = iva + hospedaje + subtotal;
        resultado = ""+total;
    }else{
        resultado = "Minimo 1 persona y maximo 5 personas";
        
    }
    return resultado;
}
private String Suite(int personas,int dias){
    int subtotal = 1500;
    String resultado = "";
    int total = 0;
    int  iva =16; 
    int hospedaje = 0;
    int extra = 0;
    if(personas>=1&personas<=5){
        if(personas>1){
            extra = personas - 2;
        }
        subtotal = subtotal+(extra*100);
        subtotal = subtotal*dias;
        iva =((1500*16)/100);
        hospedaje = ((1500*2)/100);
        total = iva + hospedaje + subtotal;
        resultado = ""+total;
    }else{
        resultado = "Minimo 1 persona y maximo 5 personas";
        
    }
    return resultado;
}
}
