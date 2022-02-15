package swati4star.createpdf.fragment;

import org.junit.Test;
import org.mockito.Mockito;

public class AddTextFragmentTest {

    @Test
    public void onItemClick() {
        int position = 0;
        AddTextFragment x = Mockito.mock(AddTextFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        Mockito.doNothing().when(x).editFontSize();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick2() {
        int position = 1;
        AddTextFragment x = Mockito.mock(AddTextFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        Mockito.doNothing().when(x).changeFontFamily();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick3() {
        int position = 2;
        AddTextFragment x = Mockito.mock(AddTextFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onRequestPermissionsResult() {
        AddTextFragment x = Mockito.mock(AddTextFragment.class);
        String[] permissions = new String[1];
        int[] grantResults = new int[0];
        Mockito.doCallRealMethod().when(x)
                .onRequestPermissionsResult(-1, permissions, grantResults);
        x.onRequestPermissionsResult(-1, permissions, grantResults);
        Mockito.verify(x).onRequestPermissionsResult(-1, permissions, grantResults);
    }

    @Test
    public void onRequestPermissionsResult2() {
        AddTextFragment x = Mockito.mock(AddTextFragment.class);
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
    public void onRequestPermissionsResult3() {
        AddTextFragment x = Mockito.mock(AddTextFragment.class);
        String[] permissions = new String[1];
        int[] grantResults = new int[5];
        grantResults[0] = 0;
        grantResults[1] = 22;
        Mockito.doCallRealMethod().when(x)
                .onRequestPermissionsResult(1, permissions, grantResults);
        x.onRequestPermissionsResult(1, permissions, grantResults);
        Mockito.verify(x).onRequestPermissionsResult(1, permissions, grantResults);
    }
}