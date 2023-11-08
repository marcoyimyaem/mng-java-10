package chapter3;

import java.util.Arrays;

public class ArraySample {
    public static void main(String... args) {
        int[] numbers2 = new int[]{42,55,99};
        int[] numAnimals,numBirds;
        int numAnimals2[],numBirds2;
        numAnimals =  new int[]{42,55,99};
        numBirds = new int[]{42,55,99,1,3,5,88,41,99,44,242,13,8,4,0};
        numAnimals2 =new int[]{42,55,99};
        // numBirds2 = new int[]{42,55,99}; ///error
        System.out.println(numbers2[1]);
        String[] birds = new String[6];
        System.out.println(birds.length);
        int total = 0;
        for(int a: numAnimals2){
            total+=a;
        }
        System.out.println(total);
        System.out.println("unsorted: ");
        for(int a: numBirds)
            System.out.print(a+" ");
        Arrays.sort(numBirds);
        System.out.println("\nsorted: ");
        for(int a: numBirds)
            System.out.print(a+" ");
        System.out.println();
        String[] stringNumbers = {"1","2","5","9","10","101","200","202","405","1405","16","26"};
        Arrays.sort(stringNumbers);
        for(String a: stringNumbers)
            System.out.print(a+" ");
        System.out.println();
        System.out.println(Arrays.binarySearch(numBirds, 100));
        System.out.println(totalAllInt(1,2,3,4,5,6,7,8,9,10));
        // totalAllInt(new int[]{1,2,3,4,5,6,7,8,9,10});
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
        System.out.println(differentSize);
        // differentSize = {{1, 4}, {3}, {9,8,7},{1}}; error
    }

    static int totalAllInt(int... numbers){
        int total = 0;
        for(int number: numbers)
            total+=number;
        return total;
    }
    
}
