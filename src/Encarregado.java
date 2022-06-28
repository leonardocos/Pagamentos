public class Encarregado extends Funcionario{
    private double salario;

    public Encarregado(String nome, String sobrenome, double salario) {
        super(nome, sobrenome);
        this.salario = salario;
        Funcionario.funcionarios.add(this);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    double calcularSalario() {
        return 0;
    }
}
