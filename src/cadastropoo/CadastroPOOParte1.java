package cadastropoo;

import cadastropoo.model.*;
import cadastropoo.model.PessoaJuridica;
import cadastropoo.model.PessoaJuridicaRepo;


public class CadastroPOOParte1 {
    
    private final String FILE1;
    private final String FILE2;
    
    public CadastroPOOParte1() {
        FILE1 = "resources/pf.dat";
        FILE2 = "resources/pj.dat";
    }
    
    private void run() {
        pfTest();
        pjTest();
    }
    
    private void pfTest() {
        PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
        PessoaFisica1 pf1 = new PessoaFisica1(1, "Ana", "11111111111", 25);
        PessoaFisica1 pf2 = new PessoaFisica1(2, "Carlos", "22222222222", 52);
        repo1.inserir(pf1);
        repo1.inserir(pf2);
        repo1.persistir(FILE1);
        System.out.println("Dados de Pessoa Fisica Armazenados.");
        PessoaFisicaRepo repo2 = new PessoaFisicaRepo();
        repo2.recuperar(FILE1);
        System.out.println("Dados de Pessoa Fisica Recuperados.");
        for (PessoaFisica1 pf : repo2.obterTodos()) {
            pf.exibir();
        }
    }
    
    private void pjTest() {
        PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();
        PessoaJuridica pj1 = new PessoaJuridica(3, "XPTO Sales", "333333333333");
        PessoaJuridica pj2 = new PessoaJuridica(4, "XPTO Solutions", "444444444444");
        repo3.inserir(pj1);
        repo3.inserir(pj2);
        repo3.persistir(FILE2);
        System.out.println("Dados de Pessoa Juridica Armazenados.");
        PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();
        repo4.recuperar(FILE2);
        System.out.println("Dados de Pessoa Juridica Recuperados.");
        for (PessoaJuridica pj : repo4.obterTodos()) {
            pj.exibir();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new CadastroPOOParte1().run();
    }
    
}
