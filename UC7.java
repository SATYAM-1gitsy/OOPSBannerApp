public class UC7 {

    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] createOPattern() {
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

    public static String[] createPPattern() {
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

    public static String[] createSPattern() {
        return new String[]{
                "    *****   ",
                "  **     ** ",
                "  **         ",
                "    *****   ",
                "        **   ",
                "  **     ** ",
                "    *****   "
        };
    }

    public static void main(String[] args) {

        CharacterPattern[] letters = {
                new CharacterPattern('O', createOPattern()),
                new CharacterPattern('P', createPPattern()),
                new CharacterPattern('S', createSPattern())
        };

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {

            StringBuilder sb = new StringBuilder();

            sb.append(letters[0].getPattern()[i]).append(" ");
            sb.append(letters[0].getPattern()[i]).append(" ");
            sb.append(letters[1].getPattern()[i]).append(" ");
            sb.append(letters[2].getPattern()[i]);

            banner[i] = sb.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}