import java.util.HashMap;

public class HashMapExample {
 
    public static void main(String[] args) {

        // HashMap is a dictionary-like data structure. It stores key-value pairs.

        // ArrayList<Course>
        // 0 -> Course info5001
        // 1 -> Course info5100

        // keys -> values (key-value pairs)
        // Keys are unique
        // Values can be duplicated
        // nameOfSemester -> CourseScheduleOfTheSemester


        // 1. Create a HashMap
        HashMap<String, String> campusAddresses = new HashMap<>();

        // 2. Add key-value pairs

        campusAddresses.put("Boston Campus", "360 Huntington Ave, Boston, MA 02115");
        campusAddresses.put("Seattle Campus", "401 Terry Ave N, Seattle, WA 98109");
        campusAddresses.put("Oakland Campus", "2100 Franklin St #700, Oakland, CA 94612");


        // 3. Get a value by key

        String bostonCampusAddress = campusAddresses.get("Boston Campus");
        System.out.println("Boston Campus address is: " + bostonCampusAddress);


        // 4. Get all keys
        System.out.println("Printing every value through keys:");
        for (String campusName : campusAddresses.keySet()) {
            System.out.println(campusName + " address: " + campusAddresses.get(campusName));
        }

        // 5. Get all values
        for (String campusAddress : campusAddresses.values()) {
        System.out.println("Campus address: " + campusAddress);
        }

    }

}



