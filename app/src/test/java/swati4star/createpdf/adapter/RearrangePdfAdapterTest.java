package swati4star.createpdf.adapter;


import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.junit.Test;

import java.util.ArrayList;

public class RearrangePdfAdapterTest {

    @Test
    public void onBindViewHolder() {
        RearrangePdfAdapter x = mock(RearrangePdfAdapter.class);
        Bitmap bitmap = mock(Bitmap.class);
        x.mBitmaps = new ArrayList<>();
        x.mBitmaps.add(bitmap);
        when(x.getItemCount()).thenReturn(1);
        int position = 0;
        RearrangePdfAdapter.ViewHolder holder = mock(RearrangePdfAdapter.ViewHolder.class);
        holder.buttonUp = mock(ImageButton.class);
        holder.buttonDown = mock(ImageButton.class);
        holder.imageView = mock(ImageView.class);
        holder.pageNumber = mock(TextView.class);
        doCallRealMethod().when(x).onBindViewHolder(holder, position);
        x.onBindViewHolder(holder, position);
        verify(x).onBindViewHolder(holder, position);
    }

    @Test
    public void onBindViewHolder2() {
        RearrangePdfAdapter x = mock(RearrangePdfAdapter.class);
        Bitmap bitmap = mock(Bitmap.class);
        x.mBitmaps = new ArrayList<>();
        x.mBitmaps.add(bitmap);
        int position = 0;
        RearrangePdfAdapter.ViewHolder holder = mock(RearrangePdfAdapter.ViewHolder.class);
        holder.buttonUp = mock(ImageButton.class);
        holder.buttonDown = mock(ImageButton.class);
        holder.imageView = mock(ImageView.class);
        holder.pageNumber = mock(TextView.class);
        doCallRealMethod().when(x).onBindViewHolder(holder, position);
        x.onBindViewHolder(holder, position);
        verify(x).onBindViewHolder(holder, position);
    }

    @Test
    public void onBindViewHolder3() {
        RearrangePdfAdapter x = mock(RearrangePdfAdapter.class);
        Bitmap bitmap = mock(Bitmap.class);
        x.mBitmaps = new ArrayList<>();
        x.mBitmaps.add(bitmap);
        x.mBitmaps.add(bitmap);
        x.mBitmaps.add(bitmap);
        int position = 1;
        when(x.getItemCount()).thenReturn(2);
        RearrangePdfAdapter.ViewHolder holder = mock(RearrangePdfAdapter.ViewHolder.class);
        holder.buttonUp = mock(ImageButton.class);
        holder.buttonDown = mock(ImageButton.class);
        holder.imageView = mock(ImageView.class);
        holder.pageNumber = mock(TextView.class);
        doCallRealMethod().when(x).onBindViewHolder(holder, position);
        x.onBindViewHolder(holder, position);
        verify(x).onBindViewHolder(holder, position);
    }

    @Test
    public void onBindViewHolder4() {
        RearrangePdfAdapter x = mock(RearrangePdfAdapter.class);
        Bitmap bitmap = mock(Bitmap.class);
        x.mBitmaps = new ArrayList<>();
        x.mBitmaps.add(bitmap);
        x.mBitmaps.add(bitmap);
        x.mBitmaps.add(bitmap);
        int position = 1;
        RearrangePdfAdapter.ViewHolder holder = mock(RearrangePdfAdapter.ViewHolder.class);
        holder.buttonUp = mock(ImageButton.class);
        holder.buttonDown = mock(ImageButton.class);
        holder.imageView = mock(ImageView.class);
        holder.pageNumber = mock(TextView.class);
        doCallRealMethod().when(x).onBindViewHolder(holder, position);
        x.onBindViewHolder(holder, position);
        verify(x).onBindViewHolder(holder, position);
    }

    @Test
    public void onClick() {
        RearrangePdfAdapter.ViewHolder x = mock(RearrangePdfAdapter.ViewHolder.class);
        View v = mock(View.class);
        doCallRealMethod().when(x).onClick(v);
        x.onClick(v);
        verify(x).onClick(v);
    }

}