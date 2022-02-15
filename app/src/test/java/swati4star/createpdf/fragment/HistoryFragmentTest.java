package swati4star.createpdf.fragment;


import android.view.MenuItem;

import org.junit.Test;
import org.mockito.Mockito;

import swati4star.createpdf.R;

public class HistoryFragmentTest {

    @Test
    public void onOptionsItemSelected() {
        HistoryFragment x = Mockito.spy(HistoryFragment.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.when(item.getItemId()).thenReturn(R.id.actionDeleteHistory);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        Mockito.doNothing().when(x).deleteHistory();
        x.onOptionsItemSelected(item);
        Mockito.verify(x, Mockito.times(1)).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected2() {
        HistoryFragment x = Mockito.spy(HistoryFragment.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.when(item.getItemId()).thenReturn(R.id.actionFilterHistory);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        Mockito.doNothing().when(x).openFilterDialog();
        x.onOptionsItemSelected(item);
        Mockito.verify(x, Mockito.times(1)).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected3() {
        HistoryFragment x = Mockito.spy(HistoryFragment.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.when(item.getItemId()).thenReturn(R.id.value);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        x.onOptionsItemSelected(item);
        Mockito.verify(x, Mockito.times(1)).onOptionsItemSelected(item);
    }

}