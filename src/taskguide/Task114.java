package taskguide;

public class Task114 {
    public static void main(String[] args) {
        int score = 55;
        if(score>90 && score<=100 )
            System.out.println("A grade");
        else if(score>80 && score<=89 )
            System.out.println("B grade");
        else if(score>70 && score<=79 )
            System.out.println("C grade");
        else if(score>60 && score<=69 )
            System.out.println("D grade");
        else
            System.out.println("F grade");
        
    }
}

// A score of 90 to 100 gets an A grade
// A score between 80 to 89 gets a B grade
// A score between 70 to 79 gets a C grade
// A score between 60 to 69 gets a D grade
// A score below 60 gets an F grade
