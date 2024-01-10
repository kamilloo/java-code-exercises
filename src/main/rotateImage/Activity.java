package rotateImage;

import java.util.ArrayList;

public class Activity {

    CubicTransformer cubicTransformer = new CubicTransformer();
    public int[][] rotate(int[][] cubic){

        //rotate algorithm

        //2d cubic
        //4x4
        // first row -> last column (0 -> 3)
        // i-th row -> last - i-th column (1 -> 2) (1 -> 3-1)
        // last row -> first column (3 -> 0) (3 -> 3 - 3)

        // Cell address:
        // column: lastColumn - old row


        //Create Carrier
        //spread cubic to flat list
        //initial list node with cell address and value
        //set direction (right, down, left, up)
        //move value to next cell (change cell address)
        //collapse flat list into cubic
        int columnLength = cubic[0].length;
        int rowLength = cubic.length;
        Carrier carrier = new Carrier(columnLength, rowLength);
        ArrayList<Cell> cells = cubicTransformer.spread(cubic);

        ArrayList<Cell> rotatedCells = new ArrayList<Cell>();

        cells.forEach((Cell cell) -> {
            rotatedCells.add(carrier.move(cell));
        });

        return cubicTransformer.collapse(rotatedCells, rowLength, columnLength);

    }
}
