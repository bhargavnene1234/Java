package divideAndConquer;

public class fibonacci {
    public int Fibonacci(int index){
        if(index<=0){
            System.out.print("invalid value ");
            return -1;
        }
        if(index==1) return 0;
        if(index==2) return 1;      
        return Fibonacci(index-1)+Fibonacci(index-2);
    }
}
