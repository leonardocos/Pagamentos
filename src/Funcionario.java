import java.util.ArrayList;
import java.util.List;

abstract class Funcionario implements IChefe {
    public static final List<Funcionario> funcionarios = new ArrayList<>(); //Constante estática
    private String nome;
    private String sobrenome;
    private Double salario;
    private Encarregado encarregado;

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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Encarregado getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(Encarregado encarregado) {
        this.encarregado = encarregado;
    }

    abstract double calcularSalario();

    public static void mostrarFuncionariosChefeVersaoAntiga() {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).IsFuncionarioChefe()) {
                System.out.println(funcionarios.get(i).getNome());
            }
        }
    }
    public static void mostrarFuncionariosChefeVersaoAtual() {
        for(Funcionario funcionario : funcionarios){
            if(funcionario.IsFuncionarioChefe()){
                System.out.println(funcionario);
            }
        }
    }
    public static void mostrarFuncionariosChefeVersaoFuncional() {
        funcionarios.stream() // manipula a lista, cria cópia na memória
                .filter(f -> f.IsFuncionarioChefe())    //espera condição lógica para filtrar registros
                .forEach(f -> System.out.println(f.getNome()));
    }

    public static void mostrarNaoEncarregado(){
        funcionarios.stream()
                .filter(f -> !f.IsFuncionarioChefe())
                .forEach(f -> System.out.println(f.getNome() + " - Encarregado: " +f.getEncarregado().getNome()));
    }
//    public static void mostrarEncarregado(){
//        funcionarios.stream()
//                .filter(f -> !f.IsFuncionarioChefe())
//                .forEach(f -> System.out.println(f.getEncarregado()));
//    }
}
