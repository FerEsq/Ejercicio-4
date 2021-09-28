
/* Nombre: Enemigo.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

public class Enemigo extends Combatiente
{
    protected String habilidad;
    protected int damageH;
    //private boolean objetivo;
    
    public Enemigo()
    {
        super();
        //objetivo = false;        
    }

    public String getHabilidad()
    {
        return habilidad;
    }

    /*public boolean getObjetivo()
    {
        return objetivo;
    }

    public void setObjetivoT()
    {
        objetivo = true;
    }

    public void setObjetivoF()
    {
        objetivo = false;
    }*/

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
