import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CubeTest {

    @Test
    public void newCube_instantiatesCorrectly() {
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(true, testCube instanceof Cube);
    }

    @Test
    public void newCube_savesRectangleInformation_Rectangle() {
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(testRectangle, testCube.getFace());
    }

    @Test
    public void volume_determinesTheVolumeOfTheCube_27000() {
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(27000, testCube.getVolume());
    }

    @Test
    public void surfaceArea_determinesTheSurfaceAreaOfACube_5400() {
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(5400, testCube.getSurfaceArea());
    }
}