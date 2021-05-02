package stringconcat.employee;

public class Employee {

    private String name;

    private String job;

    private int salary;

    public Employee(String name, String job, int salary) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        if (job == null || job.isBlank()) {
            throw new IllegalArgumentException("Job must not be empty.");
        }
        if (salary < 1000 || salary % 1000 != 0) {
            throw new IllegalArgumentException("Salary must be positive.");
        }
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return String.format("%s - %s - %d Ft", name, job, salary);
    }
}
