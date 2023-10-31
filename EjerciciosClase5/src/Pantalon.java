import javax.sound.midi.VoiceStatus;

public class Pantalon extends Vestimenta {
    private String estilo;
    private String tipoTejido;

    public Pantalon(int codigo, String nombre, double precio, String marca, double talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public Pantalon(String estilo, String tipoTejido) {
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    @Override
    public void Mostrar(){
        System.out.println("Estos pantalones son de estilo: " + getEstilo());
    }
}
