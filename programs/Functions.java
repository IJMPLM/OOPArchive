package programs;
public class Functions {
    //Aug 31 discussion
    public int product(int intNum1, int intNum2){
        int intSum = 0;
        for(int intCounter = 0; intCounter < intNum2; intCounter++){
            intSum += intNum1;
        }
        return intSum;
    }
    
    public int seriesodd(int intNum){
       int intSum = 0;
       for(int intCounter = 0; intCounter < intNum; intCounter++){
           intSum += 2*intCounter + 1;
       }
       return intSum;
    }
    
    public int factorial(int intNum){
        int intFactorial = 1;
        for(int intCounter = 1; intCounter <= intNum; intCounter++){
            intFactorial *= intCounter;
        }
        return intFactorial;
    }
    
    public boolean perfect(int intNum){
        int intSum = 0;
        for(int intCounter = 1; intCounter <= intNum/2; intCounter++){
            if(intNum % intCounter == 0)
                intSum += intCounter;
        }
        return intNum == intSum;
    }
    
    public int gcf(int intNum1, int intNum2){   //works regardless of order since if intNum2 is larger, it will just be the remainder in the next iteration
        int intRemainder = 1;
        while(intRemainder != 0){
            intRemainder = intNum1%intNum2;
            intNum1 = intNum2;
            intNum2 = intRemainder;
        }
        return intNum1;
    }
    
    public int fibonacci(int intNum){
        int intFibonacci1 = 1, intFibonacci2 = 1, intFibonacci3 = 0;
        if (intNum==1 || intNum==2)
            return 1;
        for (int intCounter = 2; intCounter < intNum; intCounter++){
            intFibonacci3 = intFibonacci1 + intFibonacci2;
            intFibonacci1 = intFibonacci2;
            intFibonacci2 = intFibonacci3;
        }
        return intFibonacci3;
    }
    
    //Sept 7 Activity
    public int serieseven(int intNum){
       int intSum = 0;
       for(int intCounter = 1; intCounter <= intNum; intCounter++){
           intSum += 2*intCounter;
       }
       return intSum;
    }
    
    public int digits(int intNum){
        int intCounter = 0;
        while(intNum != 0){
            intNum/=10;
            intCounter++;
        }
        return intCounter;
    }
    
    public int reversed(int intNum){
        int intReversed = 0;
        if(intNum < 10)
            return intNum;
        while(intNum>0){
            intReversed = intReversed*10+intNum%10;
            intNum = intNum/10;
        }
        return intReversed;
    }
    
    public boolean containsCharacter(String strCharacterArray, char charKey) {
        char[] charArray = strCharacterArray.toCharArray();
        for (char c : charArray) {
            if (c == charKey) {
                return true; 
            }
        }
        return false;
    }
}
