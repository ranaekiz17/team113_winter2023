package day22_constructors;

public class C06_Araba {

    int yil;
    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    boolean hasarliMi;

    int fiyat;

    public void yakiitTuketimi (String yakitTuru){

        switch (yakitTuru){
            case "Benzin":
                System.out.println("benzinli araclar icin yakit  tuketimi : 6l/100 km");
                break;
            case "dizel":
                System.out.println("dizel araclar icin yakit tuketimi 4l/100 km ");
                break;
            case "Elektrik":
                System.out.println("");
                break;
            default:
                System.out.println();
        }

    }

}
