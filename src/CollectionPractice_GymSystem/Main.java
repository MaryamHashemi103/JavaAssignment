package CollectionPractice_GymSystem;

public class Main {
    static void main() {
        GymManager manager = new GymManager();
        Member m1 = new Member(101, "Ali", "VIP");
        Member m2 = new Member(102, "Maryam", "VIP");
        Member m3 = new Member(103, "Sara", "Normal");
        //Member m4 = new Member(101, "Ali", "VIP");

        manager.addMember(m1);
        manager.addMember(m2);
        manager.addMember(m3);
       // manager.addMember(m4);

        System.out.println("---All Member---");
        manager.displayAllMembers();

        System.out.println("\n---VIP Member---");
        manager.displayVipMembers();

        System.out.println("\n---Recent Member---");
        manager.displayRecentMembers();
    }
}
