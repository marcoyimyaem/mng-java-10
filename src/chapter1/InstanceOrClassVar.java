// end of chapter1
package chapter1;
import java.util.Random;
public class InstanceOrClassVar {
    int y;
    String name;
    boolean isRunning;
    public static void main(String[] args) {
        InstanceOrClassVar programm1 = new InstanceOrClassVar();
        System.out.println(programm1.y);
        System.out.println(programm1.name);
        System.out.println(programm1.isRunning);
        InstanceOrClassVar programm2 = new InstanceOrClassVar();
        InstanceOrClassVar programm3 = programm1;
        programm3.y=900;
        programm1.y=800;
        System.out.println(programm1.y+" *** "+programm3.y);
        InstanceOrClassVar programm4;
        programm1 = null;
        programm3=null;
        System.gc();
        System.out.println("after gc");
    }   
   
    
}
