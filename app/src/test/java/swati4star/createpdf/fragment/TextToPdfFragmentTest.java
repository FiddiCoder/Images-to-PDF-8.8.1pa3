package swati4star.createpdf.fragment;



import android.app.Activity;
import android.content.Context;

import org.junit.Test;
import org.mockito.Mockito;

public class TextToPdfFragmentTest {

    @Test
    public void onItemClick() {
        int position = 0;
        TextToPdfFragment x = Mockito.mock(TextToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        Mockito.doNothing().when(x).editFontSize();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick2() {
        int position = 1;
        TextToPdfFragment x = Mockito.mock(TextToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        Mockito.doNothing().when(x).changeFontFamily();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick3() {
        int position = 2;
        TextToPdfFragment x = Mockito.mock(TextToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        Mockito.doNothing().when(x).setPageSize();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick4() {
        int position = 3;
        TextToPdfFragment x = Mockito.mock(TextToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        Mockito.doNothing().when(x).setPassword();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick5() {
        int position = 4;
        TextToPdfFragment x = Mockito.mock(TextToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        Mockito.doNothing().when(x).setFontColor();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick6() {
        int position = 5;
        TextToPdfFragment x = Mockito.mock(TextToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        Mockito.doNothing().when(x).setPageColor();
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onItemClick7() {
        int position = 6;
        TextToPdfFragment x = Mockito.mock(TextToPdfFragment.class);
        Mockito.doCallRealMethod().when(x).onItemClick(position);
        x.onItemClick(position);
        Mockito.verify(x, Mockito.times(1)).onItemClick(position);
    }

    @Test
    public void onAttach() {
        TextToPdfFragment x = Mockito.mock(TextToPdfFragment.class);
        Context context = Mockito.spy(Activity.class);
        Mockito.doCallRealMethod().when(x).onAttach(context);
        x.onAttach(context);
        Mockito.verify(x, Mockito.times(1)).onAttach(context);
    }

    @Test
    public void onAttach2() {
        TextToPdfFragment x = Mockito.mock(TextToPdfFragment.class);
        Context context = Mockito.spy(Context.class);
        Mockito.doCallRealMethod().when(x).onAttach(context);
        x.onAttach(context);
        Mockito.verify(x, Mockito.times(1)).onAttach(context);
    }
}