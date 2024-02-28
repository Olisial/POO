package primeiro_exemplo;

import modelos.Pessoa;
import modelos.PessoaFisica;

public class Ola {
    public static void main(String[] args) {
        System.out.println("oii!");

        Pessoa p1 = new Pessoa();
        p1.setNome("Laís");
        System.out.println(p1.getNome());

        PessoaFisica p2 = new PessoaFisica();
        p2.setNome(": NOVO");
        p2.setIdade(20);
        System.out.println(p2.getNome());
    }
}