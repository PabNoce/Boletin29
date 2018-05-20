
package boletin29;


public  class Veleros extends Barcos {
    int nMastiles;
   
    public Veleros() {
    }


    public Veleros(int nMastiles, int diasOcupacion, double eslora, String matricula) {
        super(diasOcupacion, eslora, matricula);
        this.nMastiles = nMastiles;
    }

    public int getnMastiles() {
        return nMastiles;
    }

    public void setnMastiles(int nMastiles) {
        this.nMastiles = nMastiles;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    @Override
    public String toString() {
        return "Veleros{" + "nMastiles=" + nMastiles + '}';
    }
    

 

    @Override
    public double amosarAluguer() {
        return (super.amosarPrecio()+nMastiles*2)*super.getDiasOcupacion();

    }
}
