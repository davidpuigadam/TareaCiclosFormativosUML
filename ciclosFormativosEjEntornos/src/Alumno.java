
/**
 * Cuando un alumno o alumna finaliza el ciclo se emite un certificado de
 * competencias a su nombre donde aparece la descripción de las competencias
 * que forman el ciclo y la nota media obtenida. Si un alumnoo alumna no
 * termina de cursar el ciclo completo puede pedir un certificado que acredite
 * las competencias que si tenga adquiridas.
 *
 * @author david
 */
public class Alumno extends Persona {

    private double notamedia;

    private Modulo[] matricula;

    
    public Alumno(String nombre, String direccion, String telefono, String alias, String Apellidos, String email, double notamedia, Modulo[] matricula) {
        super(nombre,direccion,telefono,alias,Apellidos, email);
        this.notamedia = notamedia;
        this.matricula = matricula;
    
    
    }

    /**
     * Si un alumno o alumna no termina de cursar el ciclo completo puede pedir
     * un certificado que acredite las competencias que sí tenga adquiridas.
     */
    public void emitirCertificado() {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    /**
     * Se realiza el calculo para sacar al media de los alumnos.
     */
    public void calcularNotaMedia() {
    }

    /**
     * Realizar la matriculación de los alumnos aprobados con mas de un 5.
     */
    public void matricular() {
    }

    /**
     * Devuelve la nota media de los alumnos.
     *
     * @return the notamedia
     *
     */
    public double getNotamedia() {
        return notamedia;
    }

    /**
     * Modifica la nota media de los alumnos.
     *
     * @param notamedia the notamedia to set
     */
    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }

    /**
     * Devuelve la matricula de los alumnos.
     *
     * @return the matricula
     */
    public Modulo[] getMatricula() {
        return matricula;
    }

    /**
     * Modifica la matricula de los alumnos.
     *
     * @param matricula the matricula to set
     */
    public void setMatricula(Modulo[] matricula) {
        this.matricula = matricula;
    }

}
