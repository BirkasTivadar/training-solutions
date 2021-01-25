package timesheet;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class TimeSheetItem {
    private Employee employee;
    private Project project;
    private LocalDateTime beginDate;
    private LocalDateTime endDate;

    public TimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
        if (!beginDate.toLocalDate().equals(endDate.toLocalDate()) || beginDate.isAfter(endDate)) {
            throw new IllegalArgumentException("Wrong begin or end date.");
        }
        this.employee = employee;
        this.project = project;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }

    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public long hoursBetweenDates() {
        return Duration.between(beginDate, endDate).toHours();
    }

}
