package modelo;

/**
 * @author isaias sanchez
 */
public class Alumno {
    
    private String rutAlumno;
    private String nombreAlumno;
    private String nombreApoderado;
    private String rutApoderado;
    private boolean tieneBeca;
    private double montoBeca;
    private String codigoCarrera;
    private double valorMatricula;

    public Alumno()
    {
    }
    
    public Alumno(String rutAL,String nombreAL,String nombreAP, String rutAP,boolean beca,double descuentoBeca,String carrera, double valorM)
    {
        this.codigoCarrera=rutAL;
        this.nombreAlumno= nombreAL;
        this.nombreApoderado= nombreAP;
        this.rutApoderado=rutAP;
        this.tieneBeca = beca;
        this.montoBeca= descuentoBeca;
        this.codigoCarrera=carrera;
        this.valorMatricula= valorM;
        
    }   
    
    public String getRutAlumno() {
        return rutAlumno;
    }

    public void setRutAlumno(String rutAlumno) {
        this.rutAlumno = rutAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getNombreApoderado() {
        return nombreApoderado;
    }

    public void setNombreApoderado(String nombreApoderado) {
        this.nombreApoderado = nombreApoderado;
    }

    public String getRutApoderado() {
        return rutApoderado;
    }

    public void setRutApoderado(String rutApoderado) {
        this.rutApoderado = rutApoderado;
    }

    public boolean isTieneBeca() {
        return tieneBeca;
    }

    public void setTieneBeca(boolean tieneBeca) {
        this.tieneBeca = tieneBeca;
    }

    public double getMontoBeca() {
        return montoBeca;
    }

    public void setMontoBeca(double montoBeca) {
        this.montoBeca = montoBeca;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }
    
    
    
}
