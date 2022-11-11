public class DiscoDuro extends Alquilable{
    int capacidad;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public DiscoDuro(String codigo, String modelo, Double precioHora, int capacidad) {
        super(codigo, modelo, precioHora);
        this.capacidad = capacidad;

    }

    @Override
    public String toString() {
        return "DiscoDuro{" +
                "capacidad=" + capacidad +
                '}';
    }
}
