package dat100Lab2;
import static javax.swing.JOptionPane.*;

public class oppgave1PrisOgBel�p {

	public static void main(String[] args) {
		int pris=Integer.parseInt(showInputDialog("vare pris: "));
		int bel�p=Integer.parseInt(showInputDialog("bel�p: "));
		
		int rest10=(bel�p-pris)/10;
		int rest1=(bel�p-pris)%10;
		
		showMessageDialog(null,rest10+" ti kroner og "+rest1+" en kronere ");
	}
}
