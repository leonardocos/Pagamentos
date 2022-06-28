import java.util.ArrayList;
import java.util.List;

abstract class Funcionario {
    public static final List<Funcionario> funcionarios = new ArrayList<>(); //Constante estática
    private String nome;
    private String sobrenome;
    private Double salario;

    public Funcionario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalario(double valorMes) {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    abstract double calcularSalario();
}
