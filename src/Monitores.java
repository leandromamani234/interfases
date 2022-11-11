public class Monitores extends Alquilable {
    String resolucionMaxima;

    public Monitores(String codigo, String modelo, Double precioHora, String resolucionMaxima) {
        super(codigo, modelo, precioHora);
        this.resolucionMaxima = resolucionMaxima;
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    @Override
    public String toString() {
        return "Monitores{" +
                "resolucionMaxima='" + resolucionMaxima + '\'' +
                '}';
    }
}
