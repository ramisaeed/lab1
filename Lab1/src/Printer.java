public class Printer {

   

    public static void main(String[] args) throws Exception {

        String part1 = "There will be ";

        String part2 = 	" people for dinner.";
        String 	visitors  = "5";


       // System.out.println("Hello, World!");
       System.out.println(part1   +  (visitors)   +2  + part2);
        System.out.println(part1   + Integer.sum(Integer.valueOf(visitors),2)     + part2);

    }
    
    

    

}
