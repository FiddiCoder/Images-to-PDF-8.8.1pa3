package swati4star.createpdf.util;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

import android.graphics.BitmapFactory;

import com.itextpdf.text.Rectangle;

import org.junit.Assert;
import org.junit.Test;

public class ImageUtilsTest {
    private static final Rectangle NO_NORMAL_ERROR =
            new Rectangle(0.0f, 0.0f, 0.0f, 0.0f);
    private static final Rectangle NO_POINT_ERROR =
            new Rectangle(0.0f, 0.0f, 0.0f, 0.0f);
    private static final Rectangle NO_LINE_ERROR =
            new Rectangle(0.0f, 0.0f, 0.0f, 0.0f);

    @Test
    public void testCalculateFitSize() {
        float testWidth = 8.0f;
        float testHeight = 12.0f;
        Rectangle testDocumentSize = new Rectangle(5.0f, 5.0f, 5.0f, 5.0f);
        assertEquals(ImageUtils.calculateFitSize(testWidth, testHeight,
                testDocumentSize).getLeft(), NO_NORMAL_ERROR.getLeft());
        assertEquals(ImageUtils.calculateFitSize(testWidth, testHeight,
                testDocumentSize).getRight(), NO_NORMAL_ERROR.getRight());

        float testWidthTwo = 8.0f;
        float testHeightTwo = 12.0f;
        Rectangle testDocumentSizeTwo = new Rectangle(-5.0f, 5.0f, -5.0f, 5.0f);
        assertEquals(ImageUtils.calculateFitSize(testWidthTwo, testHeightTwo,
                testDocumentSizeTwo).getLeft(), NO_NORMAL_ERROR.getLeft());
        assertEquals(ImageUtils.calculateFitSize(testWidthTwo, testHeightTwo,
                testDocumentSizeTwo).getRight(), NO_NORMAL_ERROR.getRight());

        float negWidth = -8.0f;
        float negHeight = -12.0f;
        Rectangle testDocumentSizeThree = new Rectangle(5.0f, 5.0f, 5.0f, 5.0f);
        assertEquals(ImageUtils.calculateFitSize(negWidth, negHeight,
                testDocumentSizeThree).getLeft(), NO_NORMAL_ERROR.getLeft());
        assertEquals(ImageUtils.calculateFitSize(negWidth, negHeight,
                testDocumentSizeThree).getRight(), NO_NORMAL_ERROR.getRight());

        float testWidthThree = 8.0f;
        float testHeightThree = 12.0f;
        Rectangle testDocumentSizePoint = new Rectangle(0.0f, 0.0f, 0.0f, 0.0f);
        assertThat(ImageUtils.calculateFitSize(testWidthThree, testHeightThree,
                testDocumentSizePoint), is(NO_POINT_ERROR));

        float testWidthFour = 8.0f;
        float testHeightFour = 12.0f;
        Rectangle testDocumentSizeLine = new Rectangle(0.0f, 0.0f, 0.0f, 0.0f);
        assertEquals(ImageUtils.calculateFitSize(testWidthFour, testHeightFour,
                testDocumentSizeLine).getLeft(), NO_LINE_ERROR.getLeft());
        assertEquals(ImageUtils.calculateFitSize(testWidthFour, testHeightFour,
                testDocumentSizeLine).getRight(), NO_LINE_ERROR.getRight());
    }

    @Test
    public void getRoundBitmapFromPath() {
        Assert.assertEquals(null, ImageUtils.getRoundBitmapFromPath("prova.pdf"));
    }



    @Test
    public void calculateInSampleSize() {
        ImageUtils x = mock(ImageUtils.class);
        BitmapFactory.Options options = mock(BitmapFactory.Options.class);
        options.outHeight = 600;
        options.outWidth = 200;
        ImageUtils.calculateInSampleSize(options);
        Assert.assertEquals(1, ImageUtils.calculateInSampleSize(options));
    }

    @Test
    public void calculateInSampleSize2() {
        ImageUtils x = mock(ImageUtils.class);
        BitmapFactory.Options options = mock(BitmapFactory.Options.class);
        options.outHeight = 200;
        options.outWidth = 200;
        ImageUtils.calculateInSampleSize(options);
        Assert.assertEquals(1, ImageUtils.calculateInSampleSize(options));
    }

    @Test
    public void calculateInSampleSize3() {
        ImageUtils x = mock(ImageUtils.class);
        BitmapFactory.Options options = mock(BitmapFactory.Options.class);
        options.outHeight = 10000;
        options.outWidth = 10000;
        ImageUtils.calculateInSampleSize(options);

        Assert.assertEquals(16, ImageUtils.calculateInSampleSize(options));
    }

    @Test
    public void calculateInSampleSize4() {
        ImageUtils x = mock(ImageUtils.class);
        BitmapFactory.Options options = mock(BitmapFactory.Options.class);
        options.outHeight = 90;
        options.outWidth = 10000;
        ImageUtils.calculateInSampleSize(options);

        Assert.assertEquals(1, ImageUtils.calculateInSampleSize(options));
    }

    @Test
    public void calculateInSampleSize5() {
        ImageUtils x = mock(ImageUtils.class);
        BitmapFactory.Options options = mock(BitmapFactory.Options.class);
        options.outHeight = 10000;
        options.outWidth = 90;
        ImageUtils.calculateInSampleSize(options);

        Assert.assertEquals(1, ImageUtils.calculateInSampleSize(options));
    }
}