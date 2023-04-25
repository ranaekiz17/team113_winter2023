package day41_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {

    public static void main(String[] args) {

        // Collections objeleri bir arada tutan yapilardir
        //Gunluk hayatta karsilasilan durumlarla ilgili
        // olusan ihtiyaclara gore collections yapilari vardir

        //Bir uygulamada hangi collection'ı  kullanacagimiza biz ozelligine gore karar veririz

        //3 ana collection'dan bahsedebiliriz
        //1- List
        //2- Queue
        //3- Set
        //4-Interface ile kurallari belirlenir

        /*

        Interface'lerde obje olusturamadigimiz icin
        childclass'lardan constructor'lar kullaniriz

        Ozellikleri constructor'lar degil DATA TURU olarak sectigimiz collection belirler

         */

        LinkedList<String> Linked1 = new LinkedList<>();
        List<String> Linked2 = new LinkedList<>();
        Queue<String> Linked3 = new LinkedList<>();
        Deque<String> Linked4 = new LinkedList<>();
    }
}
