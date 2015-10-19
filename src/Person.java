/**
 * Created by cameronoakley on 10/19/15.
 */
public class Person implements Comparable {
    int id;
    String firstname;
    String lastname;
    String email;
    String country;
    String ipaddress;

    public Person (int id, String firstname, String lastname, String email , String country , String ipaddress){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.country = country;
        this. ipaddress = ipaddress;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
