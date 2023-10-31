public class Animal {
    private int id;
    private String nombre;
    private int edad;
    private String tipoPiel;
    private String tipoAliment;

    public Animal(int id, String nombre, int edad, String tipoPiel, String tipoAliment) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.tipoAliment = tipoAliment;
    }

    public Animal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    public String getTipoAliment() {
        return tipoAliment;
    }

    public void setTipoAliment(String tipoAliment) {
        this.tipoAliment = tipoAliment;
    }

    public void Saludar(){
        System.out.println("Hola, soy un animal");
    }
}
