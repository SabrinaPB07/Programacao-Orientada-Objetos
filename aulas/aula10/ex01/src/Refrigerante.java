public class Refrigerante implements liquido{
    private String sabor = "uva";
    private boolean estaComGas = false;

    public String getSabor(){
        return this.sabor;
    }

    public boolean getEstaComGas(){
        return this.estaComGas;
    }
}
