package animais;

public class Lobo extends Mamiferos {
    public Lobo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void movimentar() {
        System.out.println(nome + "  está se movimentando\n");
    }

    public void fazer_som(){
        System.out.println("O " + nome + " Está uivando.\n");
    }
    
}
