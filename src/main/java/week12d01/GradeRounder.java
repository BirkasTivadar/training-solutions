package week12d01;

public class GradeRounder {

    public int[] roundGrades(int[] grades) {
        int size = grades.length;
        int[] result = new int[size];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] <= 40) {
                result[i] = grades[i];
            } else {
                int remain = grades[i] % 5;
                if(remain < 3){
                    result[i] = (grades[i]/5)*5;
                } else {
                    result[i] = ((grades[i]/5)+1)*5;
                }
            }
        }
        return result;
    }
}
