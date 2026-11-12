public class Pixie extends Duende {

    private String colorAlas;
    private double tamañoAlas;
    private int polvoMagico;

    public Pixie(String nombre, int edad, int energia, String especie,
                 String tipoMagia, int travesura, double tamaño,
                 String colorAlas, double tamañoAlas, int polvoMagico) {

        super(nombre, edad, energia, especie, tipoMagia, travesura, tamaño);

        this.colorAlas = colorAlas;
        this.tamañoAlas = tamañoAlas;
        this.polvoMagico = polvoMagico;
    }

    public void volar() {
        System.out.println(getNombre() + " está volando.");
    }

    public void lanzarPolvoMagico() {
        System.out.println(getNombre() + " lanzó polvo mágico.");
    }

    public void hacerseInvisible() {
        System.out.println(getNombre() + " se hizo invisible.");
    }

    @Override
    public void realizarActividad() {
        volar();
    }
}