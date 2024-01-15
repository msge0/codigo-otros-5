import java.util.Scanner;

public class Codigo5 {

	//se anade el metodo main para el funcionamiento del programa
	public static void main(String[] args) {
		
	    try (Scanner s = new Scanner(System.in)) {
			System.out.print("Introduzca un número: ");
			int ni = s.nextInt(); //se cambia el tipo de datp y el metodo de entrada 
			int c = ni;
			
			int afo = 0;
			int noAfo = 0;
			
			while (ni > 0) {
			  int digito = ni % 10;
			  if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			  } else {
				noAfo++;
			  }   // se corrige el scope 
			  ni /= 10; 
			}

			if (afo > noAfo) {
			  System.out.println("El " + c + " es un número afortunado.");
			} else {
			  System.out.println("El " + c + " no es un número afortunado.");
			}
		}
	    
	}
	}

//la funcion de este programa determina si el numero ingresado por el usario a traves del uso del metodo scanner es afortunado a traves 
//del uso del bucle while el cual se ejecuta mientras el valor de ni sea mayor a cero 
//despues la variable digito saca el residuo del valor de ni y si digito es igual a 3, 7, 8, 9 se le suma uno a traves del incremeto de la variable afo++
//al igual que si no es igual a los numeros anteriores se le suma uno a traves del incremento de noAfo++
//una vez finalizada la condicion if ni sera dividido entre 10 para sacar el residuo y continuar con el bucle
// despues con otra condicion if y fuera del bucle se compara los resultados de afo y noAfo en el cual si 
// afo es mayor a noAfo la consola va arrojar que el numero ingresado es afortunado y si la condicion es contaria 
//dira que el numero no es afortunado 
