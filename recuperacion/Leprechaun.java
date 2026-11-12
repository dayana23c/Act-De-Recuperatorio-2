public class Leprechaun extends Duende {

    private int cantidadOro;
    private String colorSombrero;
    private int suerte;

    public Leprechaun(String nombre, int edad, int energia, String especie,
                      String tipoMagia, int travesura, double tamaño,
                      int cantidadOro, String colorSombrero, int suerte) {

        super(nombre, edad, energia, especie, tipoMagia, travesura, tamaño);

        this.cantidadOro = cantidadOro;
        this.colorSombrero = colorSombrero;
        this.suerte = suerte;
    }

    public void encontrarOro() {
        System.out.println(getNombre() + " encontró oro.");
    }

    public void esconderTesoro() {
        System.out.println(getNombre() + " escondió su tesoro.");
    }

    public void concederSuerte() {
        System.out.println(getNombre() + " concedió buena suerte.");
    }

    @Override
    public void realizarActividad() {
        encontrarOro();
    }
}