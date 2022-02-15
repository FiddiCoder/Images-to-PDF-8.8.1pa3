package swati4star.createpdf.fragment;


import android.content.Intent;
import android.net.Uri;

import org.junit.Test;
import org.mockito.Mockito;

public class InvertPdfFragmentTest {

    @Test
    public void onActivityResult() {
        // vero vero vero
        InvertPdfFragment x = Mockito.mock(InvertPdfFragment.class);
        Intent data = null;
        Mockito.doCallRealMethod().when(x).onActivityResult(0, 0, data);
        x.onActivityResult(0, 0, data);
        Mockito.verify(x).onActivityResult(0, 0, data);
    }

    @Test
    public void onActivityResult2() {
        // vero falso vero
        InvertPdfFragment x = Mockito.mock(InvertPdfFragment.class);
        Intent data = null;
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }

    @Test
    public void onActivityResult3() {
        // FALSO VERO VERO
        InvertPdfFragment x = Mockito.mock(InvertPdfFragment.class);
        Intent data = Mockito.mock(Intent.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, 0, data);
        x.onActivityResult(0, 0, data);
        Mockito.verify(x).onActivityResult(0, 0, data);
    }

    @Test
    public void onActivityResult4() {
        // FALSO VERO falso
        InvertPdfFragment x = Mockito.mock(InvertPdfFragment.class);
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
        InvertPdfFragment x = Mockito.mock(InvertPdfFragment.class);
        Intent data = Mockito.mock(Intent.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }

    @Test
    public void onActivityResult6() {
        // falso falso falso
        InvertPdfFragment x = Mockito.mock(InvertPdfFragment.class);
        Intent data = Mockito.mock(Intent.class);
        Uri uri = Mockito.mock(Uri.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        Mockito.when(data.getData()).thenReturn(uri);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }
}