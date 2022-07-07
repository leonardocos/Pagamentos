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
        return "FuncionarioPessoaFisica {" +
                "Nome= " + getNome() +
                " Sobrenome= " + getSobrenome() +
                " valorMes= " + getValorMes() +
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

    // Atribui valor true ou false para a condição da interface.
    @Override
    public Boolean IsFuncionarioChefe() {
        return false;
    }

    // Define o encarregado do funcionário.
    public void definirEncarregado(Encarregado encarregado){
        this.setEncarregado(encarregado);   // define o encarregado através do construtor.
        encarregado.adicionarFuncionario(this); // coloca o funcionário dentro da lista do encarregado.
    }
}
