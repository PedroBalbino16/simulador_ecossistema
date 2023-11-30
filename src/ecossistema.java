
import animais.*;
import vegetacao.*;
import clima_floresta.*;

public class ecossistema {
    public static void main(String[] args) {
        // Inicialização dos animais
        Lobo lobo = new Lobo("Lobo", 7);
        Cervo cervo = new Cervo("Cervo", 9);
        Gaviao gaviao = new Gaviao("Gavião", 3);
        Aguia aguia = new Aguia("Águia", 4);
        Esquilo esquilo = new Esquilo("Esquilo", 1);
        Coelho coelho = new Coelho("Coelho", 2);

        // Inicialização das plantas
        Arvores carvalho = new Arvores("Carvalhos", 10);
        Cogumelos cogumelos = new Cogumelos("Cogumelos", 3);
        Arbustos framboesa = new Arbustos("Arbustos", 1);

        // Inicialização dos fenômenos naturais
        Tempestade tempestade = new Tempestade("Tempestade de Inverno");

        // Interações
        System.out.println("\n\n       INICIO DE UM DIA NO ECOSSISTEMA       \n\n");
        System.out.println("Todos os animais despertaram \n");
        lobo.movimentar();
        lobo.fazer_som();
        cervo.movimentar();
        gaviao.voar();
        aguia.voar();
        esquilo.movimentar();
        coelho.movimentar();
        lobo.comer();
        cervo.comer();
        esquilo.comer();
        coelho.comer();
        carvalho.crescer();
        cogumelos.crescer();
        carvalho.balancar();
        framboesa.crescer();
        tempestade.iniciarTempestade();
        System.out.println("Os animais se abrigaram\n");
        System.out.println("\n\n        O DIA ACABOU\n\n");
    }
}
