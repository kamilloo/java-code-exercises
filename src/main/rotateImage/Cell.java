package rotateImage;

public class Cell {
    CellAddress cellAddress;
    int value;

    public Cell(int value, CellAddress cellAddress){
        this.value = value;
        this.cellAddress = cellAddress;
    }
}
