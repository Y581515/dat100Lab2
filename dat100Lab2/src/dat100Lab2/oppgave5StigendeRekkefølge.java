package dat100Lab2;
import static javax.swing.JOptionPane.*;

public class oppgave5StigendeRekkefølge {

	public static void main(String[] args) {
		int a=Integer.parseInt(showInputDialog("enter first number: "));
		int b=Integer.parseInt(showInputDialog("enter second number: "));
		int c=Integer.parseInt(showInputDialog("enter third number: "));
		
		if (a<b && b<c) {
		showMessageDialog(null,a+" "+b+" "+c);
		}if (b<a && a<c) {
			showMessageDialog(null,b+" "+a+" "+c);
		}if (c<a && a<b) {
		    showMessageDialog(null,c+" "+a+" "+b);
		}if (a<c && c<b) {
		showMessageDialog(null,a+" "+c+" "+b);
		}if (b<c && c<a) {
			showMessageDialog(null,b+" "+c+" "+a);
		}if (c<b && b<a) { 
			showMessageDialog(null,c+" "+b+" "+a);
		}
	}
}