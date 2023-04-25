package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_checkedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
        Checked exceptions kod yailir yazilmaz , daha run etmeden
        javanin riskli kodlari tanimlayip
        calistirmadan once bana bir yol
         */


        String dosyaYolu= "src/day36_exceptions/text.txt";

        FileInputStream fis = new FileInputStream(dosyaYolu);
    }
}
