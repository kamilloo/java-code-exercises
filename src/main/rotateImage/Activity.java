package rotateImage;

import java.sql.Array;
import java.util.ArrayList;

public class Activity {

    CubicTranformer cubicTranformer = new CubicTranformer();
    Carrier carrier = new Carrier();
    public int[][] rotate(int[][] cubic){

        //rotate algorithm

        //2d cubic
        //Create Carrier
        //spread cubic to flat list
        //initial list node with cell address and value
        //set direction (right, down, left, up)
        //move value to next cell (change cell address)
        //collapse flat list into cubic

        VectorFactory vectorFactory = new VectorFactory(columnLength,rowLength);
        ArrayList<Cell> cells = cubicTranformer.spread(cubic);

        ArrayList<Cell> rotatedCells = new ArrayList<Cell>();

        cells.forEach((Cell cell) -> {
            Vector vector = vectorFactory.create(cell.cellAddress);
            rotatedCells.add(carrier.move(cell, vector));
        });

        int[][] rotatedCubic = cubicTranformer.colapse(rotatedCells);



        int[] left = [1,0];
        int[] right = [-1,0];
        int[] up = [0,1];
        int[] down = [0,-1];
        return rotatedCubic;

//        A0  B0 C0
//        A1  B1 C2



    }
}
