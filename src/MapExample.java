import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        //when we need to have a mapping.
        //Mapping is a unique Key to a Value
        //e.g. email address (unique) to a value (student object)

        //adding (putting pairs)
        students.put("stef@email.com", new Student("Stef K"));
        students.put("dalia@email.com", new Student("Dalia O"));
        students.put("newStudent@email.com", new Student("John Doe"));


        //retrieve
        Student stef = students.getOrDefault("something that doens adsflkj.com", new Student("casper") );
        Student dalia = students.get("dalia@email.com");
        System.out.println(dalia.getFullName());

        Student test = students.get("newStudent@email.com"); //for sure this is gonna return null

        //put some safety code
        if(test == null) {
            System.out.println("cannot be retrieved");
        }else{
            System.out.println(test.getFullName());
        }

        System.out.println(stef.getFullName());

    }
}
