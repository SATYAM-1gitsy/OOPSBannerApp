public class UC5  {

    public static void main(String[] args) {

        String[] lines = {
            "  ***      ***    ******    ***** ",
            " ** **    ** **   **  **   **     ",
            "**   **  **   **  **  **   **     ",
            "**   **  **   **  ******    ***** ",
            "**   **  **   **  **            **",
            " ** **    ** **   **            **",
            "  ***      ***    **        ***** "
        };

        // loop to print each row
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }

    }
}