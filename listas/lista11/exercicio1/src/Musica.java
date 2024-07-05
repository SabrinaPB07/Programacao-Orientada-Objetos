import java.util.*;

public class Musica {
    private String titulo;
    private String artista;
    private String album;

    public Musica(String titulo, String artista, String album){
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof Musica) {
            Musica musica = (Musica) object;
            if (musica.titulo.equalsIgnoreCase(this.titulo)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format(
            """
             Titulo: %s,
             Artista: %s,
             Album: %s  
            """,
            this.titulo,
            this.artista,
            this.album
        );
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setArtista (String artista){
        this.artista = artista;
    }
    public String getArtista(){
        return this.artista;
    }

    public void setAlbum(String album){
        this.album = album;
    }
    public String getAlbum(){
        return this.album;
    }
}
