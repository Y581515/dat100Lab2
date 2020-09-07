package dat100Lab2;
import static javax.swing.JOptionPane.*;

public class oppgave3AdelBnårBerIkkeNull {

	public static void main(String[] args) {
		double a=Double.parseDouble(showInputDialog("a"));
		double b=Double.parseDouble(showInputDialog("b"));
		
		if (b !=0){
			double div=a/b;
			showMessageDialog(null,div);
		}else{
			showMessageDialog(null,"UDEFINERT!");
		}
	}
}
