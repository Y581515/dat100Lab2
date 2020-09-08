package dat100Lab2;
import static javax.swing.JOptionPane.*;

public class oppgave6Skat {

	public static void main(String[] args) {
		double a=Integer.parseInt(showInputDialog("enter first number: "));
		
		if (a<=164100) {
			showMessageDialog(null,"din skat trinn: 0%");
		}else if (164100>a && a<=230950) {
			showMessageDialog(null,"din skat trinn: 0,93%");
		}else if (230950>a && a<=580650) {
			showMessageDialog(null,"din skat trinn: 2,41%");
		}else if (580650>a && a<=934050) {
			showMessageDialog(null,"din skat trinn: 11,52%");
		}else if (934050<a) {
			showMessageDialog(null,"din skat trinn: 14,52%");
		}
	}
}
