package rotateImage;

public class VectorFactory {

    private final int columnLength;
    private final int rowLength;

    public VectorFactory(int columnLength, int rowLength){

        this.columnLength = columnLength;
        this.rowLength = rowLength;
    }

    public Vector create(CellAddress cellAddress) {
        if (cellAddress.column + 1 < columnLength){
            return new Vector(1,1);
        }
    }
}
