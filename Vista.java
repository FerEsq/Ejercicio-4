
/* Nombre: Vista.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

//Import
import java.util.Scanner;
import java.util.ArrayList;  

public class Vista 
{
    Scanner scan = new Scanner(System.in);

    public VistaF()
    {  

    }

    //Mensaje de bienvenida
    public void mostrarInicio()
    {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("      ✦ Bienvenid@ al Simulador de batallas de rol ✦ \n");
		System.out.println(" - Máximo de jugadores: 2");
        System.out.println(" - Los jugadores deberán tomarse turnos para controlar el simulador");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    //Mensaje de despedida
    public void mostrarDespedida()
    {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Muchas gracias por utilizar nuestro simulador!!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    //Mensaje de error de opción
    public void mostrarError()
    {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Esa opción no existe, intente de nuevo");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    //Menu
    public int mostrarMenu()
    {
        int op = 0;
        System.out.println("¿Que opción desea ejecutar? (ingrese solo el número)");	
		System.out.println("1. Iniciar batalla");
		System.out.println("2. Salir");

        op = scan.nextInt();
        return op;
    }

    //Menú rol
    public int pedirRol()
    {
        int op = 0;
        System.out.println("¿Que rol desea tener? (ingrese solo el número)");	
		System.out.println("1. Guerrero");
		System.out.println("2. Exploradora");

        op = scan.nextInt();
        return op;
    }

    //Menú enemigo
    public int menuEnemigo()
    {
        int op = 0;
        System.out.println("¿Que desea hacer? (ingrese solo el número)");	
		System.out.println("1. Atacar");
		System.out.println("2. Usar habilidad");
        System.out.println("3. Retirarse");

        op = scan.nextInt();
        return op;
    }

    //Menú jefe
    public int menuJefe()
    {
        int op = 0;
        System.out.println("¿Que desea hacer? (ingrese solo el número)");	
		System.out.println("1. Atacar");
		System.out.println("2. Usar habilidad");
        System.out.println("3. Usar habilidad especial");
        System.out.println("4. Retirarse");

        op = scan.nextInt();
        return op;
    }

    //Menú guerrero
    public int menuGuerrero()
    {
        int op = 0;
        System.out.println("¿Que desea hacer? (ingrese solo el número)");	
		System.out.println("1. Atacar");
		System.out.println("2. Usar espada");
        System.out.println("3. Retirarse");

        op = scan.nextInt();
        return op;
    }

    //Menú espada
    public int pedirObjetivo(ArrayList <Enemigo> e)
    {
        int op = 0;
        System.out.println("¿A que enemigo desea atacar? (ingrese solo el número)");
        for (int i = 0; i < e.size(); i++)
        {
            System.out.println(i + ". " + e.get(i).getNombre());
        } 
        op = scan.nextInt();
        return op;
    }

    //Menú exploradora
    public int menuExploradora()
    {
        int op = 0;
        System.out.println("¿Que desea hacer? (ingrese solo el número)");	
		System.out.println("1. Atacar");
		System.out.println("2. Usar dalla");
        System.out.println("3. Usar anillo");
        System.out.println("4. Retirarse");

        op = scan.nextInt();
        return op;
    }

    public void mostrarFrase(Combatiente c, int p)
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(c.getMensajes()[p]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
    
}
