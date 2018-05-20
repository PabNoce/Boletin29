package boletin29;


public  class Yates extends Barcos{
    private double potencia;
    private int nCamarotes;
    double modulo;
    public Yates() {
    }

    public Yates(double potencia, int nCamarotes) {
        this.potencia = potencia;
        this.nCamarotes = nCamarotes;
    }

    public Yates(double potencia, int nCamarotes, int diasOcupacion, double eslora, String matricula) {
        super(diasOcupacion, eslora, matricula);
        this.potencia = potencia;
        this.nCamarotes = nCamarotes;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getnCamarotes() {
        return nCamarotes;
    }

    public void setnCamarotes(int nCamarotes) {
        this.nCamarotes = nCamarotes;
    }

    @Override
    public String toString() {
        return "Yates{" + "potencia=" + potencia + ", nCamarotes=" + nCamarotes + '}';
    }



    @Override
    public double amosarAluguer() {
return (super.amosarPrecio()+potencia*3+nCamarotes*4)*super.getDiasOcupacion();
    }
}
