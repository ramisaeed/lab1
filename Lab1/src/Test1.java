import java.util.Random;

public class Test1 {
    

    public static void main(String[] args) throws Exception {
    


        Random r = new Random();
int low = 100;
int high = 350;
int num = r.nextInt(high-low) + low;
System.out.println( "the time in minutes "  + num) ;

System.out.println( "the time in hours"  +(float) num/ 60 );

System.out.println( "the time in terms of Hours and Minutes "  + num/ 60   + ":"  +  num% 60) ;

    }

}
