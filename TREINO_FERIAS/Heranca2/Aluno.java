package TREINO_FERIAS.Heranca2;

public class Aluno extends Pessoa2 {

    //Aqui já a herança é de para DIFERENÇA
    private int matricula;
    private String curso;
    
    public void  pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno do " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + getNome() + ",curso de " + curso + ", matricula nº " + matricula + "]";
    }
}
