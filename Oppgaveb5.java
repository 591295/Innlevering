package Innlevering2;

import static javax.swing.JOptionPane.*; 

public class Oppgaveb5 {

	public static void main(String[] args) {
		
		for (int main = 1 ; main <=10  ; main++)  {
		
		 String karaktersum = showInputDialog("Din poengsum :  ") ; 
		int score = Integer.parseInt(karaktersum) ; 
		
		if (score >= 0 && score <= 39)  {
			showMessageDialog(null, "Din score på " + score + " tilsvarer karakter F") ; 
		}
		else if (score >= 40 && score <= 49)  {
			showMessageDialog(null, "Din score på " + score + " tilsvarer karakter E") ; 
		}
		else if (score >= 50 && score <= 59)  {
			showMessageDialog(null, "Din score på " + score + " tilsvarer karakter D") ; 
		}
		else if (score >= 60 && score <= 79)  {
			showMessageDialog(null, "Din score på " + score + " tilsvarer karakter C") ; 
		}
		else if (score >= 80 && score <= 89)  {
			showMessageDialog(null, "Din score på " + score + " tilsvarer karakter B") ; 
		}
		else if (score >= 90 && score <= 100)  {
			showMessageDialog(null, "Din score på " + score + " tilsvarer karakter A") ; 
		}
		else if (score >= 100 || score <= 0)  {
			showMessageDialog(null, "Ugyldig, skriv inn på nytt") ;
			main-- ; 
			 
			}
		}
	
	}
	
}

		
	
		
		
		

	

