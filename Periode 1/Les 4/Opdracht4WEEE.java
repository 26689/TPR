import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;


public class Opdracht4WEEE extends Application
{

	public static void main(String[] args)
	{
		
		/*
		 * ONDERDEEL 1 - ARGUMENTEN:
		 * 
		 * Zonder dat wij het voorheen in de gaten hadden is de "public static void main(String[] args){}" dus
		 * ook een functie wat argumenten kan ontvangen. Dat betekent dat wij bij het opstarten van het programma
		 * dus een functie aanroepen (in dit geval als wij "java Opdracht4WEEE" uitvoeren). Deze functie heeft dus
		 * ÈÈn parameter, in dit geval is dat "String[] args". Hierdoor kunnen achter de regel "java Opdracht4WEEE"
		 * argumenten meegeven worden door een spatie te laten na "Opdracht4WEEE" en per argument.
		 * 
		 * 		(Bijvoorbeeld:		java Opdracht4WEEE Wat Grappig)
		 * 
		 * 
		 * Voer onderstaande stappen uit:
		 * 
		 * 		Geef twee argumenten mee aan het begin van dit programma.
		 * 
		 * 				Argument 1 = Een integer
		 * 				Argument 2 = Een stukje tekst
		 * 
		 */
		
		
		
		if (args.length >= 2)
		{
			int		variabeleEen	= Integer.parseInt(args[0]);
			String	variabeleTwee	= args[1];
			
			if (variabeleTwee.toCharArray().length > 0 && !variabeleTwee.isEmpty())
			{
				System.out.println("OPDRACHT 1 is GOED!");
				System.out.println("Argument 1 = " + variabeleEen);
				System.out.println("Argument 2 = " + variabeleTwee);
			}
			else
			{
				System.out.println("OPDRACHT 1 FOUT: Argument 2 bevat niet genoeg of geen tekst!");
			}
		}
		else
		{
			System.out.println("OPDRACHT 1 FOUT: Je hebt niet genoeg argumenten meegegeven!");
		}
		
		
		launch(args);
		

	}
	
	
	
	/*
	 * ONDERDEEL 2 - FUNCTIES MET PARAMETERS MAKEN & ARGUMENTEN MEEGEVEN:
	 * 
	 * In dit onderdeel ga je een functie declareren waarin een Label gemaakt wordt wat
	 * vervolgens aan de applicatie wordt toegevoegd. Deze functie ga je vervolgens
	 * aanroepen binnen de "public void start" functie. (Zie "ONDERDEEL 2" beneden...)
	 * 
	 * Voer onderstaande stappen succesvol uit om het onderdeel af te ronden:
	 * 
	 * 		1) Declareer een functie met 1 (……N) parameter van het type "GridPane".
	 * 
	 * 		2) Gebruik onderstaande code in jouw gedeclareerde functie en pas de code
	 * 			vervolgens aan waar [VUL IN] staat aangegeven:
	 * 
	 * 			---------------------------------------------------------------
	 * 			Label naam = new Label("[VUL IN]");
	 *			naam.setFont(Font.font("Arial", FontPosture.ITALIC, [VUL IN]));
	 *			[VUL IN].add(naam, 0, 1);
	 * 			---------------------------------------------------------------
	 * 
	 * 
	 *		3) Roep jouw gedeclareerde functie aan binnen de "public void start" functie
	 *			bij "ONDERDEEL 2". Binnen de functie "public void start" staan een aantal
	 *			voorgedefinieerde variabelen. Kies ÈÈn van deze variabelen om als ARGUMENT
	 *			aan jouw functie mee te geven waarvan het datatype van deze variabele overeen
	 *			moet komen met jouw functie parameter.
	 * 
	 * 
	 */
	
