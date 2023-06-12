/* Descrição : Crie uma classe e um método construtor
Nome : Geovanni Almeida
Data : 07/06/2023 */


public class Objetos5 {
    public static void main(String[] args) {
        Carros automoveis = new Carros("HB-20", "Hyundai", "Prata");
        System.out.println(automoveis.marcadoCarro);
        System.out.println(automoveis.modelodoCarro);
        System.out.println(automoveis.cordoCarro);

    }
}

class Carros { 

        /* Atributos */

    String marcadoCarro;
    String modelodoCarro;
    String cordoCarro;
    String motorista;
    String porte;
    int tamanhodaRoda;
    boolean possuiSistemaEmbarcado;
    int potencia;
    String tipodopneu;
    String materialdoBanco;

        /* Métodos */

    void Locomover(){}
    void Frear(){}
    void Correr(){}
    void Manobras(){}
    void TocarMusica(){}
    void Sinalizar(){}
    void Abrir(){}
    void Fechar(){}
    void Existir(){}
    void PossuirSistemaEmbarcado(){}


    Carros(String marca, String modelo, String cor) {
        this.marcadoCarro = marca;
        this.modelodoCarro = modelo;
        this.cordoCarro = cor;
    }

}