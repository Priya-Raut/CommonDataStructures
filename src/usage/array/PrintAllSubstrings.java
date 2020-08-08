package SubArryQuestions;

import java.util.ArrayList;
import java.util.List;

/**
 * priya
 *
 * p
 * pr
 * pri
 * priya
 * r
 * ri
 * riy
 * riya
 * i
 * iy
 * iya
 * y
 * ya
 * a
 */
public class PrintAllSubstrings {
    public static List<String> getSubstrings(String str){
        List<String> subStrings = new ArrayList<>();
        String subString = null;
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                subString = str.substring(i,j+1);
                subStrings.add(subString);
            }
        }
        return subStrings;
    }
    public static void main(String[] args) {
        String str = "priya";
        getSubstrings(str).forEach(System.out::println);
    }
}
