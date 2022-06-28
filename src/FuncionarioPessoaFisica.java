import java.util.List;
public class FuncionarioPessoaFisica extends Funcionario {
    private  double valorMes;

    public FuncionarioPessoaFisica(String nome, String sobrenome, double valorMes) {
        super(nome, sobrenome);
        this.valorMes = valorMes;
        Funcionario.funcionarios.add(this);
    }

    @Override
    public String toString() {
        return "FuncionarioPessoaFisica{" +
                "Nome= " + getNome() + "\n" +
                "Sobrenome= " + getSobrenome() + "\n" +
                "valorMes= " + getValorMes() + "\n" +
                '}';
    }

    public double getValorMes() {
        return valorMes;
    }

    public void setValorMes(double valorMes) {
        this.valorMes = valorMes;
    }

    @Override
    public double calcularSalario(){
        return valorMes;
    }
}
