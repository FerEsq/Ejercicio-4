
/* Nombre: Combatiente.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

public class Combatiente 
{
    protected String nombre;
    protected String[] mensajes = new String[3];
    private boolean turno;
    private boolean derrotado;
    protected int vida;
    protected int ataque;

    public Combatiente()
    {
        this.turno = false;
        this.derrotado = false;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String[] getMensajes()
    {
        return mensajes;
    }

    public boolean getTurno()
    {
        return turno;
    }

    public void setTurnoF()
    {
        turno = false;
    }

    public void setTurnoT()
    {
        turno = true;
    }

    public boolean getDerrotado()
    {
        return derrotado;
    }

    public void setDerrotadoT()
    {
        derrotado = true;
    }

    public void setVida(int d)
    {
        vida = vida - d;
    }

    public int getVida()
    {
        return vida;
    }

    public int getAtaque()
    {
        return ataque;
    }
    
}
