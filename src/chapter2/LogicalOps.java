package chapter2;

public class LogicalOps {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean z = true;
        boolean w = false;
        System.out.println("x && y:"+ (x && y));
        System.out.println("x && z:"+ (x && z));
        System.out.println("z && w:"+ (y && w));
        System.out.println("x || y:"+ (x || y));
        System.out.println("x || z:"+ (x || z));
        System.out.println("z || w:"+ (y || w));
        System.out.println(100==100);
        System.out.println(100!=100);
        System.out.println("x==z: "+(x==z));
        int timeOnMe = 20;
        if(timeOnMe>=5 && timeOnMe<12){
            System.out.println("Good morning");
            
            }
        else if(timeOnMe>=12 && timeOnMe<18)
            System.out.println("good afternoon");
        else
            System.out.println("Good evening");
        int number_check=5;
        if((number_check%2)==0)
            System.out.println(number_check+" is an even number");
        else 
            System.out.println(number_check+" is an odd number");
        switch(number_check){
            
            case 1: System.out.println("the number is 1"); break;
            case 2: System.out.println("the number is 2");break;
            default: System.out.println(number_check+" not on the cases");break;
            case 3: System.out.println("the number is 3");break;
            case 4: System.out.println("the number is 4");break;
            
}
    //ternary operator (condition)? True:False;
    //nested ternary operation
    // (condition)? ((condition)? True:False):False;
    // (condition)? True:((condition)? True:False);
        String msg = (number_check%2==0) ? number_check+" is even number" : number_check+" is odd number";
        System.out.println(msg);  
    }
    
}
