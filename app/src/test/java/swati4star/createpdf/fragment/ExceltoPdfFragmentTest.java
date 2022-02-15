package swati4star.createpdf.fragment;



import com.dd.morphingbutton.MorphingButton;

import org.junit.Test;
import org.mockito.Mockito;

public class ExceltoPdfFragmentTest {

    @Test
    public void onRequestPermissionsResult() {
        ExceltoPdfFragment x = Mockito.mock(ExceltoPdfFragment.class);
        String[] permissions = new String[1];
        int[] grantResults = new int[0];
        Mockito.doCallRealMethod().when(x)
                .onRequestPermissionsResult(-1, permissions, grantResults);
        x.onRequestPermissionsResult(-1, permissions, grantResults);
        Mockito.verify(x).onRequestPermissionsResult(-1, permissions, grantResults);
    }

    @Test
    public void onRequestPermissionsResult2() {
        ExceltoPdfFragment x = Mockito.mock(ExceltoPdfFragment.class);
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
    public void onItemClick() {
        ExceltoPdfFragment x = Mockito.mock(ExceltoPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(0);
        x.mCreateExcelPdf = Mockito.mock(MorphingButton.class);
        Mockito.when(x.mCreateExcelPdf.isEnabled()).thenReturn(true);
        x.onItemClick(0);
        Mockito.verify(x).onItemClick(0);
    }

    @Test
    public void onItemClick2() {
        ExceltoPdfFragment x = Mockito.mock(ExceltoPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(2);
        x.mCreateExcelPdf = Mockito.mock(MorphingButton.class);
        Mockito.when(x.mCreateExcelPdf.isEnabled()).thenReturn(true);
        x.onItemClick(2);
        Mockito.verify(x).onItemClick(2);
    }
}