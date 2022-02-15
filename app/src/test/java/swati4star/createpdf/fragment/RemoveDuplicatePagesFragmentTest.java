package swati4star.createpdf.fragment;


import android.content.Intent;
import android.net.Uri;

import org.junit.Test;
import org.mockito.Mockito;

public class RemoveDuplicatePagesFragmentTest {
    @Test
    public void onActivityResult() {
        // vero vero vero
        RemoveDuplicatePagesFragment x = Mockito.mock(RemoveDuplicatePagesFragment.class);
        Intent data = null;
        Mockito.doCallRealMethod().when(x).onActivityResult(0, 0, data);
        x.onActivityResult(0, 0, data);
        Mockito.verify(x).onActivityResult(0, 0, data);
    }

    @Test
    public void onActivityResult2() {
        // vero falso vero
        RemoveDuplicatePagesFragment x = Mockito.mock(RemoveDuplicatePagesFragment.class);
        Intent data = null;
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }

    @Test
    public void onActivityResult3() {
        // FALSO VERO VERO
        RemoveDuplicatePagesFragment x = Mockito.mock(RemoveDuplicatePagesFragment.class);
        Intent data = Mockito.mock(Intent.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, 0, data);
        x.onActivityResult(0, 0, data);
        Mockito.verify(x).onActivityResult(0, 0, data);
    }

    @Test
    public void onActivityResult4() {
        // FALSO VERO falso
        RemoveDuplicatePagesFragment x = Mockito.mock(RemoveDuplicatePagesFragment.class);
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
        RemoveDuplicatePagesFragment x = Mockito.mock(RemoveDuplicatePagesFragment.class);
        Intent data = Mockito.mock(Intent.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }

    @Test
    public void onActivityResult6() {
        // falso falso falso
        RemoveDuplicatePagesFragment x = Mockito.mock(RemoveDuplicatePagesFragment.class);
        Intent data = Mockito.mock(Intent.class);
        Uri uri = Mockito.mock(Uri.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        Mockito.when(data.getData()).thenReturn(uri);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }
}