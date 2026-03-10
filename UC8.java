import java.util.HashMap;
import java.util.Map;

public class UC8 {

    public static void main(String[] args) {

        // Character pattern library
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "   ***   ",
                "  ** **  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                "  ** **  ",
                "   ***   "
        });

        patternMap.put('P', new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        });

        patternMap.put('S', new String[]{
                "  *****  ",
                " **      ",
                " **      ",
                "  ****   ",
                "     **  ",
                "     **  ",
                " *****   "
        });

        String bannerText = "OOPS";

        // Build and print banner
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : bannerText.toCharArray()) {
                line.append(patternMap.get(c)[row]).append(" ");
            }

            System.out.println(line);
        }
    }
}