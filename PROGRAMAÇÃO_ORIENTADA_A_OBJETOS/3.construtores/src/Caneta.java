public class Caneta {

    private String cor;
    public Caneta(String cor, Stirng marca, String dono) {
        this.cor = cor;
        this.marca = marca;
        this.dono = dono;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    private Stirng marca;
    public Stirng getMarca() {
        return marca;
    }
    public void setMarca(Stirng marca) {
        this.marca = marca;
    }
    private String dono;
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }


}
