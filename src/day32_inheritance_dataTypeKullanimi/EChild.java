package day32_inheritance_dataTypeKullanimi;

public class EChild extends DParent{

    void method1(){
        System.out.println("Child Method 1");


        /*
        Override : gecersiz kilma
        Overriden : gecersiz kilinan
         */
    }

    public static void main(String[] args) {

        EChild childC = new EChild();
        childC.method1(); // Child Method 1
        System.out.println(childC.str); // Child

        DParent childP= new EChild();
        System.out.println(childP.str); // Parent

        childP.method1();  // Child Method 1


    }
}
