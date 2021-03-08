public class BaseRectangular {
    private double ancho;
    private double largo;
    private String material;

    public BaseRectangular(double ancho, double largo, String material) {
        this.ancho = ancho;
        this.largo = largo;
        this.material = material;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "BaseRectangular{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                ", material='" + material + '\'' +
                '}';
    }
}
