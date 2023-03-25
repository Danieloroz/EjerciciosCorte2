package EjercicioSillas;

public class Sofa extends Mueble {
    public Sofa(String material, double precio) {
        super(material, precio);
    }
    public void aplicarDiseño() {
        System.out.println("Aplicando diseño Victoriana al sofá...");
    }
}

