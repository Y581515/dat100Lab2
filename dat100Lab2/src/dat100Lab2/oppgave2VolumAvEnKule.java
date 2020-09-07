package dat100Lab2;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;

public class oppgave2VolumAvEnKule {

	public static void main(String[] args) {
		
		double kuleVolum=((double)4/(double)3)*PI*
				pow((Double.parseDouble(showInputDialog("sett inn radius"))),3);
		
		showMessageDialog(null,"kulevolum: "+kuleVolum);
	
	}
}
