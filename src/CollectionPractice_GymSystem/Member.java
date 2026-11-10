package CollectionPractice_GymSystem;

public class Member {
    private int id;
    private String name;
    private String membershipType;

    Member(int id, String name, String membershipType){
        this.id = id;
        this.name = name;
        this.membershipType = membershipType;
    }
    //Setters

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMembershipType(String membershipType){
        this.membershipType = membershipType;
    }

    //Getters

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getMembershipType(){
        return membershipType;
    }

    public String toString(){
        return "Member Id: "+ id +"| Name: "+ name+"| Type: "+ membershipType;
    }

}
