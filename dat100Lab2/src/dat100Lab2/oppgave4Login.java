package dat100Lab2;

import static javax.swing.JOptionPane.*;

public class oppgave4Login {

	public static void main(String[] args) {
		
		String b="Yosafe";
		String p="passord";
	
		String brukernavn = showInputDialog("Brukernavn :");
		String passord = showInputDialog("Passord :");
		if (brukernavn.equals(b) && passord.equals(p)) {
			showMessageDialog(null,"Du har logged inn");
			
		}else {
			showMessageDialog(null,"Fiel");
		}
	}
}