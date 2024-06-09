public class Usuario {
    private String nome;
    private int idade;


    public Usuario(String nome, int idade) throws NomeInvalidoException, IdadeInvalidaException{
        setNome(nome);
        setIdade(idade)
    }

    public void setNome (String nome){
        if(!nome.isBlank()) {
            this.nome = nome;
        } else {
            throw new NomeInvalidoException();
        }
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if(idade >= 0){
        this.idade = idade;
        } else{
            throw new IdadeInvalidaException();
        }
    }
    public int getIdade(){
        return this.idade;
    }
    
}
