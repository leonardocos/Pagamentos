import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FuncionarioPessoaFisica pf = new FuncionarioPessoaFisica("Leonardo", " da Costa", 4000.00);
        FuncionarioPessoaJuridica pj = new FuncionarioPessoaJuridica("Bruno", " Tomaz", 45.00, 160);
        Encarregado douglas = new Encarregado("Douglas", "Duarte", 8000.00);
        FuncionarioPessoaJuridica pj2 = new FuncionarioPessoaJuridica("Sidnei", "Magal", 48.00, 160);
        FuncionarioPessoaFisica pf2 = new FuncionarioPessoaFisica("Roberto", "Carlos", 4800.00);
        FuncionarioPessoaFisica pf3 = new FuncionarioPessoaFisica("Cristiano", "Ronaldo", 9300.00);
        Encarregado vinicius = new Encarregado("Vinícius", "Júnior", 11200.00);

        pf.definirEncarregado(vinicius);
        pj.definirEncarregado(vinicius);
        pj2.definirEncarregado(douglas);
        pf2.definirEncarregado(douglas);
        pf3.definirEncarregado(douglas);

        System.out.println("-----------------------------");
        System.out.println("Encarregados: ");
        Funcionario.mostrarFuncionariosChefeVersaoAntiga();
        Funcionario.mostrarFuncionariosChefeVersaoAtual();
        Funcionario.mostrarFuncionariosChefeVersaoFuncional();

        System.out.println("--------------------");
        System.out.println("Não encarregados: ");
        Funcionario.mostrarNaoEncarregado();

        System.out.println("--------------------");
        System.out.println("Funcionários dos encarregados");
        System.out.println();
        douglas.mostrarFuncionarios();
        System.out.println();
        vinicius.mostrarFuncionarios();
    }
}