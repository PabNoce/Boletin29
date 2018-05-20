
package boletin29;


public  class DeportivasMotor extends Barcos{
    private double potencia;
double modulo;
    public DeportivasMotor() {
    }

    public DeportivasMotor(double potencia) {
        this.potencia = potencia;
    }

    public DeportivasMotor(double potencia, int diasOcupacion, double eslora, String matricula) {
        super(diasOcupacion, eslora, matricula);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    @Override
    public String toString() {
        return "DeportivasMotor{" + "potencia=" + potencia + '}';
    }
 

 

    @Override
    public double amosarAluguer() {
        return (super.amosarPrecio()+potencia*3)*super.getDiasOcupacion();
    }
}
