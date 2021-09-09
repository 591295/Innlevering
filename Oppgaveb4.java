package Innlevering2;

import static javax.swing.JOptionPane.*; 

public class Oppgaveb4 {

	public static void main(String[] args) {
		
		String bruttolonn = showInputDialog("Din Bruttolønn? : ") ; 
		int lonn = Integer.parseInt(bruttolonn) ; 
		
		if (lonn >= 0 && lonn < 164100) {
			showMessageDialog(null, "Ditt skattetrinn er nivå 0 og er på: " + lonn * 0) ; 
		}
		else if (lonn >= 164101 && lonn < 230950) {
			showMessageDialog(null, "Ditt skattetrinn er nivå 1 og er på: " + lonn * 0.0093 + "kr") ;
		}
		else if (lonn >= 230951 && lonn < 580650) {
			showMessageDialog(null, "Ditt skattetrinn er nivå 2 og er på: " + lonn * 0.0241 + "kr") ;
		}
		else if (lonn >= 580651 && lonn < 934050 ) {
			showMessageDialog(null, "Ditt skattetrinn er nivå 3 og er på: " + lonn * 0.1152 + "kr") ;
		}
		else if (lonn >= 934051 ) {
			showMessageDialog(null, "Ditt skattetrinn er nivå 4 og er på: " + lonn * 0.1452 + "kr") ;
		}
	}

}
