import java.util.ArrayList;

public class Parque {

    private ArrayList<Criatura> criaturas;
    private String nombreParque;
    private int capacidad;

    public Parque(String nombreParque, int capacidad) {
        this.nombreParque = nombreParque;
        this.capacidad = capacidad;
        criaturas = new ArrayList<Criatura>();
    }

    public void agregarCriatura(Criatura c) {
        if (criaturas.size() < capacidad) {
            criaturas.add(c);
            System.out.println(c.getNombre() + " fue agregada al parque.");
        } else {
            System.out.println("El parque está lleno.");
        }
    }

    public void listarCriaturas() {
        System.out.println("Criaturas del parque:");

        for (Criatura c : criaturas) {
            System.out.println(c.getNombre());
        }
    }

    public void realizarActividades() {
        for (Criatura c : criaturas) {
            c.realizarActividad();
        }
    }

    public void mostrarEstadoEnergia() {
        for (Criatura c : criaturas) {
            System.out.println(c.getNombre() + ": "
                    + c.getNivelEnergia() + " de energía.");
        }
    }
}