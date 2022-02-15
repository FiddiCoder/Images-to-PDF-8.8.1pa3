package swati4star.createpdf.activity;


import android.content.Intent;

import org.junit.Test;
import org.mockito.Mockito;

public class PreviewActivityTest {

    @Test
    public void onActivityResult() {
        Intent data = Mockito.mock(Intent.class);
        PreviewActivity x = Mockito.spy(PreviewActivity.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, 0, data);
        x.onActivityResult(0, 0, data);
        Mockito.verify(x).onActivityResult(0, 0, data);
    }

    @Test
    public void onActivityResult2() {
        Intent data = Mockito.mock(Intent.class);
        PreviewActivity x = Mockito.spy(PreviewActivity.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(0, -1, data);
        x.onActivityResult(0, -1, data);
        Mockito.verify(x).onActivityResult(0, -1, data);
    }

    @Test
    public void onActivityResult3() {
        Intent data = Mockito.mock(Intent.class);
        PreviewActivity x = Mockito.spy(PreviewActivity.class);
        Mockito.doCallRealMethod().when(x).onActivityResult(1, -1, data);
        x.onActivityResult(1, -1, data);
        Mockito.verify(x).onActivityResult(1, -1, data);
    }

    @Test
    public void onItemClick() {
        PreviewActivity x = Mockito.spy(PreviewActivity.class);
        Mockito.doCallRealMethod().when(x).onItemClick(0);
        x.onItemClick(0);
        Mockito.verify(x).onItemClick(0);
    }

    @Test
    public void onItemClick2() {
        PreviewActivity x = Mockito.spy(PreviewActivity.class);
        Mockito.doCallRealMethod().when(x).onItemClick(1);
        Mockito.doNothing().when(x).sortImages();
        x.onItemClick(1);
        Mockito.verify(x).onItemClick(1);
    }

    @Test
    public void onItemClick3() {
        PreviewActivity x = Mockito.spy(PreviewActivity.class);
        Mockito.doCallRealMethod().when(x).onItemClick(-1);
        x.onItemClick(-1);
        Mockito.verify(x).onItemClick(-1);
    }
}