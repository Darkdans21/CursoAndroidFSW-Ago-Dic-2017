package miprimerhamburguesa;

public class MiPrimerHamburguesa {

    public static void main(String[] args) {
        System.out.println("Hola hamburguesa. :)");
        Hamburguesa burger = new Hamburguesa();
        System.out.println(burger.getTipoDePan());
        burger.setTipoDePan("Ajo");
        System.out.println(burger.getTipoDePan());
        Hamburguesa burger2 = new Hamburguesa("Manchego",
                "Integral",true);
        System.out.println(burger2.getTipoDePan());
        System.out.println(burger2.getTipoDeQueso());
    }
}
