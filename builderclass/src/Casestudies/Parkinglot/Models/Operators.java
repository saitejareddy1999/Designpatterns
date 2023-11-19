package Casestudies.Parkinglot.Models;

public class Operators extends BaseModel {
    private String Name;
    private int Eid;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }
}
