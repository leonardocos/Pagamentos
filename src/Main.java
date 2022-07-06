import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FuncionarioPessoaFisica pf = new FuncionarioPessoaFisica("Leonardo", " da Costa", 4000.00);
        FuncionarioPessoaJuridica pj = new FuncionarioPessoaJuridica("Bruno", " Tomaz", 45.00, 160);
        Encarregado enc = new Encarregado("Douglas", "Duarte", 8000.00);
        FuncionarioPessoaJuridica pj2 = new FuncionarioPessoaJuridica("Sidnei", "Magal", 48.00, 160);
        FuncionarioPessoaFisica pf2 = new FuncionarioPessoaFisica("Roberto", "Carlos", 4800.00);
        FuncionarioPessoaFisica pf3 = new FuncionarioPessoaFisica("Cristiano", "Ronaldo", 9300.00);
        Encarregado enc2 = new Encarregado("Vinícius", "Júnior", 11200.00);
        pf.definirEncarregado(enc2);
        pj.definirEncarregado(enc2);
        pj2.definirEncarregado(enc);
        pf2.definirEncarregado(enc);
        pf3.definirEncarregado(enc);
        System.out.println("-----------------------------");
        System.out.println("Encarregados: ");
        Funcionario.mostrarFuncionariosChefeVersaoAntiga();
        Funcionario.mostrarFuncionariosChefeVersaoAtual();
        Funcionario.mostrarFuncionariosChefeVersaoFuncional();
        System.out.println("--------------------");
        System.out.println("Não encarregados: ");
        Funcionario.mostrarNaoEncarregado();
    }
}