public class Atleta {
    String nome;
    int idade;
    double altura;
    double peso;
    char genero;
    int velocidade;
    boolean estaTreinado;

    public void socar(){
        System.out.println("AAAAAAAA SOCO TOMAAA");
    }

    public void correr(){
        if (velocidade > 5 ){
            System.out.println("correu demais!!!");
        } else{
            System.out.println("ANDOU RAPIDINHO");
        }
    }

}


