
/* Nombre: Driver.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

//Import
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.io.IOException; 
import java.util.ArrayList;  

//Clase Driver (SimuladorPerrera)
class Driver
{	
	/** 
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Espacio parqueo = new Espacio();
		Vista vista = new Vista();
		Scanner scan = new Scanner(System.in);
        Jugador player;

        int rol = 0;

		
        //Mensajes de bienvenida	
		vista.mostrarInicio();

        
        while (rol != 1 && rol != 2)
        {
            rol = vista.pedirRol();

            if (rol == 1)
            {
                player = new Guerrero();
                vista.mostrarFrase(player, 0);
            }
            if (rol == 2)
            {
                player = new Exploradora();
                vista.mostrarFrase(player, 0);
            }
            if (rol > 2)
            {
                vista.mostrarError();
            }
        }
        





				
		/*while (opcion != 2)
		{
			//Menú		
			opcion = vista.mostrarMenu();

			if (opcion == 1) //ingresar vehículo
			{
				System.out.println("ssss");			
			}

			if (opcion == 2) //retirar vehículo
			{
				vista.mostrarDespedida();
				
			}

			//Otra ocpión
			if (opcion > 2)
			{
				vista.mostrarError();
			}
		}*/
	}
}
