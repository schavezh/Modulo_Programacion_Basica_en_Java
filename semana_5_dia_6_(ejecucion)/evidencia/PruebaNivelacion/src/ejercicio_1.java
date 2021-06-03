import java.util.Scanner;

public class ejercicio_1 {
	static Scanner Lector_numeros = new Scanner(System.in);
	
	public static void main(String[] argumentos){

		int edades[] = new int[10];	
		int mayores_edad[] = new int[10];	
		int menores_edad[] = new int[10];	
		boolean repetir=false;
		int cant_mayores_edad = 0;
		int cant_menores_edad = 0;
		String a=""; 
		String b=""; 
		
		//Ciclo para solicitar las 10 edades como input para nuestro arreglo
		//******************************************************************
		for (int i=0;i<10; i++) {			
			if (i==0) {
				System.out.println("La siguiente aplicación solicitará las edades de 10 personas, \npor favor ingrese las edades según se requiera.");
			}
			int j= i+1;
			
			do{
				System.out.println("Ingrese la edad de la Persona "+j+":");
			
			// Incorporamos un validador para que solo se ingresen numeros enteros por consola con el manejo de excepciones
			//*************************************************************************************************************
			try {
				
				edades[i]= Lector_numeros.nextInt();
				repetir=false;
				if (edades[i]<18) {
					menores_edad[cant_menores_edad]=edades[i];
					a= a+" "+edades[i];
					cant_menores_edad++;
					
					
				}else{			
					mayores_edad[cant_mayores_edad]=edades[i];
					b= b+" "+edades[i];
					cant_mayores_edad++;
				}
				
			}catch(java.util.InputMismatchException e){
				System.out.println("Debe ingresar un número entero.");
                Lector_numeros.next();
				repetir=true;
			}
			}while(repetir);

		}

	
		// Finalizamos imprimendo el mensaje por pantalla con el resultado de la cantidad de mayores y menores de edad segun los datos ingresados
		//***************************************************************************************************************************************
		System.out.println("\n**** Usted ha ingresado "+cant_menores_edad+" Personas menores de edad ("+a.strip()+")\ny "+cant_mayores_edad+" Personas meyores de edad ("+b.strip()+")****");
			
		}
	
}
