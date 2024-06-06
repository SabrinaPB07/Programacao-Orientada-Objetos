package escola;

public class Aluno extends Usuario {
    private String matricula;

    public Aluno(String matricula){
        this.matricula = matricula;
        super.getNome();
        super.getEmail();
    }

    @Override
    public void exibirInfo(){
        System.out.println(String.format(
        """
        Nome: %s
        E-mail: %s
        Matrícula: %s
        """,
        super.getNome(),
        super.getEmail(),
        matricula
        ));
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula){
        if ( exibirNome && exibirEmail && exibirMatricula) {
            super.exibirInfo();
            return;
        }
        this.exibirInfo();
    }

    public  void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }
}
