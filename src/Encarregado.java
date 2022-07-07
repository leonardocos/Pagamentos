import java.util.ArrayList;
import java.util.List;

public class Encarregado extends Funcionario {
    private final double salario;
    private List<Funcionario> funcionarios = new ArrayList<>(); // Um encarregado pode ter uma lista de funcionarios.

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

    // Formata os dados da classe.
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

    // Atribui valor true ou false para a condição da interface.
    @Override
    public Boolean IsFuncionarioChefe() {
        return true;
    }

    // Adiciona um funcionário na lista de funcionários do encarregado.
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    // Mostra os funcionarios que cada encarregado possui.
    public void mostrarFuncionarios(){
        System.out.println("Encarregado: " + getNome());
        funcionarios.forEach(f -> System.out.println(f.getNome())); // para cada item, printa o nome na tela.
    }
}

