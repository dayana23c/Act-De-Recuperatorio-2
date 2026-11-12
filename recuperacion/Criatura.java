public class Criatura {

    private String nombre;
    private int edad;
    private int nivelEnergia;
    private String especie;

    public Criatura(String nombre, int edad, int nivelEnergia, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelEnergia = nivelEnergia;
        this.especie = especie;
    }

    public void alimentarse() {
        System.out.println(nombre + " se está alimentando.");
        nivelEnergia += 10;
    }

    public void descansar() {
        System.out.println(nombre + " está descansando.");
        nivelEnergia += 20;
    }

    public void recuperarEnergia() {
        nivelEnergia += 5;
    }

    public void realizarActividad() {
        System.out.println(nombre + " está realizando una actividad.");
        nivelEnergia -= 5;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }
}