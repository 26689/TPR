

public class Opdracht3WEEE
{

	public static void main(String[] args)
	{
		
		// MAAK ALLE ONDERDELEN AF OM DE OPDRACHT TE VOLTOOIEN!
		
		OnderdeelEen();
		OnderdeelTwee();
		OnderdeelDrie();
		
	}
	
	
	
	public static void OnderdeelEen()
	{
		
		// ONDERSTAANDE VARIABELE NAMEN EN WAARDEN MAG JE NIET AANPASSEN!
		boolean	waarOfNiet	= false;
		String	stukjeTekst = "TEKST";
		int		getalA		= 3;
		int		getalB		= 5;
		int		getalC		= 7;
		int		getalD		= (int)Math.ceil( Math.random() * 10 ); // Willekeurige waarde van 1 t/m 10.
		
		
		/*
		 * OPDRACHT OMSCHRIJVING:
		 * 
		 * VERTAAL HET ONDERSTAANDE COMMENTAAR BINNEN DE BLOKHAKEN [] NAAR WERKENDE CODE DOOR if-statements
		 * MET DE CORRECTE voorwaarden TOE TE PASSEN. 
		 * 
		 */
		
		
		
		// [ALS waarOfNiet NIET GELIJK STAAT AAN true EN getalB GROTER OF GELIJK IS AAN getalA]
		// ### VERVANG DEZE REGEL MET JOUW IF-STATEMENT CODE! ###
		{
			
			// [ALS stukjeTekst GELIJK STAAT AAN "TEKST"]
			// ### VERVANG DEZE REGEL MET JOUW IF-STATEMENT CODE! ###
			{
				
				// [ALS getalD KLEINER OF GELIJK STAAT AAN getalA OF ALS getalD GROTER OF GELIJK STAAT AAN getalC]
				// ### VERVANG DEZE REGEL MET JOUW IF-STATEMENT CODE! ###
				{
					System.out.println("ONDERDEEL EEN: Uitkomst 1 = " + getalD + " ###############");
				}
				// [ZO NIET, ALS getalD NIET GELIJK STAAT AAN getalB]
				// ### VERVANG DEZE REGEL MET JOUW IF-STATEMENT CODE! ###
				{
					System.out.println("ONDERDEEL EEN: Uitkomst 2 = " + getalD + " !!!!!!!!!");
				}
				// [ZO NIET, DOE DAN HET VOLGENDE]
				// ### VERVANG DEZE REGEL MET JOUW IF-STATEMENT CODE! ###
				{
					System.out.println("ONDERDEEL EEN: Uitkomst 3 = " + getalD + " $$$");
				}
				
			}
			
		}
		
		
		
		
	}
	
	
	
	public static void OnderdeelTwee()
	{
		
		// ONDERSTAANDE VARIABELE NAMEN EN WAARDEN MAG JE NIET AANPASSEN!
		int	testWaardeA	= (int)Math.ceil( Math.random() * 5 ); // Willekeurige waarde van 1 t/m 5.
		
		
		/*
		 * OPDRACHT OMSCHRIJVING:
		 * 
		 * MAAK EEN SWITCH-STATEMENT WAARIN JE GEBRUIK MAAKT VAN testWaardeA. DE VARIABELE testWaardeA KAN EEN WAARDE HEBBEN VAN 1 t/m 5.
		 * VOOR ELKE UITKOMST VAN testWaardeA MOET JE EEN ANDER RESULTAAT PRINTEN DOOR System.out.println("") TE GEBRUIKEN.
		 * (Dus in totaal 5 verschillende uitkomsten!)
		 * 
		 */
		
		
		// ### MAAK HIER JE SWITCH STATEMENT ###
		
	}
	
	
	
	public static void OnderdeelDrie()
	{
		
		// ONDERSTAANDE VARIABELE NAMEN EN WAARDEN MAG JE NIET AANPASSEN!
		int		testWaarde1	= (int)Math.ceil( Math.random() * 5 ); // Willekeurige waarde van 1 t/m 5.
		int		testWaarde2	= testWaarde1;
		
		boolean	testWaarde3	= true;
		boolean	testWaarde4	= false;
		
		
		
		/*
		 * OPDRACHT OMSCHRIJVING:
		 * 
		 * VUL ALLEEN DE CORRECTE OPERATOREN IN OM DE ONDERSTAANDE IF-STATEMENT TE LATEN KLOPPEN.
		 * (De uitkomst van de if-statement moet dus JA, GA DOOR zijn.)
		 * (Je moet het resultaat "GOED ZO! DE IF-STATEMENT IS GELUKT!" dus te zien krijgen!)
		 * 
		 * HAAL DE COMMENTS VAN DE IF-STATEMENT WEG OM HET TE TESTEN.
		 * 
		 */
		
		
		
		//if
		//(
		//	(testWaarde1 /*OPERATOR*/ testWaarde2 /*OPERATOR*/ testWaarde2 /*OPERATOR*/ 6) == false /*OPERATOR*/
		//	(testWaarde3 /*OPERATOR*/ testWaarde4)
		//)
		{
			System.out.println("GOED ZO! DE IF-STATEMENT IS GELUKT!");
		}
		else
		{
			System.out.println("JAMMER... DE IF-STATEMENT KLOPT NOG STEEDS NIET.");
		}
		
	}
	

}

