package veiculos;

public class Carro implements Veiculo{
    private String modeloCarro;
    private String buzina;


    public Carro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
    public Carro(){
        
    }

    @Override
    public void acelerar(){
        if (modeloCarro.equals("formula 1")) {
            System.out.println("VUUUUUUUUUUUUUUUUUUEEEEEEEEEEEEUUUUUU");
        } else{
            System.out.println("VROMM VROMM");
        }
    }

    @Override
    public void frear(){
        System.out.println("shhhhhhhuuuu...");
    }

    public void setmodeloCarro(String modeloCarro){
        this.modeloCarro = modeloCarro;
    }
    public String getmodeloCarro(){
        return this.modeloCarro;
    }

    public void setBuzina(String buzina){
        this.buzina = buzina;
    }
    public void getBuzina(){
        System.out.println("BIIBIIIIIIIIIIIIII");
    }


}
