package swati4star.createpdf.activity;


import android.view.MenuItem;

import org.junit.Test;
import org.mockito.Mockito;

public class FavouritesActivityTest {

    @Test
    public void onOptionsItemSelected() {
        MenuItem item = Mockito.mock(MenuItem.class);
        FavouritesActivity x = Mockito.mock(FavouritesActivity.class);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        Mockito.when(item.getItemId()).thenReturn(android.R.id.home);
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected2() {
        /*
        MenuItem item = Mockito.mock(MenuItem.class);
        FavouritesActivity x = Mockito.mock(FavouritesActivity.class);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        Mockito.when(item.getItemId()).thenReturn(R.id.fav_action_done);
        Mockito.doNothing().when(super.onBackPressed());
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);

         */
    }

    @Test
    public void onOptionsItemSelected3() {
        MenuItem item = Mockito.mock(MenuItem.class);
        FavouritesActivity x = Mockito.mock(FavouritesActivity.class);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }
}