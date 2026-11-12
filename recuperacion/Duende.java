public class Duende extends Criatura {

    private String tipoMagia;
    private int nivelTravesura;
    private double tamaño;

    public Duende(String nombre, int edad, int nivelEnergia, String especie,
                  String tipoMagia, int nivelTravesura, double tamaño) {

        super(nombre, edad, nivelEnergia, especie);

        this.tipoMagia = tipoMagia;
        this.nivelTravesura = nivelTravesura;
        this.tamaño = tamaño;
    }

    public void hacerTravesuras() {
        System.out.println(getNombre() + " está haciendo travesuras.");
    }

    public void lanzarHechizo() {
        System.out.println(getNombre() + " está lanzando un hechizo.");
    }

    @Override
    public void realizarActividad() {
        System.out.println(getNombre() + " está haciendo magia.");
    }
}