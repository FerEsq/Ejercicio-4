
/* Nombre: Item.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

public class Item 
{
    protected String tipo;
    protected int damage;
    protected int usos;
    private boolean roto;

    public Item()
    {
        roto = false;
    }

    public String getTipo()
    {
        return tipo;
    }

    public int getDamage()
    {
        return damage;
    }

    public int getUsos()
    {
        return usos;
    }

    public void setUsos()
    {
        usos--;
    }

    public boolean getRoto()
    {
        return roto;
    }

    public void setRotoT()
    {
        roto = true;
    }

}
