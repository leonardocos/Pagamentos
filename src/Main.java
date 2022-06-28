import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FuncionarioPessoaFisica pf = new FuncionarioPessoaFisica("Leonardo", " da Costa", 4000.00);
        System.out.println(pf);
        //System.out.println("Funcionário: " + pf.getNome() + pf.getSobrenome());
        //System.out.println("Valor do pagamento: " + pf.calcularSalario());

        FuncionarioPessoaJuridica pj = new FuncionarioPessoaJuridica("Bruno", " Tomaz", 45.00, 160);
        System.out.println(pj);
        //System.out.println("Funcionário " + pj.getNome() + pj.getSobrenome());
        //System.out.println("Valor do pagamento: " + pj.calcularSalario());

    }
}
