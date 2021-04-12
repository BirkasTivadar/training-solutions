package week12d05;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {

    public List<Employee> countSeniorDevs(List<Employee> employees) {
        return employees.stream().filter(e -> e.getSkillLevel() >= 3 && e.getSkills().contains("programming")).collect(Collectors.toList());
    }
}
