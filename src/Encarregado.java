import java.util.List;

public class Encarregado extends Funcionario {
    private final double salario;
    private List<Funcionario> funcionarios; // Um encarregado pode ter uma lista de funcionarios.

    public Encarregado(String nome, String sobrenome, double salario) {
        super(nome, sobrenome);
        this.salario = salario;
        Funcionario.funcionarios.add(this);
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public Double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Encarregado {" +
                "Nome= " + getNome() +
                " Sobrenome= " + getSobrenome() +
                " salario= " + getSalario() +
                '}';
    }

    @Override
    double calcularSalario() {
        return salario;
    }

    @Override
    public Boolean IsFuncionarioChefe() {
        return true;
    }
}

