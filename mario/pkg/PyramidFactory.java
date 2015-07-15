package mario.pkg;

/**
 * Created by brianblosser on 7/15/15.
 * Creates new pyramid objects using static methods.
 */
public class PyramidFactory {
    public static Pyramid buildPyramid(int height) {
        return new Pyramid(height);
    }
}
