package mario.pkg;

/**
 * Created by brianblosser on 7/15/15.
 * Creates new pyramid objects using static methods.
 */
public class PyramidFactory {

    private static PyramidFactory singlePyramidFactory = null;

    private PyramidFactory () {};

    public static PyramidFactory getInstance() {
        if (singlePyramidFactory==null) {
            singlePyramidFactory=new PyramidFactory();
        }
        return singlePyramidFactory;
    }

    public static Pyramid buildPyramid(int height) {
        return new Pyramid(height);
    }
}
