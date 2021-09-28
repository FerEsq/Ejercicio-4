
/* Nombre: JefeBruja.java
 * Programador: Fernanda Esquivel (esq21542@uvg.edu.gt).
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 28.09.2021 */

public class JefeBruja 
{
    private String habilidadE;
    private int damageE;

    public JefeMago()
    {
        this.nombre = "Jefe Bruja";
        this.vida = 350;
        this.ataque = 25;
        habilidadE = "Encantamiento";
        damageE = 60;
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
