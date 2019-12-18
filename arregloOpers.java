// programa sencillo que captura datos y almacena en un arreglo para después 
// hacer algunas operaciones con el arreglo.
// elaborado por ChrisGL.   16 dic 2019
// tampoco estoy descubriendo el hilo negro, verdad???

import java.util.Scanner;

class arregloOpers {

	// Método para verificar si un arreglo no esta vacío
	static void arregloConValores(double[] arreglo)
	{
		if (arreglo.length < 1) 
		{ 
			System.out.println("ERROR *** ARREGLO SIN DATOS *** ERROR"); 
			System.exit(0); 
		}
	}	
	
	// Método para listar el contenido de un arreglo
	static void listArreglo(double[] arreglo) {
		int contador = 0;
		for (double i: arreglo) {
			contador++;
			System.out.println("Dato número " + contador + " : " + i);			
  		}
    }

	// Método para retornar el valor máximo del arreglo
	static double maxArray(double[] arreglo) 
	{	
		arregloConValores(arreglo);
		double max = arreglo[0];
		for (double i: arreglo)	if (max < i) max = i; 
		return max;  		
	}
	
	// Método para retornar el valor mínimo del arreglo
	static double minArray(double[] arreglo) 
	{
		arregloConValores(arreglo);	
		double min = arreglo[0];
		for (double i: arreglo) if (min > i) min = i;
		return min;  		
    }

	// Método para retornar el promedio de los valores de un arreglo.
	static double promArreglo(double[] arreglo) 
	{
		arregloConValores(arreglo);
		int contador = 0; double promedio = 0;
		for (double i: arreglo) 
		{
			contador++;
			promedio = promedio + i;
		}
		promedio = promedio / contador;
		return promedio;
    }

  public static void main(String[ ] args) {
    
	Scanner entrada = new Scanner(System.in);  // se define el objeto Scanner
    int nd=0;    // se inicializa la variable nd que define el tamaño del arreglo

	// se capturan los valores, validando tambien cuantos valores serán en el arreglo
	do{
    	System.out.print("Cuantos valores numéricos introduciras? : ");
		nd = entrada.nextInt();				
		System.out.println();
	  } while(nd < 0);
	double[] matriz = new double[nd];    // se especifica el tamaño de el arreglo
        
    // aca de captura los datos numéricos del arreglo
	System.out.println();
    for (int i=0;i<matriz.length;i++) {
        System.out.print("Introduce un valor numerico: ");
        matriz[i] = entrada.nextDouble();
    }

	// se listan los elementos del arreglo
	System.out.println();
	listArreglo(matriz);
	System.out.println();
 
	// muestra el valor màximo del arreglo
	System.out.println("El valor máximo del arreglo es: " + maxArray(matriz) );
	System.out.println();

	// muestra el valor mínimo del arreglo
	System.out.println("El valor mínimo del arreglo es: " + minArray(matriz) );
	System.out.println();

	// muestra el promedio de los valores del arreglo
	System.out.println("El promedio de los valores del arreglo es: " + promArreglo(matriz) );
	System.out.println();
  }
}
