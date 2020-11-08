package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocialNetwork {
    private List<Member> members = new ArrayList<>();

    public void addMember(String name) {
        Member member = new Member(name);
        members.add(member);
    }

    public void connect(String name, String otherName) {
        Member first = findByName(name);
        try{
            first.connectMember(findByName(otherName));
        }catch (NullPointerException npe){
            Logger.getAnonymousLogger().log(Level.SEVERE, "Cannot find first!",npe);
        }

    }

    private Member findByName(String name) {
        for(Member member : members){
            if(member.getName().equals(name)){
                return member;
            }
        }
        return null;
    }
}
