package animais;

public class Cervo extends Mamiferos {
    public Cervo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void movimentar() {
        System.out.println("O " + nome + " está se movimentando\n");
    }
    public void comer() {
        System.out.println("O " + nome + " está comendo.\n");
    }

    public void reproduzir() {
        System.out.println("O "+nome + " está se reproduzindo.\n");
    }
}
