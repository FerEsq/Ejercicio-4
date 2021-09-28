
/* Nombre: Jugador.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

public class Jugador extends Combatiente
{
    private Item item;
    
    public Jugador()
    {

    }

    public void usarItem(Enemigo e)
    {
        e.setVida(item.getDamage());
    }

}
