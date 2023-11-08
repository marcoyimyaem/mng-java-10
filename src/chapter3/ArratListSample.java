package chapter3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArratListSample {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        System.out.println(numbers);
        numbers.add(0,99);
        System.out.println(numbers);
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("pink");
        colors.add("green");
        colors.add("blue");
        System.out.println(colors);
        System.out.println(colors.remove(1)+" has been removed.");
        // System.out.println(colors.remove("blue"); //prints true
        String updatedColor = "gray";
        System.out.println("set color of "+colors.set(3,updatedColor )+" to "+updatedColor);
        // System.out.println(colors.set(5,"gray")); //error java.lang.IndexOutOfBoundsException
        System.out.println(colors);
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        System.out.println(birds); // [blue jay, cardinal, hawk, robin]
        // birds.add(5, "crow"); //error java.lang.IndexOutOfBoundsException
        birds.clear();
        System.out.println(birds);
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two)); // true
        one.add("a"); // one = [a] **** two []
        System.out.println(one.equals(two)); // false
        two.add("a"); // one = [a] **** two [a]
        System.out.println(one.equals(two)); // true
        one.add("b"); //one =  [a,b]**** two []
        two.add(0, "b"); // one =  [a,b]**** two [b,a]
        System.out.println(one.equals(two)); // false
        int primitive = Integer.parseInt("123");
        primitive+=300;
        System.out.println(primitive);
        Integer wrapper = Integer.valueOf("123");
        
        System.out.println(wrapper.compareTo(primitive));
        System.out.println(Integer.max(primitive, primitive));
        int primitive2 = Integer.parseInt("123");
        primitive2 = Integer.valueOf("123");
        
        Integer wrapper2 = Integer.valueOf("123");
        wrapper2 = Integer.parseInt("123");
        System.out.println(wrapper2);
        System.out.println(primitive2);
        List numbers2 = new ArrayList<>();
        numbers2.add(1); numbers2.add(2);
        System.out.println(numbers2);
        numbers2.remove(1);
        System.out.println(numbers2);
        
        // list.toArray

        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]);
        list.add("crow");
        list.add("dove");
        
        System.out.println(list);

        for(String p: stringArray)
            System.out.print(p+", ");
        System.out.println(stringArray.length); // 2

        // Arrays.asList

        String[] array2 = { "hawk", "robin" }; // [hawk, robin]
        List<String> list2 = Arrays.asList(array2); // returns fixed size list
        System.out.println(list.size()); // 2
        list2.set(1, "test"); // [hawk, test]
        array2[0] = "new"; // [new, test]
        Collections.reverse(list2); //[new, test] => [test, new]
        for (String b : array2) 
            System.out.print(b + " "); //new test
        System.out.println("\n"+list2); //
        // list2.remove(1); // java.lang.UnsupportedOperationException
       // list2.add("Maya"); // java.lang.UnsupportedOperationException

    //    sort
        List<Integer> numbers3 = Arrays.asList(1,3,5,7,5,8,5,2,5,5,8544,34,88,44,333238,78,234,8678);
        System.out.println(numbers3);
        Collections.sort(numbers3);
        System.out.println(numbers3);
        Collections.reverse(numbers3);
        System.out.println(numbers3);
        System.out.println("the highest number is "+ Collections.max(numbers3));
        
    }
    
}
