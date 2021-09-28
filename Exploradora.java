
/* Nombre: Exploradora.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

 //Import
import java.util.ArrayList;  

public class Exploradora extends Jugador
{

    private Item item2;

    public Exploradora()
    {
        super();
        this.item = new Dalla();
        this.item2 = new Anillo();
        this.nombre = "Exploradora";
        this.vida = 500;
        this.ataque = 20;
        this.mensajes[0] = "¡Los exploradores también pelean!";
        this.mensajes[1] = "Supongo que los buenos no siempre ganan";
        this.mensajes[2] = "No debiste retarme a una batalla";
    }

    public void usarDalla(ArrayList <Enemigo> es)
    {
        for (int i = 0; i < es.size(); i++)
        {
            es.get(i).setVida(this.ataque);
        }
    }

    // método curación usando el anillo, es exclusivo de la exploradora
    public void usarAnillo()
    {
        if (this.vida < 500)
        {
            this.vida += item.getDamage();
        }
    }
    
}
