
/* Nombre: JefeMago.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

public class JefeMago extends Mago
{
    private String habilidadHE;
    private int damageE;

    public JefeMago()
    {
        super();
        this.jefe = true;
        this.nombre = "Jefe Mago";
        this.vida = 300;
        this.ataque = 20;
        habilidadHE = "Lluvia de rayos";
        damageE = 50;
    }
    
    public String getHabilidadHE()
    {
        return habilidadHE;
    }

    public void usarHabilidadE(Jugador j)
    {
        j.setVida(damageE);
    }
    
}
