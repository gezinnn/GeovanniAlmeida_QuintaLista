/* Descrição : Crie uma classe e um método construtor
Nome : Geovanni Almeida
Data : 07/06/2023 */


public class Objetos4 {
    public static void main(String[] args) {
        Vovoh vovo = new Vovoh("Geovanni", "Curitiba");
        System.out.println(vovo.nomedaPessoa);
        System.out.println(vovo.ondeNasceu);

    }
}

class Vovoh { 
    String nomedaPessoa;
    String ondeNasceu;

    Vovoh(String nome, String local) {
        this.nomedaPessoa = nome;
        this.ondeNasceu = local;

    }
}