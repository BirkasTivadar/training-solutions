package lambdaintro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SocialNetwork {

    private List<Member> members;

    public SocialNetwork(List<Member> members) {
        this.members = members;
    }

    public List<Member> findMembersBy(Predicate<Member> condition) {
        List<Member> result = new ArrayList<>();
        for (Member member : members) {
            if (condition.test(member)) {
                result.add(member);
            }
        }
        return result;
    }

    public void applyToSelectedMembers(Predicate<Member> condition, Consumer<Member> make) {
        for (Member member : members) {
            if (condition.test(member)) {
                make.accept(member);
            }
        }
    }

    public List<String> transformMembers(Function<Member, String> transform) {
        List<String> result = new ArrayList<>();
        for (Member member : members) {
            result.add(transform.apply(member));
        }
        return result;
    }
}
