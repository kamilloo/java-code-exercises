package rotateImage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.sql.Array;

public class ActivityTest {

    @Test
    public void rotate_TwoDimensionsCubic(){
            int[][] cubic = new int[][]{ new int[]{1,2}, new int[]{3,4}};
            int[][] rotated = new int[][]{ new int[]{3,1}, new int[]{4,2}};

            Activity activity = new Activity();

        int[][] rotatedCubic = activity.rotate(cubic);

        Assertions.assertEquals(rotatedCubic[0][0], rotated[0][0]);
        Assertions.assertEquals(rotatedCubic[0][1], rotated[0][1]);
        Assertions.assertEquals(rotatedCubic[1][0], rotated[1][0]);
        Assertions.assertEquals(rotatedCubic[1][1], rotated[1][1]);
    }

    @Test
    public void rotate_ThreeDimensionsCubic(){
        int[][] cubic = new int[][]{ new int[]{1,2,3}, new int[]{4,5,6}, new int[]{7,8,9}};
        int[][] rotated = new int[][]{ new int[]{7,4,1}, new int[]{8,5,2}, new int[]{9,6,3}};

        Activity activity = new Activity();

        int[][] rotatedCubic = activity.rotate(cubic);

        Assertions.assertEquals(rotatedCubic[0][0], rotated[0][0]);
        Assertions.assertEquals(rotatedCubic[0][1], rotated[0][1]);
        Assertions.assertEquals(rotatedCubic[0][2], rotated[0][2]);
        Assertions.assertEquals(rotatedCubic[1][0], rotated[1][0]);
        Assertions.assertEquals(rotatedCubic[1][1], rotated[1][1]);
        Assertions.assertEquals(rotatedCubic[1][2], rotated[1][2]);
        Assertions.assertEquals(rotatedCubic[2][0], rotated[2][0]);
        Assertions.assertEquals(rotatedCubic[2][1], rotated[2][1]);
        Assertions.assertEquals(rotatedCubic[2][2], rotated[2][2]);
    }
}
