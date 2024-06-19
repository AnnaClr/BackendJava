public class Caneta {
    private String cor;
    public Caneta(String cor, String marca, String dono) {
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
    private String marca;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
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
