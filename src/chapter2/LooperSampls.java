package chapter2;

public class LooperSampls {
    public static void main(String[] args) {
        
        int x = 1;
        while(x<5)
            System.out.println("x = "+x++);

        int y = 10;
ROW:      do
            System.out.println("y = "+y++);
        while(y<10);
        
        for(int g=0;g<10;g++)
            System.out.println("g = "+g);
        
        // String[] colors = {"Black","Red","Green","White","Pink"};
        String[] colors = new String[5];
        colors[0]= "Black";
        colors[1]= "Red";
        colors[2]= "Green";
        colors[3]= "White";
        colors[4]= "Pink";
CHECKIFWHITE: for (String color : colors) {
            if(color == "White")

                continue CHECKIFWHITE;
            System.out.println("my favorite color is "+ color);
        }
    }
    
}
