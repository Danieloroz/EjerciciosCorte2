package EjercicioSillas;

public class Silla extends Mueble {
    public Silla(String material, double precio) {
        super(material, precio);
    }
    public void aplicarDiseño() {
        System.out.println("Aplicando diseño Art Deco a la silla...");
    }
}
