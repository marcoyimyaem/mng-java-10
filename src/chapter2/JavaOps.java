package chapter2;
import chapter1.LocalVar;
public class JavaOps {
    int person;
    public static void main(String[] args) {
        int expression1 = 10;
        int expression2 = 20;
        boolean isRunning = false;
        System.out.println(expression1++); //expression1 = expression+1
        System.out.println(expression1);

        System.out.println(++expression2);
        System.out.println(expression2);
        System.out.println(!isRunning);
        short bin1 = 0b101;
        // 0101 << 1
        // 1010

        // 0101 >> 1
        // 1010 
        System.out.println(bin1>>>1);
        System.out.println(expression1<expression2);
        System.out.println(expression1>expression2);
        System.out.println(expression1>10);
        System.out.println(expression1<=11);
        LocalVar p1 = new LocalVar();
        p1 = null;
        System.out.println(p1 instanceof LocalVar);
        System.out.println(expression1!=11);
        int x = 5;
        float y = 5.5f;
        System.out.println(x+y);
        System.out.println(Integer.MAX_VALUE + Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        short xx = 10;
        short yy = 3;
        short z = (short) (xx * yy);
        JavaOps jOps  = new JavaOps();
        jOps.mallCounter(3);
        jOps.mallCounter(10);
        jOps.mallCounter(56);
        System.out.println(jOps.person+" Persons entered");
        long a = 10;
        int b = 5;
        // b = b+a;
        // b+=a; b=(int)b+a;
        b+=a;
        System.out.println(b);
        System.out.println( jOps instanceof JavaOps);
        jOps = null;
        System.out.println( jOps instanceof JavaOps);
        



    }
    void mallCounter(int personEntered){
        // person= person+personEntered;
        person+=personEntered;

    }
    
}
