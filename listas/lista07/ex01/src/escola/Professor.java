package escola;

public class Professor extends Usuario {
    private String disciplina;

    public Professor(String disciplina){
        this.disciplina = disciplina;
        super.getNome();
        super.getEmail();
    }

    @Override
    public void exibirInfo(){
        System.out.println(String.format(
            """
            Nome: %s
            E-mail: %s
            Disciplina:
            """,

            super.getNome(),
            super.getEmail(),
            disciplina
        ));
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirDisciplina){
        if ( exibirNome && exibirEmail && exibirDisciplina) {
            super.exibirInfo();
            return;
        }
        this.exibirInfo();
    }

    public void getDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public String setDisciplina(){
        return this.disciplina;
    }

}


