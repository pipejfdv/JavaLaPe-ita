package PromeClass;

import static SumaClass.Sumatoria.Arequipe;
import static SumaClass.Sumatoria.CremaLeche;
import static SumaClass.Sumatoria.LecheDeslactosa;
import static SumaClass.Sumatoria.LecheEntera;
import static SumaClass.Sumatoria.Resultado;
import static SumaClass.Sumatoria.Yogurt;
import javax.swing.JOptionPane;

/**
 *
 * @Juan Felipe Delgadillo Vanegas
 */
public class Promedio {
        public static void Avg(){
        int CremaLecheInt = (int) CremaLeche;
        int LecheDeslactosaInt = (int) LecheDeslactosa;
        Resultado = (LecheEntera * LecheDeslactosaInt * CremaLecheInt * Arequipe * Yogurt)/5;
        JOptionPane.showMessageDialog(null,"Este es el promedio " + Resultado);
        }
}
