package swati4star.createpdf.util;

import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.content.Context;

import org.junit.Test;

import java.util.HashMap;

import swati4star.createpdf.R;

public class PageSizeUtilsTest {

    @Test
    public void getPageSize() {
        PageSizeUtils x = mock(PageSizeUtils.class);
        doCallRealMethod().when(x).getPageSize(R.id.page_size_a0_a10, "prova a", "prova b");
        x.getPageSize(R.id.page_size_a0_a10, "prova a", "prova b");
        verify(x).getPageSize(R.id.page_size_a0_a10, "prova a", "prova b");
    }

    @Test
    public void getPageSize2() {
        PageSizeUtils x = mock(PageSizeUtils.class);
        doCallRealMethod().when(x).getPageSize(R.id.page_size_b0_b10, "prova a", "prova b");
        x.getPageSize(R.id.page_size_b0_b10, "prova a", "prova b");
        verify(x).getPageSize(R.id.page_size_b0_b10, "prova a", "prova b");
    }

    @Test
    public void getPageSize3() {
        PageSizeUtils x = mock(PageSizeUtils.class);
        x.mActivity = mock(Context.class);
        x.mPageSizeToString = new HashMap<>();
        x.mPageSizeToString.put(0, 1);
        doCallRealMethod().when(x).getPageSize(0, null, null);
        x.getPageSize(0, null, null);
        verify(x).getPageSize(0, null, null);
    }

    @Test
    public void getKey() {
        PageSizeUtils x = mock(PageSizeUtils.class);
        String value = null;
        HashMap<Integer, Integer> map = new HashMap<>();
        doCallRealMethod().when(x).getKey(map, value);
        x.getKey(map, value);
        verify(x).getKey(map, value);
    }

    @Test
    public void getKey2() {
        PageSizeUtils x = mock(PageSizeUtils.class);
        x.mActivity = mock(Context.class);
        String value = " ";
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2, 1);
        doCallRealMethod().when(x).getKey(map, value);
        x.getKey(map, value);
        verify(x).getKey(map, value);
    }

    @Test
    public void getKey3() {
        PageSizeUtils x = mock(PageSizeUtils.class);
        x.mActivity = mock(Context.class);
        String value = "1";
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        when(x.mActivity.getString(1)).thenReturn("1");
        doCallRealMethod().when(x).getKey(map, value);
        x.getKey(map, value);
        verify(x).getKey(map, value);
    }
}