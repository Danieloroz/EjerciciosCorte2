package EjercicioSillas;

public class Main {
    public static void main(String[] args) {
        Silla silla = new Silla("Madera", 500000);
        Sofa sofa = new Sofa("Cuero", 300000);
        Mesilla mesilla = new Mesilla("Metal", 200000);

        silla.aplicarDiseño();
        sofa.aplicarDiseño();
        mesilla.aplicarDiseño();
    }
}
