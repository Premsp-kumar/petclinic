package springpetclinic.petclinic.Model;

public class Person extends BaseEntity {
    private String Firstname;
    private String Lastname;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

}
