package escola;

public  abstract class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public Usuario(){

    }

    public void exibirInfo(){
        System.out.println(String.format(
            """
            Nome: %s
            E-mail: %s
            """,

            nome,
            email
        ));
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
}
