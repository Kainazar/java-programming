package allDaysJava.day48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
  private String name;
  private List<String> members = new ArrayList<>();

  public Group (String name) {
      this.name = name;
  }

  public void addMember ( String newMember) {
      members.add(newMember);

  }
  public void removeMember(String memberName) {
      members.remove(memberName);
  }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }

    public void setMembers(List<String> members) {
        this.members = members;


    }

}

