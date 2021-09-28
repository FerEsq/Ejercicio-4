
/* Nombre: Enemigo.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

public class Enemigo extends Combatiente
{
    protected String habilidad;
    protected int damageH;
    protected boolean jefe;
    
    public Enemigo()
    {
        super();      
    }

    public String getHabilidad()
    {
        return habilidad;
    }

    public boolean getJefe()
    {
        return jefe;
    }

    public int getDamageH()
    {
        return damageH;
    }

    public void atacar(Jugador j)
    {
        j.setVida(this.getAtaque());
    }

    public void usarHabilidad(Jugador j)
    {
        j.setVida(damageH);
    }
}
