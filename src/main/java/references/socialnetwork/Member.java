package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Member {

    private String name;
    private List<Member> connections = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Member> getConnections() {
        return new ArrayList<>(connections);
    }

    public void connectMember(Member member) {
        connections.add(member);
    }

    private List<String> connectedNames() {
         return connections.stream().map(Member::getName).collect(Collectors.toList());
//        List<String> connectedNames = new ArrayList<>();
//        for (Member member : connections) {
//            connectedNames.add(member.getName());
//        }
//        return connectedNames;
    }

    @Override
    public String toString() {
        return name + " " + connectedNames();
    }
}
