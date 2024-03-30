package divideAndConquer;

public class numberFactor {

    public int numFactor(int num){
        if(num==0 || num==1 || num==2) return 1;
        if(num==3) return 2;
        return numFactor(num-4)+numFactor(num-3)+numFactor(num-1);
    }
}
