package week15d04;

public class CovidStat implements Comparable<CovidStat> {

    private String week;
    private int cases;

    public CovidStat(String week, int cases) {
        this.week = week;
        this.cases = cases;
    }

    public String getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }

    @Override
    public int compareTo(CovidStat o) {
        return o.cases - this.cases;
    }

    @Override
    public String toString() {
        return "CovidStat{" +
                "week='" + week + '\'' +
                ", cases=" + cases +
                '}';
    }
}
