/* *****************************************************************************
 *  Name:    Anelyse
 *  NetID:   Checkerboard
 *  Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */
public class Checkerboard {
    public static void main(String[] args) {
        // declaration and initialization - How big?
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);

        // Draw from lower left, up and across.
        // i is the index for the x value; j is the index for y.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (((i + j) % 2) == 1)
                    StdDraw.setPenColor(StdDraw.BLACK);
                else
                    StdDraw.setPenColor(StdDraw.RED);

                // draw filled square centered at ___, ___ with radius .5
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
    }
}
