package aplicacao;

import threads.Contador1;
import threads.Contador2;

public class TesteThreads {
    public static void main(String[] args) throws InterruptedException {

        Thread threadContadorHeranca = new Contador2();
        Thread threadContadorInterface = new Thread(new Contador1());

        threadContadorHeranca.start();
        threadContadorInterface.start();
    }
}
