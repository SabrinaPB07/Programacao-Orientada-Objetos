import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Musica> musica = new ArrayList<>();

        musica.add(new Musica(1, "Thriller", 354, true));
        musica.add(new Musica(2, "Hey Jude", 421, false));
        musica.add(new Musica(3, "Bohemian Rhapsody", 357, true));
        musica.add(new Musica(4, "Skyline Pidgeon", 210, false));
        musica.add(new Musica(5, "Smooth Criminal", 412, true));
       

        for(int i = 0; i < musica.size(); i++){
            if (musica.get(i).isEstaFavoritada() == true){
                System.out.println(musica.get(i).getTitulo());
            } 
        }
    }
}
