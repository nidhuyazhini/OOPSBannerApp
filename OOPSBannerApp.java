import java.util.HashMap;
import java.util.Map;

/**
 * UC8 - BannerApp using HashMap Collection
 */
public class BannerApp {

    // Method to create character pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    // Method to render banner
    public static void renderBanner(String word,
                                    Map<Character, String[]> patterns) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patterns.get(ch)[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = buildPatternMap();

        renderBanner("OOPS", patterns);
    }
}