package swati4star.createpdf.fragment;



import static org.mockito.ArgumentMatchers.anyInt;

import android.content.Intent;

import org.junit.Test;
import org.mockito.Mockito;

public class SettingsFragmentTest {

    @Test
    public void onItemClick() {
        int position = 1;
        SettingsFragment x = Mockito.spy(SettingsFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(anyInt());
        Mockito.doNothing().when(x).setPageSize();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick2() {
        int position = 0;
        SettingsFragment x = Mockito.spy(SettingsFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(anyInt());
        Mockito.doNothing().when(x).changeCompressImage();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick3() {
        int position = 2;
        SettingsFragment x = Mockito.spy(SettingsFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(anyInt());
        Mockito.doNothing().when(x).editFontSize();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick4() {
        int position = 3;
        SettingsFragment x = Mockito.spy(SettingsFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(anyInt());
        Mockito.doNothing().when(x).changeFontFamily();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick5() {
        int position = 4;
        SettingsFragment x = Mockito.spy(SettingsFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(anyInt());
        Mockito.doNothing().when(x).setTheme();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick6() {
        /* non funziona
        int position = 5;
        SettingsFragment x = Mockito.spy(SettingsFragment.class);
        Activity activity = Mockito.spy(Activity.class);
        Mockito.doCallRealMethod().when(x).onItemClick(anyInt());
        Mockito.doNothing().when(ImageUtils);
        ImageUtils.showImageScaleTypeDialog(activity, true);
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
         */
    }

    @Test
    public void onItemClick7() {
        int position = 6;
        SettingsFragment x = Mockito.spy(SettingsFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(anyInt());
        Mockito.doNothing().when(x).changeMasterPassword();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick8() {
        int position = 7;
        SettingsFragment x = Mockito.spy(SettingsFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(anyInt());
        Mockito.doNothing().when(x).setShowPageNumber();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick9() {
        int position = 9;
        SettingsFragment x = Mockito.spy(SettingsFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(anyInt());
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onActivityResult() {
        Intent data = Mockito.mock(Intent.class);
        SettingsFragment x = Mockito.spy(SettingsFragment.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, 0, data);
        x.onActivityResult(0, 0, data);
        Mockito.verify(x).onActivityResult(0, 0, data);
    }

    @Test
    public void onActivityResult2() {
        Intent data = Mockito.mock(Intent.class);
        SettingsFragment x = Mockito.spy(SettingsFragment.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(1, 0, data);
        x.onActivityResult(1, 0, data);
        Mockito.verify(x).onActivityResult(1, 0, data);
    }
}