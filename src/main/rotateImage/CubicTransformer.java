package rotateImage;

import java.util.ArrayList;

public class CubicTransformer {
    public ArrayList<Cell> spread(int[][] cubic) {
        ArrayList<Cell> flatten = new ArrayList<Cell>();
        for (int i = 0; i < cubic.length; i++){
            for (int j = 0; j < cubic[i].length; j++){
                CellAddress cellAddress = new CellAddress(j,i);
                flatten.add(new Cell(cubic[i][j], cellAddress));
            }
        }
        return flatten;
    }

    public int[][] collapse(ArrayList<Cell> rotatedCells, int rowLength, int columnLength) {

        int[][] cubic = new int[rowLength][columnLength];

        rotatedCells.forEach((Cell cell) -> cubic[cell.cellAddress.row][cell.cellAddress.column] = cell.value);
        return cubic;
    }
}
