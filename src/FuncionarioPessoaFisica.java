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

    @Override
    public Boolean IsFuncionarioChefe() {
        return false;
    }

    public void definirEncarregado(Encarregado encarregado){
        this.setEncarregado(encarregado);
    }
}
