import java.util.Scanner;		//IMPORTAR SCANNER
public class SumarPares {

	public static void main(String[] args) {
		//DEVUELVE EL N�MERO DE PARES HASTA EL N�MERO INTRODUCIDO (INLCUIDO)
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		int n�mero = teclado.nextInt();		//INTRODUCIR N�MERO
		int i=0;		//CREAR I (SER� EL N�MERO PAR)
		int par = 0;		//CREAR PAR (SER� EL N�MERO DE PARES HASTA AHORA)
		
		do {
			par+=1;		//CADA VUELTA SE LE SUMA UNO A PAR
			i+=2;		//CADA VUELTA SE LE SUMAN 2 A I (TIENE QUE SER PAR)
		}
		while (i<n�mero);		//MIENTRAS LA I SEA INFERIOR AL N�MERO INTRODUCIDO, SE REPITE EL BUCLE DO.

		System.out.printf("Hay %d n�meros pares.",par);		//AL SALIR DEL BUCLE SE MUESTRA EL VALOR DE PAR (N�MERO DE PARES)
	}
}
