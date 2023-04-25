package day03_dataCasting;

public class C06_ExplicitNarroving {

    public static void main(String[] args) {

        double db1 = 45.32;

        int in1= (int) db1; // int <=== double

        System.out.println(in1); // 45 ondalikli kismi atti

        db1 =384940340564564d;

        in1 = (int)db1; // int << === double

        System.out.println(in1);




    }
}
