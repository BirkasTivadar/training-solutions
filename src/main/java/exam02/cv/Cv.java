package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {
    private String name;

    private List<Skill> skills = new ArrayList<>();

    public List<Skill> getSkills() {
        return skills;
    }

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSkills(String... skillStrings) {
        for (String skillString : skillStrings) {
            int length = skillString.length();
            String skillName = skillString.substring(0, length - 4);
            Integer skillLevel = Integer.parseInt(skillString.substring(length - 2, length - 1));
            this.skills.add(new Skill(skillName, skillLevel));
        }
    }

    public int findSkillLevelByName(String skillName){
        for(Skill skill : skills){
            if(skillName.equals(skill.getName())){
                return skill.getLevel();
            }
        }
        throw new IllegalArgumentException("Invalid skill name.");
    }

}
