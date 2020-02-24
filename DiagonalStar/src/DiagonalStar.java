public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int rows = 0; rows < number; rows++) {
                for (int columns = 0; columns < number; columns++) {

                    if ((columns == 0) || (rows == 0) || (columns == rows) || (rows == (number - 1)) || (columns == (number - 1)) || (columns == (number - rows - 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }
    }

