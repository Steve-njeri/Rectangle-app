import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by staff on 7/10/17.
 */
public class Rectangle {
    private int height;
    private int width;
    private static ArrayList<Rectangle> mInstances = new ArrayList<>();
    private Boolean shape;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        this.shape = isRectSquare();
        mInstances.add(this);
    }

    public static List<Rectangle> all() {
        return mInstances;

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public static ArrayList<Rectangle> getAll() {
        return mInstances;
    }

    public boolean getShape(){
        return shape;
    }

    public boolean isRectSquare(){
        if (height == width){
            return true;
        }
        else {
            return false;
        }
    }

    public int getLength() {
        return 0;
    }

    public int area() {
        int length = 0;
        return length * width;
    }
}