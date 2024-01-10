package rotateImage;

public class Carrier {

    private final int columnLength;
    private final int rowLength;

    public Carrier(int columnLength, int rowLength){

        this.columnLength = columnLength;
        this.rowLength = rowLength;
    }

    public Cell move(Cell cell){
        // first row -> last column (0 -> 3)
        // i-th row -> last - i-th column (1 -> 2) (1 -> 3-1)
        // last row -> first column (3 -> 0) (3 -> 3 - 3)

        int transformColumn = columnLength - 1 - cell.cellAddress.row;
        int transformRow = cell.cellAddress.column;
        CellAddress transforCellAddress = new CellAddress(transformColumn, transformRow);
        return new Cell(cell.value, transforCellAddress);
    }
}
