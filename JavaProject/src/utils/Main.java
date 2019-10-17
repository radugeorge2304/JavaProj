package utils;

import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		// Declarare si initializare obiect scanner
		Scanner nume = new Scanner(System.in);
		System.out.println("O intrebare: Alege subiect");

		// Printare mesaje la ecran
		System.out.println("1. DE");
		System.out.println("2. PCLP");
		System.out.println("3. MS");
		System.out.println("4. SS");
		
		Integer optiune = nume.nextInt();
		String materieAleasa = "";
		
		System.out.println("Optiune aleasa = " + optiune);
		System.out.println("--------------------------");
		
		// functionalitatea programului
//		if (optiune == 1) {
//			System.out.println("Ai ales DE");
//		} else
//		if (optiune == 2) {
//			System.out.println("Ai ales PCLP");
//		} else
//		if (optiune == 3) {
//			System.out.println("Ai ales MS");
//		} else
//		if (optiune == 4) {
//			System.out.println("Ai ales SS");
//		}
		if(optiune >4 || optiune<1 )
		{while(optiune >4 || optiune<1 )
			{System.out.println("Optiune gresita.");
			
			System.out.println("Mai incearca :");
			optiune = nume.nextInt();
			
			}
		}
		else
		
		switch(optiune) {
		case 1: 
			System.out.println("Ai ales DE");
			materieAleasa = "DE";
			break;
		case 2: 
			System.out.println("Ai ales PCLP");
			materieAleasa = "PCLP";
			break;
		case 3: 
			System.out.println("Ai ales MS");
			materieAleasa = "MS";
			break;
		case 4: 
			System.out.println("Ai ales SS");
			materieAleasa = "SS";
			break;
			
		}
		
		
		
		
		System.out.println("--------------------------");
		
		System.out.println("Introdu nota:");
		
		// Citire nota
		Integer notaCitita = 0;
		notaCitita = nume.nextInt();
		System.out.println("Nota pentru materia " + materieAleasa+ " este  " + notaCitita + ".");


}
}
