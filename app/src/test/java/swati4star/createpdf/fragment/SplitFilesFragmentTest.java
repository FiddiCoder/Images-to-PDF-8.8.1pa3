package swati4star.createpdf.fragment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Test;
import org.mockito.Mockito;

import swati4star.createpdf.util.MorphButtonUtility;

public class SplitFilesFragmentTest {

    @Test
    public void onActivityResult() {
        // vero vero vero
        SplitFilesFragment x = Mockito.mock(SplitFilesFragment.class);
        Intent data = null;
        Mockito.doCallRealMethod().when(x).onActivityResult(0, 0, data);
        x.onActivityResult(0, 0, data);
        Mockito.verify(x).onActivityResult(0, 0, data);
    }

    @Test
    public void onActivityResult2() {
        // vero falso vero
        SplitFilesFragment x = Mockito.mock(SplitFilesFragment.class);
        Intent data = null;
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }

    @Test
    public void onActivityResult3() {
        // FALSO VERO VERO
        SplitFilesFragment x = Mockito.mock(SplitFilesFragment.class);
        Intent data = Mockito.mock(Intent.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, 0, data);
        x.onActivityResult(0, 0, data);
        Mockito.verify(x).onActivityResult(0, 0, data);
    }

    @Test
    public void onActivityResult4() {
        // FALSO VERO falso
        SplitFilesFragment x = Mockito.mock(SplitFilesFragment.class);
        Intent data = Mockito.mock(Intent.class);
        Uri uri = Mockito.mock(Uri.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, 0, data);
        Mockito.when(data.getData()).thenReturn(uri);
        x.onActivityResult(0, 0, data);
        Mockito.verify(x).onActivityResult(0, 0, data);
    }

    @Test
    public void onActivityResult5() {
        // FALSO falso vero
        SplitFilesFragment x = Mockito.mock(SplitFilesFragment.class);
        Intent data = Mockito.mock(Intent.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }

    @Test
    public void onActivityResult6() {
        SplitFilesFragment x = Mockito.mock(SplitFilesFragment.class);
        Intent data = Mockito.mock(Intent.class);
        Uri uri = Mockito.mock(Uri.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        Mockito.when(data.getData()).thenReturn(uri);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }

    @Test
    public void setTextAndActivateButtons() {
        SplitFilesFragment x = Mockito.mock(SplitFilesFragment.class);
        String path = "prova.pdf";
        x.mSplittedFiles = Mockito.mock(RecyclerView.class);
        x.splitFilesSuccessText = Mockito.mock(TextView.class);
        x.mMorphButtonUtility = Mockito.mock(MorphButtonUtility.class);
        x.mSplitConfitEditText = Mockito.mock(EditText.class);
        Mockito.doCallRealMethod().when(x).setTextAndActivateButtons(path);
        x.setTextAndActivateButtons(path);
        Mockito.verify(x).setTextAndActivateButtons(path);
    }

    @Test
    public void setTextAndActivateButtons2() {
        SplitFilesFragment x = Mockito.mock(SplitFilesFragment.class);
        String path = "prova.pdf";
        x.mSplittedFiles = Mockito.mock(RecyclerView.class);
        x.splitFilesSuccessText = Mockito.mock(TextView.class);
        Mockito.doCallRealMethod().when(x).setTextAndActivateButtons(path);
        Mockito.when(x.getDefaultSplitConfig(x.mPath)).thenReturn("prova.pdf");
        Mockito.doNothing().when(x).resetValues();
        x.setTextAndActivateButtons(path);
        Mockito.verify(x).setTextAndActivateButtons(path);
    }

}