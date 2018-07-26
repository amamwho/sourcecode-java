
public class WorkingWithLoop {

    private static final int COLUMN = 9;
    private static final int ROW = 7;

    public static void main(String[] args) {
        //Line 1 - 7
        int space = 0;
        for (int i = 1; i <= ROW; i++) {
            for (int j = 1; j <= COLUMN; j++) {
                if (i == 1 && (j % 5 == 2 || j % 5 == 3)) {
                    System.out.print("*");
                } else if (i == 2 && (j % 5 != 0)) {
                    System.out.print("*");
                } else if (i >= 3 && (j > space && j <= COLUMN - space)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i >= 3) {
                space++;
            }
            System.out.println();
        }
        
        int col = 9;
        // Line 1
        System.out.println(" **   **  ");
        // Line2
        for(int l = 0; l < col; l++) {
            if( l != 4 ) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        // Line3 - 7
        for(int i = 0; i < ROW; i++) {
            printSpace(i);
            printStar(col);
            System.out.println();
            col = col - 2;
        }
    }

    private static void printSpace(int i) {
        for(int k = 0; k < i; k++) {
            System.out.print(" ");
        }
    }

    private static void printStar(int col) {
        for(int j = 0; j < col; j++) {
            System.out.print("*");
        }
    }

}
