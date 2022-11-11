import java.util.Date;

public class SSD extends AltaTecnologia{
    int capacidad;

    public SSD(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa empresa, int capacidad) {
        super(codigo, modelo, paisOrigen, fechaFabricacion, empresa);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "capacidad=" + capacidad +
                '}';
    }
}
