package animais;

public class Esquilo extends Mamiferos {
    public Esquilo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void movimentar() {
        System.out.println(nome + " está se movimentando\n");
    }
    public void comer() {
        System.out.println("O " + nome + " está comendo.\n");
    }

    public void reproduzir() {
        System.out.println("O "+nome + " está se reproduzindo.\n");
    }   
}
