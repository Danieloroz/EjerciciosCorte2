package EjercicioSillas;

public class Mesilla extends Mueble {
    public Mesilla(String material, double precio) {
        super(material, precio);
    }
    public void aplicarDiseño() {
        System.out.println("Aplicando diseño Moderna a la mesilla...");
    }
}
