package miprimerhamburguesa;

public class Hamburguesa {

    //Atributos de la hamburguesa
    String tipoDeQueso;
    String tipoDePan;
    boolean estaTostada;

    //Constructor vacio
    public Hamburguesa() {
        this.tipoDePan = "avena";

    }

    //Constructor con valores iniciales
    public Hamburguesa(String tipoDeQueso, 
            String tipoDePan, 
            boolean estaTostada) {
        this.tipoDeQueso = tipoDeQueso;
        this.tipoDePan = tipoDePan;
        this.estaTostada = estaTostada;
    }
    
    
    public void setTipoDeQueso(String tipoDeQueso){
        this.tipoDeQueso = tipoDeQueso;
    }
    public void setTipoDePan(String tipoDePan){
        this.tipoDePan = tipoDePan;
    }
    
    public void setEstaTostada(boolean estaTostada){
        this.estaTostada = estaTostada;
    }
    
    public String getTipoDeQueso(){
        return tipoDeQueso;
    }
    
    public String getTipoDePan(){
        return tipoDePan;
    }
    public boolean getEstaTostada(){
        return estaTostada;
    }
}
