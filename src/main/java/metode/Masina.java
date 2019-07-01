package metode;

public class Masina {

    //field
    private int viteza;
    private String culoare;
    private Marca marca;

    //constructor
    public Masina(int viteza, String culoare,Marca marca){
        this.viteza = viteza;
        this.culoare = culoare;
        this.marca = marca;
    }

    //metode
    public String getCarDetails(){
        return "culoare : " + culoare + " marca: " + marca+ " viteza: " + viteza;
    }



}
