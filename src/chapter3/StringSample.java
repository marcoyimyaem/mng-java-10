package chapter3;

public class StringSample {
    public static void main(String[] args) {
        String name = "Marco";
        String name2 = new String("Marco");
        System.out.println(name2==name);

        String a = "1";
        String b = a.concat("2"); // 12
        b.concat("3"); //123
        System.out.println(b);
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('r'));
        System.out.println(name.equals("marco"));
        System.out.println(name.equalsIgnoreCase("marco"));
        System.out.println(name.startsWith("Mar"));
        System.out.println(name.contains("ar"));
        System.out.println(name.replace("Mar","Nic"));
        System.out.println(name);

        
    }
}
