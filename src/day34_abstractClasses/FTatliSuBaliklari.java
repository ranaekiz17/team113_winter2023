package day34_abstractClasses;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.List;

public class FTatliSuBaliklari extends EBalik{


    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }

    @Override
    public void yuzgec() {

    }

    @Override
    public void yasamAlani() {

    }

    @Override
    public void iskeletYapisi() {}


    public static void main(String[] args) {

        // AHayvan hayvan =  new AHayvan();
        // Ebalik balik = new Ebalik();


        FTatliSuBaliklari sazan = new FTatliSuBaliklari();
        EBalik alabalik = new FTatliSuBaliklari();

        /*
        abstract class'larin constructorlari  vardir ama
        obje olusturulamaz

        Abstract classlar data turu secilip
        concrete child class'larin constructor lari kullanilarak
        Abstract parent class ozelliklerinde objeler olusturulabilir
         */


        List<String> liste = new ArrayList<>();
    }

    }

