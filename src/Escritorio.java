public class Escritorio {

    private BaseRectangular base;
    private int numeroDeCajones;

    public Escritorio(BaseRectangular base, int numeroDeCajones) {
        this.base = base;
        this.numeroDeCajones = numeroDeCajones;
    }

    public BaseRectangular getBase() {
        return base;
    }

    public void setBase(BaseRectangular base) {
        this.base = base;
    }

    public int getNumeroDeCajones() {
        return numeroDeCajones;
    }

    public void setNumeroDeCajones(int numeroDeCajones) {
        this.numeroDeCajones = numeroDeCajones;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "base=" + base +
                ", numeroDeCajones=" + numeroDeCajones +
                '}';
    }

    public boolean cabeEnEspacio(double anchoE, double largoE){
        double areaEspacio = anchoE * largoE;
        double areaEscritorio = base.getAncho() * base.getLargo();
        return areaEscritorio < areaEspacio;
    }
    public void mostrarDimensionesVidrio(){
        System.out.println("Ancho del vidrio: " + base.getAncho());
        System.out.println("Largo del vidrio: " + base.getLargo());
        System.out.println("Espesor del vidrio: " + 0.7 + "cms.");
    }
}
