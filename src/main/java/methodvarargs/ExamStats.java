package methodvarargs;

import java.util.Arrays;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }




    public int getNumberOfTopGrades(int limitInPercent, int... results){
        if(results == null || results.length == 0){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int limit =maxPoints*limitInPercent/100;
        int sum = 0;
        for(int result : results){
            if(result>limit){
                sum++;
            }
        }
        return sum;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results){
        if(results == null || results.length == 0){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int limit =maxPoints*limitInPercent/100;
        for(int result : results){
            if(result<limit){
                return true;
            }
        }
        return false;
    }
}
