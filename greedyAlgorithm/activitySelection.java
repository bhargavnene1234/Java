package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class activitySelection {
    public static void Select(ArrayList<activity> activityList){
        Comparator<activity> comparator=new Comparator<activity>() {
            @Override
            public int compare(activity o1,activity o2){
                return o1.getFinishTime()-o2.getFinishTime();
            }
        };
        Collections.sort(activityList,comparator);
        activity prevActivity=activityList.get(0);
        System.out.println("Recommend schedule : \n"+activityList.get(0));
        for(int index=1;index<activityList.size();index++){
            activity currActivity=activityList.get(index);
            if(currActivity.getStartTime()>=prevActivity.getFinishTime()){
                System.out.println(currActivity+" ");
                prevActivity=currActivity;
            }
        }
    } 
}
