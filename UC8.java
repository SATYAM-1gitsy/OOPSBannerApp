import java.util.HashMap;
import java.util.Map;
public class UC8 {
 private static Map<Character, String[]> bannerMap;
 public static void main(String[] args) {
 bannerMap = buildCharacterMap();
 String message = "OOPS";
 renderBanner(message);
 }
 public static Map<Character, String[]> buildCharacterMap() {
 Map<Character, String[]> map = new HashMap<>();
 map.put('O', new String[]{
 " ***** ",
 "**   **",
 "**   **",
 "**   **",
 "**   **",
 "**   **",
 " ***** "
 });
 map.put('P', new String[]{
 "****** ",
 "**   **",
 "**   **",
 "****** ",
 "**",
 "**",
 "**"
 });
 map.put('S', new String[]{
 "  ***** ",
 "**     ",
 "**     ",
 "  ***** ",
 "            **",
 "            **",
 "        ***** "
 });
 return map;
 }
 public static void renderBanner(String message) {
 int height = 7;
 for (int i = 0; i < height; i++) {
 StringBuilder rowBuilder = new StringBuilder();
 for (int j = 0; j < message.length(); j++) {
 char ch = message.charAt(j);
 String[] pattern = bannerMap.get(ch);
 if (pattern != null) {
 rowBuilder.append(pattern[i]).append(" ");
 }
 }
 System.out.println(rowBuilder.toString());
 }
 }
}