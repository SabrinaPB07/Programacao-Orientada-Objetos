public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        do{
            try{
                Usuario usuario = new Usuario(
                    Scanner.nextLine(), //nome
                    Integer.parseInt(scanner.nextLine()) //idade
                );

                System.out.println(usuario.getNome());
                System.out.println(usuario.getIdade());
                break;

            } catch(NomeInvalidoException | IdadeInvalidaException e){
                System.ou.println(e.getMessage());
            }catch(Exception e){
                System.out.println("ocorreu um erro, tente novamente");
            }
        } while(true);

      

        System.out.println("fim");
    }
}
