package javacore.modificadorestatico.classe;

public class Carro {
    private String marca;
    private String modelo;
    private float velMaxima;
    private static float velLimite = 240;

    public Carro(String marca, String modelo, float velMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velMaxima = velMaxima;
    }

    public Carro() {

    }

    // metodo estático - acessa e modifica atributos de Classe - n de objetos
    public static void setVelLimite(float velLimite) {
        Carro.velLimite = velLimite;
    }

    // public static float getVelLimite() {
    // return velLimite;
    // }

    public void imprimir() {
        System.out.println(modelo);
        System.out.println(velMaxima);
        System.out.println(velLimite);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(float velMaxima) {
        this.velMaxima = velMaxima;
    }

    public static float getVelLimite() {
        return velLimite;
    }

}
