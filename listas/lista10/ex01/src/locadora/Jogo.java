package locadora;

public class Jogo implements AudioVisual{

    private String titulo;
    private String plataforma;

    public Jogo(String titulo, String plataforma){
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    @Override
    public void exibirInfo(){
        System.out.println(this.titulo);
        System.out.println(this.plataforma);
    }

    @Override
    public boolean equals(Object objeto){
        if (super.equals(objeto)) {
            return true;
        }

        if (objeto instanceof Jogo) {
            Jogo jogo = (Jogo) objeto;
            if (jogo.getTitulo().equals(this.titulo)) {
                return true;
            }
        }

        return false;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    public String getPlataforma(){
        return this.plataforma;
    }
}
