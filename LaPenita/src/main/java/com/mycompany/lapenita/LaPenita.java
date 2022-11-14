package com.mycompany.lapenita;


import MultipliClass.Multiplicacion;
import PromeClass.Promedio;
import SumaClass.Sumatoria;
import javax.swing.JOptionPane;

/**
 *
 * @Juan Felipe Delgadillo Vanegas
 */


public class LaPenita {
    
    public static void main(String[] args) {
    /*Asignar variable de las opciones*/
    int Op_principal;
    /*Para mostrar la información*/
    JOptionPane.showMessageDialog(null,"-----------Bienvanido-------------\n--------Lacteos la Peñita---------");
    /*Para tomar los datos y guardarlos en una variable*/
    Op_principal = Integer.parseInt(JOptionPane.showInputDialog("Escoge la opción que quieres realizar:\n(1)Para realizar sumas\n(2)Para realizar Multiplicaciones \n(3)Promedio de tu compra"));
    /*Declaración de las clases y creación del objeto*/
    Sumatoria sumatoria = new Sumatoria();
    Multiplicacion multiplicacion = new Multiplicacion();
    Promedio promedio = new Promedio();
    switch (Op_principal){
        case 1: 
            /*creación del objeto*/
            sumatoria.sumatoriaProceso();
            break;
        case 2:
            multiplicacion.Multi();
            break;
        case 3:
            promedio.Avg();
        default:
            JOptionPane.showMessageDialog(null,"no hay opción");
    }
    }
}