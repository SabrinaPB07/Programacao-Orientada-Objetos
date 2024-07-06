import java.util.*;

public class BibliotecaMusical {
    private Map<String, Musica> acervo = new HashMap<>();
    
    public BibliotecaMusical(Map<String, Musica> acervo){
        this.acervo = acervo;
    }

    public void adicionarusica(String titulo, Musica musica){
        acervo.put(titulo, musica);
    }

    public void listarMusicas(){
        for (Musica musica : acervo.values()) {
            System.out.println(musica);
        }
    }

    public Musica buscarMusica(String titulo) throws MusicaNaoEncontradaException{
        if (acervo.containsKey(titulo)) {
            return acervo.get(titulo);
        } else {
            throw new MusicaNaoEncontradaException();
        }
    }

    public void setAcervo(Map<String, Musica> acervo){
        this.acervo = acervo;
    }
    public Map<String, Musica> getAcervo(){
        return this.acervo;
    }
}
