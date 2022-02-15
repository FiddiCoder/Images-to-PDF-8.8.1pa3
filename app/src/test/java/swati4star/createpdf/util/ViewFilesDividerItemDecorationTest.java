package swati4star.createpdf.util;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ViewFilesDividerItemDecorationTest {

    @Mock
    ViewFilesDividerItemDecoration viewFilesDividerItemDecoration;

    @Mock
    RecyclerView parent;

    @Mock
    Canvas canvas;

    @Mock
    RecyclerView.State state;



    @Test
    public void onDrawOver() {

        MockitoAnnotations.initMocks(this);
        Mockito.when(parent.getChildCount()).thenReturn(0);
        Mockito.doCallRealMethod().when(viewFilesDividerItemDecoration).onDrawOver(canvas,
                parent, state);
        viewFilesDividerItemDecoration.onDrawOver(canvas, parent, state);
        Mockito.verify(viewFilesDividerItemDecoration, Mockito.times(1))
                .onDrawOver(canvas, parent, state);


    }

    @Test
    public void onDrawOver2() {
        /*
        Drawable mDivider = Mockito.spy(Drawable.class);
        MockitoAnnotations.initMocks(this);
        Mockito.when(parent.getChildCount()).thenReturn(1);
        Mockito.when(parent.getPaddingLeft()).thenReturn(44);
        Mockito.when(parent.getPaddingRight()).thenReturn(44);
        Mockito.when(parent.getWidth()).thenReturn(50);
        Mockito.when(parent.getChildAt(0)).thenReturn(Mockito.mock(View.class));
        Mockito.doCallRealMethod().when(viewFilesDividerItemDecoration).onDrawOver(anyObject(),
                anyObject(), anyObject());
        Mockito.when(mDivider.getIntrinsicHeight()).thenReturn(20);
        viewFilesDividerItemDecoration.onDrawOver(canvas, parent, state);
        Mockito.verify(viewFilesDividerItemDecoration, Mockito.times(1)).onDrawOver(canvas, parent, state);
        */

    }

}