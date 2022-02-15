package swati4star.createpdf.fragment;



import org.junit.Test;
import org.mockito.Mockito;

public class ExtractTextFragmentTest {

    @Test
    public void onRequestPermissionsResult() {
        ExtractTextFragment x = Mockito.mock(ExtractTextFragment.class);
        String[] permissions = new String[1];
        int[] grantResults = new int[0];
        Mockito.doCallRealMethod().when(x)
                .onRequestPermissionsResult(-1, permissions, grantResults);
        x.onRequestPermissionsResult(-1, permissions, grantResults);
        Mockito.verify(x).onRequestPermissionsResult(-1, permissions, grantResults);
    }

    @Test
    public void onRequestPermissionsResult2() {
        ExtractTextFragment x = Mockito.mock(ExtractTextFragment.class);
        String[] permissions = new String[1];
        int[] grantResults = new int[5];
        grantResults[0] = 100;
        grantResults[1] = 22;
        Mockito.doCallRealMethod().when(x)
                .onRequestPermissionsResult(-1, permissions, grantResults);
        x.onRequestPermissionsResult(-1, permissions, grantResults);
        Mockito.verify(x).onRequestPermissionsResult(-1, permissions, grantResults);
    }

    @Test
    public void openExtractText() {
        ExtractTextFragment x = Mockito.mock(ExtractTextFragment.class);
        Mockito.doCallRealMethod().when(x).openExtractText();
        x.openExtractText();
        Mockito.verify(x).openExtractText();
    }

}