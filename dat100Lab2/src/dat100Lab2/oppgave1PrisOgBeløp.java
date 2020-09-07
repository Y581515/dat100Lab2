package dat100Lab2;
import static javax.swing.JOptionPane.*;

public class oppgave1PrisOgBeløp {

	public static void main(String[] args) {
		int pris=Integer.parseInt(showInputDialog("vare pris: "));
		int beløp=Integer.parseInt(showInputDialog("beløp: "));
		
		int rest10=(beløp-pris)/10;
		int rest1=(beløp-pris)%10;
		
		showMessageDialog(null,rest10+" ti kroner og "+rest1+" en kronere ");
	}
}
