public class FuncionarioPessoaJuridica extends Funcionario {
    private double valorHora;
    private double quantidadeHorasTrabalhadasMes;

    public FuncionarioPessoaJuridica(String nome, String sobrenome, double valorHora, double quantidadeHorasTrabalhadasMes) {
        super(nome, sobrenome);
        this.valorHora = valorHora;
        this.quantidadeHorasTrabalhadasMes = quantidadeHorasTrabalhadasMes;
        Funcionario.funcionarios.add(this);
    }

    @Override
    public String toString() {
        return "FuncionarioPessoaJuridica{" +
                "Nome= " + getNome() + "\n" +
                "Sobrenome= " + getSobrenome() + "\n" +
                "valorHora=" + valorHora + "\n" +
                ", quantidadeHorasTrabalhadasMes=" + "\n" +
                quantidadeHorasTrabalhadasMes +
                '}';
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantidadeHorasTrabalhadasMes() {
        return quantidadeHorasTrabalhadasMes;
    }

    public void setQuantidadeHorasTrabalhadasMes(double quantidadeHorasTrabalhadasMes) {
        this.quantidadeHorasTrabalhadasMes = quantidadeHorasTrabalhadasMes;
    }

    @Override
    public double calcularSalario(){
        return quantidadeHorasTrabalhadasMes * valorHora;
    }
}
