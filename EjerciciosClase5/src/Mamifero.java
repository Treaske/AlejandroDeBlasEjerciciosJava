public class Mamifero extends Animal{
    private int numPatas;
    private String tipoRepro;
    private String colorPelaje;
    private String habitat;

    public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAliment, int numPatas, String tipoRepro, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAliment);
        this.numPatas = numPatas;
        this.tipoRepro = tipoRepro;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    public Mamifero(int numPatas, String tipoRepro, String colorPelaje, String habitat) {
        this.numPatas = numPatas;
        this.tipoRepro = tipoRepro;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }


    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getTipoRepro() {
        return tipoRepro;
    }

    public void setTipoRepro(String tipoRepro) {
        this.tipoRepro = tipoRepro;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void Saludar(){
        System.out.println("Hola, soy un mamifero");
    }
}
