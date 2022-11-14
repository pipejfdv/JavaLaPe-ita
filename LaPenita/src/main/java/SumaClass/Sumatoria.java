
package SumaClass;

import com.mycompany.lapenita.LaPenita;
import javax.swing.JOptionPane;

/**
 *
 * @Juan Felipe Delgadillo Vanegas
 */
public class Sumatoria {
    /*valor de productos*/
    public static int LecheEntera = 2500;
    public static double LecheDeslactosa = 2990.9;
    public static double CremaLeche = 1990.9;
    public static int Arequipe = 2000;
    public static int Yogurt = 1150;
    public static int cantidad;
    public static int Resultado;
    public static void sumatoriaProceso(){
    
        int OpSuma;
        LaPenita lapenita = new LaPenita();
        OpSuma = Integer.parseInt(JOptionPane.showInputDialog("Que productos deseas sumar\nSelecciona uno de ellos\n(1)Leche entera\n(2)Leche deslactosada\n(3)Crema de leche\n(4)Arequipe\n(5)Yogurt\n(6)Sumar todos los productos"));
        switch (OpSuma){
            case 1: SumaLecheEntera();
            break;
            case 2: SumaLecheDeslac();
            break;
            case 3: SumaCrema();
            break;
            case 4: SumaArequipe();
            break;
            case 5: SumaYogurt();
            break;
            case 6: SumaTotal();
            default:JOptionPane.showMessageDialog(null,"No existe esa opción");
                sumatoriaProceso();
        }
}
    
    public static void SumaLecheEntera(){
        JOptionPane.showMessageDialog(null,"La leche entera tiene un costo de " + LecheEntera);
        /*Cuantas cantidad quiere el granjero*/
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantadad cantidades quieres"));
        Resultado = LecheEntera * cantidad;
        JOptionPane.showMessageDialog(null,"Esto te costaria: " + Resultado);
    }


    public static void SumaLecheDeslac(){
        JOptionPane.showMessageDialog(null,"La leche deslactosada tiene un costo de " + LecheDeslactosa);
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantadad cantidades quieres"));
        /*convertir double en entera para la operación*/
        int LecheDeslactosaInt = (int) LecheDeslactosa;
        Resultado = LecheDeslactosaInt * cantidad;
        JOptionPane.showMessageDialog(null,"Esto te costaria: " + Resultado);
}

    public static void SumaCrema(){
        JOptionPane.showMessageDialog(null,"La leche deslactosada tiene un costo de " + CremaLeche);
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantadad cantidades quieres"));
        int CremaLecheInt = (int) CremaLeche;
        Resultado = CremaLecheInt * cantidad;
        JOptionPane.showMessageDialog(null,"Esto te costaria: " + Resultado);
    }
    public static void SumaArequipe(){
        JOptionPane.showMessageDialog(null,"La leche deslactosada tiene un costo de " + Arequipe);
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantadad cantidades quieres"));
        Resultado = Arequipe * cantidad;
        JOptionPane.showMessageDialog(null,"Esto te costaria: " + Resultado);
    }
    public static void SumaYogurt(){
        JOptionPane.showMessageDialog(null,"La leche deslactosada tiene un costo de " + Yogurt);
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantadad cantidades quieres"));
        Resultado = Yogurt * cantidad;
        JOptionPane.showMessageDialog(null,"Esto te costaria: " + Resultado);
    }
    public static void SumaTotal(){
        int CremaLecheInt = (int) CremaLeche;
        int LecheDeslactosaInt = (int) LecheDeslactosa;
        Resultado = LecheEntera + LecheDeslactosaInt + CremaLecheInt + Arequipe + Yogurt;
        JOptionPane.showMessageDialog(null,"La suma total de todos los productos es: " + Resultado);
    }
}