	// .....
	
	
	
	
	/*
	 * ONDERDEEL 3 - FUNCTIES MET RETURN VALUES MAKEN & GEBRUIKEN:
	 * 
	 * Bij "ONDERDEEL 3", in de functie "public void start" (zie beneden), maak je een double variabele aan.
	 * Deze double variabele ga je vullen met een willekeurig getal door middel van een functie aan te roepen
	 * wat een willekeurig getal teruggeeft. Deze functie die wordt aangeroepen ga jij zelf maken door deze
	 * functie te declareren met de juiste return type en instructies.
	 * 
	 * Geef deze functie de naam "GeefWillekeurigGetal".
	 * 
	 * Gebruik onderstaande code in jouw functie "GeefWillekeurigGetal" om een willekeurig getal tussen de
	 * 1 en de 10 te genereren:
	 * 
	 * 		---------------------------------------------------------------
	 * 		Math.ceil(Math.random() * 10)
	 * 		---------------------------------------------------------------
	 * 
	 * 
	 * Geef het resultaat van de double variabele weer in de aangegeven "println()" bij "ONDERDEEL 3"
	 * waar [VUL IN] staat.
	 * 
	 */
	
	// .....
	
	
	
	
	/* 
	 * ONDERDEEL 4 - FUNCTIES MET PARAMETERS EN RETURN VALUES MAKEN & GEBRUIKEN:
	 * 
	 * Declareer vervolgens een functie met de naam "IsWillekeurigGetalKleinerDanVijf" wat een TRUE of FALSE
	 * kan teruggeven (retourneren). Geef de functie 1 parameter wat hetzelfde datatype heeft als het
	 * gedeclareerde getal uit "ONDERDEEL 3". In deze functie controleer je, door middel van een if-statement,
	 * of het meegegeven ARGUMENT KLEINER IS DAN 5 (VIJF). Het resultaat van deze controle laat je de functie
	 * teruggeven.
	 * 
	 * 		(HINT: Zo ja, geef resultaat X terug. Zo niet, geef resultaat Y terug.)
	 * 
	 * 
	 * 
	 * Controleer bij "ONDERDEEL 4", in de functie "public void start" (zie beneden), of het getal KLEINER IS
	 * DAN 5 (VIJF) door gebruik te maken van jouw "IsWillekeurigGetalKleinerDanVijf" functie. Laat het resultaat
	 * van deze functie in de aangegeven "println()" terugkomen.
	 * 
	 */
	
	// .....
	
	
	
	
	public void start(Stage primaryStage)
	{
		
		String titelTekst = "WEEE - Periode 1, Les 4";
		
		GridPane mijnGrid = new GridPane();
		
		Text scenetitel = new Text(titelTekst);
		scenetitel.setFont(Font.font("Calibri", FontWeight.NORMAL, 30));
		mijnGrid.add(scenetitel, 0, 0, 2, 1);
		
		Scene scenE = new Scene(mijnGrid, 400, 250);
		primaryStage.setTitle(titelTekst);
		primaryStage.setScene(scenE);
		primaryStage.show();
		
		
		
		// #########################################
		//
		// ONDERDEEL 2 --- ROEP HIER JE FUNCTIE AAN!
		//
		// #########################################
		
		// ....
		
		
		
		// ##################################################################
		//
		// ONDERDEEL 3 --- ZET BIJ [VUL IN] HET GEDECLAREERDE GETAL NEER.
		//
		// ##################################################################
		
		// DECLAREER HIER JE DOUBLE VARIABELE MET EEN WILLEKEURIG GETAL! (Zie opdracht...)
		// ....
		
		System.out.println("Het willekeurige getal is:");
		System.out.println( /*[VUL IN]*/ );
		
		
		
		// ##################################################################
		//
		// ONDERDEEL 4 --- CONTROLEER HET GEDECLAREERDE GETAL BIJ [VUL IN].
		//
		// ##################################################################
		
		// LAAT HIER HET ANTWOORD OP DE VRAAG TERUGKOMEN DOOR DE "IsWillekeurigGetalKleinerDanVijf" FUNCTIE TE GEBRUIKEN:
		System.out.println("Is het willekeurige getal kleiner dan vijf?");
		System.out.println( /*[VUL IN]*/ );
		
		
	}
	
	
	
	
	
	

}
