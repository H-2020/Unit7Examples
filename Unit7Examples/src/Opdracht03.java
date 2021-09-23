public class Opdracht03 {

    public static void main(String[] args) {

             /*
                | 0 | 0 | 0 | 0 | 0 | 0 |
                | 0 | 0 | 0 | 0 | 0 | 0 |
                | 0 | 0 | 0 | 0 | 0 | 0 |
                | 0 | 0 | 0 | 0 | 0 | 0 |
             */

        // CREATE_2D_ARRAY
        int[][] table = new int[4][6];

        //CREATE_A_ARRAY
        char[] characters = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G'
        };

        //PRINT->Space
        System.out.print("  " + "|   ");
        //FOR(6)
        for (int charIndex = 0; charIndex < 6; charIndex++) {
            //PRINT
            System.out.print(characters[charIndex] + " |  ");
        }

        //PRINT->Go another line
        System.out.println();

        // OUTER_FOR(TABLE_COUNT)
        for (int row = 0; row < table.length; row++) {

            // PRINT -> row index
            System.out.print((row + 1) + " | ");

            // INNER_FOR(TABLE_ELEMENT_COUNT)
            for (int col = 0; col < table[row].length; col++) {

                // PRINT -> colum index
                int mul = (row + 1) * (col + 1);

                //IF
                if (mul < 10) {
                    //PRINT->mul
                    System.out.print(" " + "0" + mul + " |");
                }
                //ELSE
                else {
                    //PRINT->mul
                    System.out.print(" " + mul + " |");
                }
            }

            /*
            0 |  00 00 00 00 00 00
            1 |  00 01 02 03 04 05
            2 |  00 02 04 06 08 10
            3 |  00 03 06 09 12 15
             */

            //PRINT->Go another line
            System.out.println();
        }
    }
}