import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Match 1: " + Pattern.matches("[789][0-9]{9}", "99530389490"));
        System.out.println("Match 2: " + Pattern.matches("[789][0-9]", "895"));
        System.out.println("Match 3: " + Pattern.matches("[a-d[m-p]]", "p"));
        System.out.println("Match 4: " + Pattern.matches("[a-d][m-p]", "p"));
        System.out.println("Match 5: " + Pattern.matches("[a-d][m-p]", "co"));
        System.out.println("Match 6: " + Pattern.matches(".s", "effg"));
        System.out.println("Match 7: " + Pattern.matches("...m", "ertm"));
        System.out.println("Match 8: " + Pattern.matches("[^abc]", "o"));
        System.out.println("Match 9: " + Pattern.matches("[\\d]", "98"));
        System.out.println("\n");

        System.out.println("Match 10: " + Pattern.matches("[\\d]", "9"));
        System.out.println("Match 11: " + Pattern.matches("[\\w]", "a"));
        System.out.println("Match 12: " + Pattern.matches("b|a", "a"));
        System.out.println("Match 13: " + Pattern.matches("colo*r", "color"));
        System.out.println("Match 14: " + Pattern.matches("[789][0-9]{4}", "99530"));
        System.out.println("Match 15: " + Pattern.matches("[789]{2}[0-5]{3}", "89530"));
        System.out.println("\n");
        
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher("332");
        System.out.println("Find 1: " + m.find());

        p = Pattern.compile("[^abc]");
        m = p.matcher("123The ");
        System.out.println("Find 2: " + m.find());

        p = Pattern.compile("\\w");
        m = p.matcher("The color green ");
        System.out.println("Find 3: " + m.find());

     
     
    }
}
