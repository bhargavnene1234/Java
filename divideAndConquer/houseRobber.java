package divideAndConquer;

public class houseRobber {
    private int maxValueHouse(int[] houses,int currentHouse){
        if(currentHouse>=houses.length){
            return 0;
        }
        int stealFirst=houses[currentHouse]+maxValueHouse(houses, currentHouse+2);
        int skipFirst=maxValueHouse(houses, currentHouse+1);
        return Math.max(stealFirst, skipFirst);
    }

    public int HouseRobber(int[] houses){
       return maxValueHouse(houses, 0);
        
    }
}
