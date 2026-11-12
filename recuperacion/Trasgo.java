public class Trasgo extends Duende {

    private int fuerza;
    private int nivelAgresividad;
    private String tipoArma;

    public Trasgo(String nombre, int edad, int energia, String especie,
                  String tipoMagia, int travesura, double tamaño,
                  int fuerza, int nivelAgresividad, String tipoArma) {

        super(nombre, edad, energia, especie, tipoMagia, travesura, tamaño);

        this.fuerza = fuerza;
        this.nivelAgresividad = nivelAgresividad;
        this.tipoArma = tipoArma;
    }

    public void atacar() {
        System.out.println(getNombre() + " está atacando.");
    }

    public void esconderse() {
        System.out.println(getNombre() + " se está escondiendo.");
    }

    public void defenderse() {
        System.out.println(getNombre() + " se está defendiendo.");
    }

    @Override
    public void realizarActividad() {
        atacar();
    }
}