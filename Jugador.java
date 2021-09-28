
/* Nombre: Jugador.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

//import
import java.util.ArrayList;  

public class Jugador extends Combatiente
{
    protected Item item;
    
    public Jugador()
    {
        super();
    }

    public Item getItem()
    {
        return item;
    }

    public void atacarES(ArrayList <Enemigo> es)
    {
        for (int i = 0; i < es.size(); i++)
        {
            es.get(i).setVida(this.ataque);
        }
    }

}
