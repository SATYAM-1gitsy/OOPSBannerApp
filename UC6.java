public class UC6 {

    // Helper method for letter O
    public static String[] getOPattern() {
        return new String[]{
                "     ***     ",
                "   **   **   ",
                "  **     **  ",
                "  **     **  ",
                "  **     **  ",
                "   **   **   ",
                "     ***     "
        };
    }

    // Helper method for letter P
    public static String[] getPPattern() {
        return new String[]{
                "  ******    ",
                "  **    **  ",
                "  **    **  ",
                "  ******    ",
                "  **        ",
                "  **        ",
                "  **        "
        };
    }

    // Helper method for letter S
    public static String[] getSPattern() {
        return new String[]{
                "    *****   ",
                "  **     ** ",
                "  **        ",
                "    *****   ",
                "        **  ",
                "  **     ** ",
                "    *****   "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // 7 lines banner
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}