// la classe principale
public class Main {

	// le code qui s'execute en premier
	public static void main(String[] args) {
		// envois le message "strykerz_2_0" a la console
		System.out.println("Strykerz_2_0");
	}

}

// Les differentes variable
boolean = true or false
byte = integer values from 0 to 255
short = integer values from -32768 to 32767
int = integer values from -2147483648 to 2147483647
long = integer values frome -2⁶³ to 2⁶³
float = 32 bit floating point 
double = 64 bit floating point
String = strings the char values
char = Unicode characters (e.g. "A")

//Selon IEEE, float a une précision codée sur 32 bits. Selon IEEE, double a une précision codée sur 64 bits. Float prend 4 octets pour le stockage. Double prend 8 octets pour le stockage

//exemple string

	String pseudo = "Strykerz_2_0";
	
// exemple int
	int age = 16;

//result

		String pseudo = "Strykerz_2_0";
		int age = 16;
		
		// envois le message "strykerz_2_0" a la console
		System.out.println(pseudo + " " + age);
		System.out.println("le pseudo change");
		pseudo = "JLStrykerz_2_0";
		System.out.println(pseudo + " " + age);

//if condition

Moins de: a < b
Inférieur ou égal à: a <= b
Supérieur à: a > b
Supérieur ou égal à: a >= b
Égal à a == b
Pas égal à: a != B

// exemple condition

|| = ou
&& = et

if(money != 5000 || money != 5100) {
			System.out.println("oui");
		} else {
			System.out.println("non");
		}

// exemple de condition pour de la money

	public static void main(String[] args) {
		
		int money = 5200;
		
		if(money != 5000 || money != 5100) {
			System.out.println("oui");
		} else {
			System.out.println("non");
		}
		
	}

// exemple de condition pour l'age

package fr.strykerz.programme;

// Class Principale
public class Main {

	// le code qui s'execute en premier
	public static void main(String[] args) {
		
		int age = 11;
		
		if(age >= 18) {
			System.out.println("oui la personne est majeur");
		} else if(age <= 10) {
			System.out.println("La personne est trés jeune");
		}
		  else {
			System.out.println("non elle n'est pas majeur");
		}
		
	}

}

// exemple switch

		int age = 15;
		
		switch(age) {
		
		case 10:
			System.out.println("La personne a 10 ans");
		break;
		
		case 11:
			System.out.println("La personne a 11 ans");
		break;
		
		default: System.out.println("Cet age n'a pas de message");
		
		}

//exemple tableau avec index

		String pseudo = "strykerz_2_0";
		String[] names = { "Igor", "Mathieu", "Meruem" };
		// va dire la premiere valeur qui est "Igor". 0 = premiere valeur
		System.out.println(names[0]);

//exemple moyenne avec tableau
		int[] numbers = {12, 7, 19};
		int calcul = (numbers[0] + numbers[1] + numbers[2] ) / numbers.length;
		System.out.println(calcul);

//exemple tableau dans un tableau avec chiffres
		int[][] numbers = {
				{
					5, 7, 8
				},
				{
					3, 2, 1
				},
				{
					9, 4, 2
				}
		};
		//numbers[2] = le tableau [1] = le chiffre dans le tableau
		System.out.println(numbers[2][1] + " <--");

//va mettre tout ce qui est ecrit devant le "," de pseudoss dans pseudos
		String pseudoss = "Strykerz,Faitan,Fuze,Harry,test,fromage";
		String[] pseudos = pseudoss.split(",");
		System.out.println(pseudos[0]);

// exemple premiere type de boucle

		//rajoute 1 a i tant que i n'est pas égale a 100
		// (i = 0) = valeur de début / (i < 100) = condition de la boucle / (i++) = ce qu'il fera en action
		for(int i = 0; i < 100; i++) {
			System.out.println("Ceci est le tour de la boucle" + i);
		}

//exemple dexieme type de boucle
		String pseudoss = "Strykerz,Faitan,Fuze,Harry,test,fromage";
		String[] pseudos = pseudoss.split(",");
		
		//va mettre le string "pseudos" au string "str" et mettre le resultat sur la console
		for(String str : pseudos) {
			System.out.println(str);
		}

// 3eme type de boucle
		int i = 0;
		
		while(i != 300) {
			i++;
			System.out.println("fromage / " + i);

//exemple du do while

		int money = 1000;
		int pricephone = 800;
		boolean hasphone = false;
		
		if( money >= pricephone && !hasphone) {
			System.out.println("Tu peut acheter ce telephone");
		} else {
			System.out.println("Tu n'a pas assez d'argent pour acheter ce telephone et en plus tu a deja un telephone");
		}
		
// la boucle ne s'arreteras pas tant qu'elle aura pas un telephone
		do {
			System.out.println("Fromage de chevre");
		} while(!hasphone);

// Les fonction

private = privée
public = publique
protected = proteger

private static (static = on peut l'appeler rapidement comme par exemple: nomDeLaFonction.Test)

exemple 1:

private static int getCalcul(){
	return 5;
}
		
int = type de la variable

void = on retourne rien sa veut qu'on met du code et pas un return

// executer une fonction:

// Class Principale
public class Main {

// le code qui s'execute en premier
	public static void main(String[] args) {
		SendMessage();
	}

	private static void SendMessage() {
		System.out.println("ceci est un petit message dans la console");
		}

	}

// exemple 2

// Class Principale
public class Main {

// le code qui s'execute en premier
	public static void main(String[] args) {
		SendMessage("test", 9); //test
		SendMessage("fromage", 17); //fromage
	}

	private static void SendMessage(String message, int number) {
		System.out.println("ceci "+number+" est un petit message dans la console : " + message);
		}

	}

//ceci ecriras dans la console:

ceci 9 est un petit message dans la console : test
ceci 17 est un petit message dans la console : fromage

// exemple 3

// Class Principale
public class Main {

	// le code qui s'execute en premier
	public static void main(String[] args) {
		
		int money = 1000;
		int pricephone = 800;
		boolean hasphone = true;

		SendMessage("La difference est de : " + getResultat(money, pricephone, hasphone), 9); //test*

	}

	private static void SendMessage(String message, int number) {
		System.out.println("ceci "+number+" est un petit message dans la console : " + message);
		}
	
	private static int getResultat(int money, int pricephone, boolean hasphone) { 
		
		if( money >= pricephone && !hasphone) {
			System.out.println("Tu peut acheter ce telephone");
		} else {
			System.out.println("Tu n'a pas assez d'argent pour acheter ce telephone et en plus tu a deja un telephone");
		}
		
		return money - pricephone;
	}
	
	

}

//ca ecriras dans la console:

ceci 9 est un petit message dans la console : La difference est de : 200