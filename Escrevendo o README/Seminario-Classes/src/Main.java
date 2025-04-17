public class Main {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Pedro", 13);
        Aluno[] alunos = {aluno};
        Professor professor = new Professor("Oclande","Ciências");
        Seminario seminario = new Seminario("Teoria da Evolução das Espécies",local ,alunos);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarioProfessor(seminariosDisponiveis);
    }
}