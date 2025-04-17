public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarioProfessor;

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarioProfessor){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarioProfessor = seminarioProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarioProfessor() {
        return seminarioProfessor;
    }

    public void setSeminarioProfessor(Seminario[] seminarioProfessor) {
        this.seminarioProfessor = seminarioProfessor;
    }
}
