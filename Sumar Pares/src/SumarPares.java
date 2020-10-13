import java.util.Scanner;		//IMPORTAR SCANNER
public class SumarPares {

	public static void main(String[] args) {
		//DEVUELVE EL NÚMERO DE PARES HASTA EL NÚMERO INTRODUCIDO (INLCUIDO)
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		int número = teclado.nextInt();		//INTRODUCIR NÚMERO
		int i=0;		//CREAR I (SERÁ EL NÚMERO PAR)
		int par = 0;		//CREAR PAR (SERÁ EL NÚMERO DE PARES HASTA AHORA)
		
		do {
			par+=1;		//CADA VUELTA SE LE SUMA UNO A PAR
			i+=2;		//CADA VUELTA SE LE SUMAN 2 A I (TIENE QUE SER PAR)
		}
		while (i<número);		//MIENTRAS LA I SEA INFERIOR AL NÚMERO INTRODUCIDO, SE REPITE EL BUCLE DO.

		System.out.printf("Hay %d números pares.",par);		//AL SALIR DEL BUCLE SE MUESTRA EL VALOR DE PAR (NÚMERO DE PARES)
	}
}
