package programs;
public class Recursion {
    public int product(int intNum1, int intNum2){
        if(intNum2 == 1)
            return intNum1;
        else
            return product(intNum1, intNum2-1) + intNum1;
    }
    
    public int seriesodd(int intNum){
        if(intNum == 1)
            return 1;
        else
            return seriesodd(intNum - 1) + intNum*2-1;
    }
    
    public int factorial(int intNum){
        if(intNum == 1)
            return 1;
        else
            return factorial(intNum-1)*intNum;
    }
    
    public int perfect(int intNum){
        //no direct single parameter recursion
        return 0;
    }
    
    public int gcf(int intNum1, int intNum2){
        if(intNum1%intNum2==0)
            return intNum2;
        else
            return gcf(intNum2, intNum1%intNum2);
    }
    
    public int fibonacci(int intNum){
        if(intNum==1 || intNum==2)
            return 1;
        else
            return fibonacci(intNum-1) + fibonacci(intNum-2);
    }
    
    public int serieseven(int intNum){
        if(intNum == 1)
            return 2;
        else
            return serieseven(intNum - 1) + intNum*2;
    }   
    
    public int digits(int intNum){
        if(intNum==0)
            return 0;
        else
            return digits(intNum/10) + 1;
    }
    
    public int reversed(int intNum){    //practicing helper function here
        return reversedhelper(intNum, 0);
    }
    
    public int reversedhelper(int intNum, int intReversed){
        if(intNum==0)
            return intReversed;
        else
            return reversedhelper(intNum/10,intReversed*10+intNum%10);
    }
        
    public boolean containsCharacter(){
        //requires helper function, recursion control just adds to index checked
        return false;
    }
}
