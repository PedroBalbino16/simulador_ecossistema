package animais;

public class Coelho extends Mamiferos {
    public Coelho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void movimentar() {
        System.out.println("O " + nome + " está pulando\n");
    }
    public void comer() {
        System.out.println("O " + nome + " está comendo.\n");
    }

    public void reproduzir() {
        System.out.println("O "+nome + " está se reproduzindo.\n");
    }
}
