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

    public Person (int id, String firstname, String lastname, String email , String country , String ipaddress) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.country = country;
        this.ipaddress = ipaddress;
    }
        public String toString (){
            return String.format("%s %s from %s \n", firstname, lastname, country);
}

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        int result = lastname.compareTo(p.lastname);
        return result;
        }
}
