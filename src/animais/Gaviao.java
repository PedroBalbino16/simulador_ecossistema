package animais;

public class Gaviao extends Aves {
    public Gaviao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void voar() {
        System.out.println("O " + nome + " está voando\n");
    }
    public void comer() {
        System.out.println("O " + nome + " está comendo.\n");
    }

    public void reproduzir() {
        System.out.println("O "+nome + " está se reproduzindo.\n");
    }
}

