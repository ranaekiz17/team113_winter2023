package day26_localTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodTime {

    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1980,1,1);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun));  //  P43Y2M8D

        System.out.println(" yas :" +Period.between(dogumTarihi, bugun).getYears()); //   yas :43
        System.out.println(" yas :"  +Period.between(dogumTarihi, bugun).getDays());


    }
}
