package programs;
public class Midterm {
    public static void main(String[] args) {
        Functions clFunctions = new Functions();
        Recursion clRecursion = new Recursion();
        
        System.out.println("Repetitive addition of 5 x 4: "+ clRecursion.product(5, 4));
        System.out.println("Sum of odd series with 5 terms is:  "+ clRecursion.seriesodd(5));
        System.out.println("The factorial of 4 is:  "+ clRecursion.factorial(4));
        if (clFunctions.perfect(6))
            System.out.println("6 is a perfect number");
        else
            System.out.println("6 is not a perfect number");
        System.out.println("The GCF of 25 and 125 is:  "+ clRecursion.gcf(125, 25));
        System.out.println("The 7th term in the fibonacci sequence is:  "+ clRecursion.fibonacci(7));
        
        
        System.out.println("Sum of even series with 5 terms is:  "+ clRecursion.serieseven(5));
        System.out.println("123456 has "+ clRecursion.digits(123456)+" digits");
        System.out.println("The reversed digits of 123456 is: "+ clRecursion.reversed(123456));
        if (clFunctions.containsCharacter("Yelp",'o'))
            System.out.println("String contains the character");
        else
            System.out.println("String does not contain the character");
    }    
}
