public class StudentPojo {
    String name, branch;
    int Mobile;
    Address address;

    public StudentPojo(String name, String branch, int mobile, Address address) {
        this.name = name;
        this.branch = branch;
        this.Mobile = mobile;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getMobile() {
        return Mobile;
    }

    public void setMobile(int mobile) {
        Mobile = mobile;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", Mobile=" + Mobile +
                '}';
    }
}
