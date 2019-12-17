// programa sencillo que captura datos y almacena en un arreglo para después 
// hacer algunas operaciones con el arreglo.
// elaborado por ChrisGL.   16 dic 2019
// tampoco estoy descubriendo el hilo negro, verdad???

import java.util.Scanner;

class arregloOpers {

	// Método para listar el contenido de un arreglo
	static void listArreglo(int[] arreglo) {
		int contador = 0;
		for (int i: arreglo) {
			contador++;
			System.out.println("Dato número " + contador + " : " + i);			
  		}
    }

	// Método para retornar el valor mayor del arreglo
	static int maxArray(int[] arreglo) 
	{
		
		if (arreglo.length > 0) 
		{
					int max = arreglo[0];
					for (int i: arreglo) 
						{
							if (max < i) max = i;			
						}
					return max;
  		} else {
					System.out.println("ERROR - ERROR - ERROR *** ARREGLO SIN DATOS *** ERROR - ERROR - ERROR");
					return 0;
	    		}
	}
	

	// Método para retornar el valor menor del arreglo
	static int minArray(int[] arreglo) 
	{
		
		if (arreglo.length > 0) 
		{
					int min = arreglo[0];
					for (int i: arreglo) 
						{
							if (min > i) min = i;			
						}
					return min;
  		} else {
					System.out.println("ERROR - ERROR - ERROR *** ARREGLO SIN DATOS *** ERROR - ERROR - ERROR");
					return 0;
	    		}
    }



  public static void main(String[ ] args) {
    
	Scanner entrada = new Scanner(System.in);  // se define el objeto Scanner
    int nd=0;    // se inicializa la variable nd que define el tamaño del arreglo
	

	// se capturan los valores, validando tambien cuantos valores serán en el arreglo
	do{
    	System.out.print("Cuantos valores introduciras? : ");
		nd = entrada.nextInt();				
	  } while(nd < 1);
	int[] matriz = new int[nd];    // se especifica el tamaño de el arreglo
        
    // aca de captura los datos del arreglo
    for (int i=0;i<matriz.length;i++) {
        System.out.print("Introduce un valor numerico entero: ");
        matriz[i] = entrada.nextInt();
    }

	// se listan los elementos del arreglo
	listArreglo(matriz);
 
	// aca se muestra el valor màximo del arreglo
	System.out.println("El valor máximo del arreglo es: " + maxArray(matriz) );

	// aca se muestra el valor mínimo del arreglo
	System.out.println("El valor mínimo del arreglo es: " + minArray(matriz) );

  }
}
