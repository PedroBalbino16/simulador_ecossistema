package animais;

public class Aguia extends Aves {
    public String nome;

    public Aguia(String nome, int idade) {
        super(nome, idade);
        this.nome = nome;
    }

    public void voar() {
        System.out.println(nome + " está voando\n");
    }
    public void comer() {
        System.out.println("O " + nome + " está comendo.\n");
    }

    public void reproduzir() {
        System.out.println("O "+nome + " está se reproduzindo.\n");
    }

}
