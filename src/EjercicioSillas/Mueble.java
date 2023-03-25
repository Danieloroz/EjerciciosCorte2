package EjercicioSillas;

public abstract class Mueble implements Diseño {
    private String material;
    private double precio;

    public Mueble(String material, double precio) {
        this.material = material;
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Implementación del método de la interfaz Diseño
    public abstract void aplicarDiseño();
}
