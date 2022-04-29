/**
 * Para el profesorado, además, se debe conocer su número de registro personal 
 * (NRP)”. También los módulos que imparte el profesorado.
 * @author david
 */


public class Profesor extends Persona {

    private String NPR;

    private Modulo[] docencia;

    public Profesor(String NPR, Modulo[] docencia, String nombre, String direccion, String telefono, String alias, String Apellidos, String email) {
        super(nombre, direccion, telefono, alias, Apellidos, email);
        this.NPR = NPR;
        this.docencia = docencia;
    }

    /**
     * Método para añadir Módulos del Ciclo. 
     */
    
    public void anadirmodulo() {
    }
    
    /**
     * Método para sacar el  número de registro personal de los profesores.
     */
    public void setNPR() {
    }

    /**
     * Devuelve el número de registro personal del Profesor. 
     * @return the NPR
     */
    public String getNPR() {
        return NPR;
    }

    /**
     * Modifica el número de registro personal del Profesor.
     * @param NPR the NPR to set
     */
    public void setNPR(String NPR) {
        this.NPR = NPR;
    }

    /**
     * Devuelve la Docencia del Profesor.
     * @return the docencia
     */
    public Modulo[] getDocencia() {
        return docencia;
    }

    /**
     * Modifica la docencia del Profesor.
     * @param docencia the docencia to set
     */
    public void setDocencia(Modulo[] docencia) {
        this.docencia = docencia;
    }
    
}
