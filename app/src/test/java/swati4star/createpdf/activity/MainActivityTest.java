package swati4star.createpdf.activity;


import static swati4star.createpdf.util.Constants.IS_WELCOME_ACTIVITY_SHOWN;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.MenuItem;

import org.junit.Test;
import org.mockito.Mockito;

import swati4star.createpdf.R;
import swati4star.createpdf.providers.fragmentmanagement.FragmentManagement;

public class MainActivityTest {

    @Test
    public void setTitleFragment() {
        int title = 0;
        MainActivity x = Mockito.mock(MainActivity.class);
        Mockito.doCallRealMethod().when(x).setTitleFragment(title);
        x.setTitleFragment(title);
        Mockito.verify(x).setTitleFragment(title);
    }

    @Test
    public void setTitleFragment2() {
        int title = 1;
        MainActivity x = Mockito.mock(MainActivity.class);
        Mockito.doCallRealMethod().when(x).setTitleFragment(title);
        x.setTitleFragment(title);
        Mockito.verify(x).setTitleFragment(title);
    }

    @Test
    public void openWelcomeActivity() {
        MainActivity x = Mockito.mock(MainActivity.class);
        Intent intent = Mockito.mock(Intent.class);
        x.mSharedPreferences = Mockito.mock(SharedPreferences.class);
        Mockito.doCallRealMethod().when(x).openWelcomeActivity();
        Mockito.when(x.mSharedPreferences.getBoolean(IS_WELCOME_ACTIVITY_SHOWN, false))
                .thenReturn(true);
        x.openWelcomeActivity();
        Mockito.verify(x).openWelcomeActivity();
    }

    @Test
    public void onOptionsItemSelected() {
        MainActivity x = Mockito.mock(MainActivity.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }

    @Test
    public void onOptionsItemSelected2() {
        MainActivity x = Mockito.mock(MainActivity.class);
        MenuItem item = Mockito.mock(MenuItem.class);
        x.mFragmentManagement = Mockito.mock(FragmentManagement.class);
        Mockito.doCallRealMethod().when(x).onOptionsItemSelected(item);
        Mockito.when(item.getItemId()).thenReturn(R.id.menu_favourites_item);
        x.onOptionsItemSelected(item);
        Mockito.verify(x).onOptionsItemSelected(item);
    }

}