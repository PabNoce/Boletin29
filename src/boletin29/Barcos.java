package boletin29;


public abstract class Barcos {
    int diasOcupacion;
    double eslora;
    private String matricula;
    
    public Barcos() {
    }

    public Barcos(int diasOcupacion, double eslora, String matricula) {
        this.diasOcupacion = diasOcupacion;
        this.eslora = eslora;
        this.matricula = matricula;
 
    }

    public int getDiasOcupacion() {
        return diasOcupacion;
    }

    public void setDiasOcupacion(int diasOcupacion) {
        this.diasOcupacion = diasOcupacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    @Override
    public String toString() {
        return "Barcos{" + "diasOcupacion=" + diasOcupacion + ", eslora=" + eslora + ", matricula=" + matricula +'}';
    }
    
    public  double amosarPrecio(){
        return eslora*10;
    }


    public abstract double amosarAluguer();
   

    
}
