
/* Nombre: Enemigo.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

public class Enemigo extends Combatiente
{
    protected String habilidad;
    protected String habilidadE;
    protected int damageH;
    protected int damageE;
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

    public void usarHabilidad(Jugador j, int d)
    {
        j.setVida(d);
    }

    public int getDamageE()
    { 
        return damageE;
    }

    public String getHabilidadE()
    {
        return habilidadE;
    }
    
}
