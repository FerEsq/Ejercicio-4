
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
    
    /** 
     * @return String
     */
    public String getTipo()
    {
        return tipo;
    }
    
    /** 
     * @return int
     */
    public int getDamage()
    {
        return damage;
    }
    
    /** 
     * @return int
     */
    public int getUsos()
    {
        return usos;
    }

    public void setUsos()
    {
        usos--;
    }
    
    /** 
     * @return boolean
     */
    public boolean getRoto()
    {
        return roto;
    }

    public void setRotoT()
    {
        roto = true;
    }

}
