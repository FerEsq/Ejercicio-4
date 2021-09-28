
/* Nombre: JefeMago.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

public class JefeMago extends Mago
{
    private String habilidadE;
    private int damageE;

    public JefeMago()
    {
        this.nombre = "Jefe Mago";
        this.vida = 300;
        this.ataque = 20;
        habilidadE = "Lluvia de rayos";
        damageE = 50;
    }
    
    public String getHabilidadE()
    {
        return habilidadE;
    }

    public void usarHabilidadE(Jugador j)
    {
        j.setVida(damageE);
    }
    
}
