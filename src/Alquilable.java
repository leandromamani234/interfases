public class Alquilable extends Producto {
    Double precioHora;

    public Alquilable(String codigo, String modelo, Double precioHora) {
        super(codigo, modelo);
        this.precioHora = precioHora;
    }

    public Double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(Double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public String toString() {
        return "Alquilable{" +
                "precioHora=" + precioHora +
                '}';
    }
}
