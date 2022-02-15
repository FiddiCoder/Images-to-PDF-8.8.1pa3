package swati4star.createpdf.activity;


import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ImageEditorTest {

    @Mock
    ImageEditor x;

    @Test
    public void previousImg() {
        MockitoAnnotations.initMocks(this);
        x.mClicked = true;
        x.mCurrentImage = 100;
        x.mDisplaySize = 2;
        Mockito.doCallRealMethod().when(x).previousImg();
        x.previousImg();
        Mockito.verify(x).previousImg();
    }

}