
/* Nombre: Exploradora.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

//import
import java.util.ArrayList;  

public class Exploradora extends Jugador
{
    public Exploradora()
    {
        super();
        this.nombre = "Exploradora";
        this.vida = 500;
        this.ataque = 20;
        this.mensajes[0] = "¡Los exploradores también pelean!";
        this.mensajes[1] = "Supongo que los buenos no siempre ganan";
        this.mensajes[2] = "No debiste retarme a una batalla";
    }

    public void atacarE(ArrayList <Enemigo> es)
    {
        for (int i = 0; i < es.size(); i++)
        {
            es.get(i).setVida(this.ataque);
        }
    }
    
}
