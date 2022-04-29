/**
 * Los módulos formativos son impartidos por profesores y profesoras que pondrán 
 * los contenidos del módulo a disposición de los alumnos y alumnas. Cada Módulo 
 * tiene establecido un número de horas. Los exámenes se componen de 30 preguntas 
 * que se eligen y ordenan al azar. Las preguntas tienen un enunciado y cuatro 
 * posibles respuestas, sólo una de ellas válida.
 * @author david
 */

public class Modulo {

    private String nombre;

    private String contenido;

    private String horas;

    private String alumnado;

    private Profesor[] claustro;

    private Examen pruebaexamen;

    private Tarea pruebaTarea;

    public Modulo(String nombre, String contenido, String horas, String alumnado, Profesor[] claustro, Examen pruebaexamen, Tarea pruebaTarea) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.horas = horas;
        this.alumnado = alumnado;
        this.claustro = claustro;
        this.pruebaexamen = pruebaexamen;
        this.pruebaTarea = pruebaTarea;
    }

    /**
     * Métpdo para Matricular los alumnos.
     */
    public void matricularAlumno() {
    }
    /**
     * Método para contratar a los Profesores.
     */
    public void contratarProfesor() {
    }
    /**
     * Método para evaluar al Alumno.
     */
    public void evaluarAlumno() {
    }

    /**
     * Devuelve el nombre del Modulo.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del Modulo.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el contenido del Modulo.
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Modifica el contenido del Modulo.
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Devuelve las horas del Modulo.
     * @return the horas
     */
    public String getHoras() {
        return horas;
    }

    /**Modifica las horas del Modulo.
     * 
     * @param horas the horas to set
     */
    public void setHoras(String horas) {
        this.horas = horas;
    }

    /**
     * Devuelve el alumnado del Modulo.
     * @return the alumnado
     */
    public String getAlumnado() {
        return alumnado;
    }

    /**
     * Modifica el alumnado del Modulo.
     * @param alumnado the alumnado to set
     */
    public void setAlumnado(String alumnado) {
        this.alumnado = alumnado;
    }

    /**
     * Modifica el alumnado del Modulo.
     * @return the claustro
     */
    public Profesor[] getClaustro() {
        return claustro;
    }

    /**
     * Devuelve el claustro de profesores del Modulo.
     * @param claustro the claustro to set
     */
    public void setClaustro(Profesor[] claustro) {
        this.claustro = claustro;
    }

    /**
     * Modifica el claustro de profesores del Modulo.
     * @return the pruebaexamen
     */
    public Examen getPruebaexamen() {
        return pruebaexamen;
    }

    /**
     * Devuelve la prueba de examen del Modulo.
     * @param pruebaexamen the pruebaexamen to set
     */
    public void setPruebaexamen(Examen pruebaexamen) {
        this.pruebaexamen = pruebaexamen;
    }

    /**
     * Modifica la prueba de examne del Modulo.
     * @return the pruebaTarea
     */
    public Tarea getPruebaTarea() {
        return pruebaTarea;
    }

    /**
     * Modifica la prueba de examen del Modulo.
     * @param pruebaTarea the pruebaTarea to set
     */
    public void setPruebaTarea(Tarea pruebaTarea) {
        this.pruebaTarea = pruebaTarea;
    }
    
}
