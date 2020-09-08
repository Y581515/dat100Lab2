package dat100Lab2;
import static javax.swing.JOptionPane.*;


public class oppgave7a {

	public static void main(String[] args) {
		
	
		System.out.println("Poeng      Karakter");
		
		for(int i=0;i<10;i++) {
			
			int a=Integer.parseInt(showInputDialog("enter first number: "));
				
			if (0>a || a>100) {
				a=Integer.parseInt(showInputDialog("enter  anumber between 0 and 100"));
				i-=1;
				
			}else if (0<=a && a<40) { 
				System.out.println(a+"              F");
		    }else if (40<=a && a<50) {
				System.out.println(a+"              E");
		    }else if (50<=a && a<60) {
				System.out.println(a+"              D");
		    }else if (60<=a && a<80) {
				System.out.println(a+"              C");
		    }else if (80<=a && a<90) {
				System.out.println(a+"              B");
		    }else if (90<=a && a<=100) {
				System.out.println(a+"              A");
		    }
		}
	}
}
