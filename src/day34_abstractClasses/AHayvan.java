package day34_abstractClasses;

public abstract class AHayvan {

    /*
     Bir class'ı abstract class yapmak icin deklerasyona
     abstract keyword'unu yazmak yeterlidir.

     Abstract class'lardan class olduklari icin constructor'lari vardir
     ama abstract class'lardan obje olusturulamaz

     Abstract class'larda bugune kadar kullandıgımız yapida
     methodlar olusturabiliriz ancak bunlar child classlar tarafindan uyarlanmak
     (override) zorunda olmaz

     Child class  uyarlamaya mevbur etmek istedigimiz methodlari da abstract yapmaliyiz

   Abstract class'larda bugune kadar kullandigimiz yapida
        method'lar olusturabiliriz ancak bunlar child class'lar tarafindan
        uyarlanmak(override) zorunda olmaz
        Child class'lari uyarlamaya mecbur etmek istedigimiz method'lari da
        abstract yapmaliyiz
        bir method'u abstract yapmak icin
        declaration'ina abstract yazmamiz yeterlidir
     */
    public abstract void hareket();
    public abstract void solunum();
    public abstract void beslenme();
    public abstract void cogalma();

    public abstract void omur();

}