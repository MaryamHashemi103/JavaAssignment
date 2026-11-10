package CollectionPractice_GymSystem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class GymManager {
    HashSet<Member> allMembers = new HashSet<>();
    TreeSet<String > vipMember = new TreeSet<>();
    LinkedHashSet<Member> recentMember = new LinkedHashSet<>();

    //adding members
    public void addMember(Member member){
        recentMember.add(member);
        allMembers.add(member);
        if(member.getMembershipType().equals("VIP")){
            vipMember.add(member.getName());
        }
    }

    //display all
    public void displayAllMembers(){
        for(Member m : allMembers){
            System.out.println(m);
        }
    }

    //display vip members
    public void displayVipMembers(){
        for(String member: vipMember){
            System.out.println(member);
        }
    }

    //display recent members
    public void displayRecentMembers(){
        for(Member recentM : recentMember){
            System.out.println(recentM);
        }
    }


}
