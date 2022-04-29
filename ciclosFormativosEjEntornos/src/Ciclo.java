/**
 * Los alumnos y alumnas de Ciclos Formativos a Distancia se matriculan de 
 * varios módulos formativos al año. Un ciclo formativo se compone de una serie 
 * de competencias profesionales, que tienen una descripción y que, a su vez, 
 * están formadas por uno o varios módulos, que tienen un nombre, y un número 
 * de horas.  
 * @author david
 */

public class Ciclo {

    private String nombre;

    private String descripcion;

    private String horas;

    private int year;

    private String competencia;

    private Competencia[] listacompetencias;

    public Ciclo(String nombre, String descripcion, String horas, int year, String competencia, Competencia[] listacompetencias) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
        this.year = year;
        this.competencia = competencia;
        this.listacompetencias = listacompetencias;
    }

    /**
     * Devuelve el nombre del ciclo.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del ciclo.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la descripcion del ciclo.
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripcion del ciclo.
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve las horas del ciclo.
     * @return the horas
     */
    public String getHoras() {
        return horas;
    }

    /**
     * Modifica las horas del ciclo.
     * @param horas the horas to set
     */
    public void setHoras(String horas) {
        this.horas = horas;
    }

    /**
     * Devuelve el año del ciclo.
     * @return the year
     */
    public int getyear() {
        return year;
    }

    /**
     * Modifica el año del ciclo. 
     * @param year the anio to set
     */
    public void setAnio(int anio) {
        this.year = anio;
    }

    /**
     * Devuelve las competecias del ciclo
     * @return the competencia
     */
    public String getCompetencia() {
        return competencia;
    }

    /**
     * Modifica las competencias del ciclo.
     * @param competencia the competencia to set
     */
    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    /**
     * Devuelve la lista de competencias del ciclo.
     * @return the listacompetencias
     */
    public Competencia[] getListacompetencias() {
        return listacompetencias;
    }

    /**
     * Modifica la lista de competencias del ciclo. 
     * @param listacompetencias the listacompetencias to set
     */
    public void setListacompetencias(Competencia[] listacompetencias) {
        this.listacompetencias = listacompetencias;
    }
    
}
