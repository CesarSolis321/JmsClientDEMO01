
package Modelo;

/**
 *
 * @author luigg
 */
public class DatosCurso {
    String curso;
    String seccion;
    String docente;
    String dia;
    String horaFin;
    String horaInicio;

    public DatosCurso(String curso, String seccion, String docente, String dia, String horaFin, String horaInicio) {
        this.curso = curso;
        this.seccion = seccion;
        this.docente = docente;
        this.dia = dia;
        this.horaFin = horaFin;
        this.horaInicio = horaInicio;
    }

    public DatosCurso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getSeccion() {
        return seccion;
    }

    public String getDocente() {
        return docente;
    }

    public String getDia() {
        return dia;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getCurso() {
        return curso;
    }
    
    

    @Override
    public String toString() {
        return "seccion=" + seccion + ", docente=" + docente + ", dia=" + dia + ", horaFin=" + horaFin + ", horaInicio=" + horaInicio + '}';
    }
    
    
}
