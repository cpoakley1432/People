import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by cameronoakley on 10/19/15.
 */
public class People {
    static final String FILE_Name = "people.csv";

    public static void main(String[] args) {

        HashMap<String, ArrayList<Person>> peopleInfo = new HashMap();
        String personContent = readFile("people.csv");
        String [] lines = personContent.split("\n");
        ArrayList<Person> persons = new ArrayList();

        for (String line : lines){
            String [] columns = line.split(",");
            String idStr = columns [0];
            int id = Integer.valueOf(idStr);
            String firstname =columns[1];
            String lastname = columns [2];
            String email = columns [3];
            String country = columns [4];
            String ipaddress = columns [5];
            Person person = new Person(id, firstname, lastname, email , country , ipaddress);

            String countryName = String.valueOf(columns [4]);
            ArrayList<Person> list = peopleInfo.get(countryName);

            if (list == null){
                list = new ArrayList();
                list.add(person);
                peopleInfo.put(countryName, list);
            }else {
                list.add(person);
            }
        }
    }

    static String readFile(String fileName){
        File f = new File(fileName);
        try{
            FileReader fr = new FileReader(f);
            int fileSize = (int) f.length();
            char[] fileContent = new char[fileSize];
            fr.read(fileContent);
            return new String (fileContent);

        } catch (Exception e){
            return null;

        }
    }

    static void writeFile(String fileName, String fileContent){
        File f = new File(fileName);
        try{
            FileWriter fw = new FileWriter(f);
            fw.write(fileContent);
            fw.close();
        }catch (Exception e){

        }
    }
}

