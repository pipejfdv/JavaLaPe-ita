
package MultipliClass;

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
public class Multiplicacion {
    
    public static void Multi(){
        int CremaLecheInt = (int) CremaLeche;
        int LecheDeslactosaInt = (int) LecheDeslactosa;
        Resultado = LecheEntera * LecheDeslactosaInt * CremaLecheInt * Arequipe * Yogurt;
        JOptionPane.showMessageDialog(null,"Este es el resultado " + Resultado);
        
    }
}
