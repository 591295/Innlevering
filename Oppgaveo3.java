package Innlevering2;

import static javax.swing.JOptionPane.*;

public final class Oppgaveo3 {

	public static void main(String[] args) {
		String Nverdi = showInputDialog("Skriv inn et heltall :  ") ; 
		int tall = Integer.parseInt(Nverdi) ; 
		
        long fakultet= 1;
        for(int i = 1; i <= tall; ++i)
        {
            fakultet *= i;
        }
        System.out.printf("Fakultet av %d = %d", tall, fakultet);
    }

}

