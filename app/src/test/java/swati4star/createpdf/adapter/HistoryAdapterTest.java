package swati4star.createpdf.adapter;


import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.widget.ImageView;
import android.widget.TextView;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import swati4star.createpdf.database.History;

public class HistoryAdapterTest {

    @Test
    public void getItemCount() {
        HistoryAdapter x = mock(HistoryAdapter.class);
        x.mHistoryList = null;
        doCallRealMethod().when(x).getItemCount();
        x.getItemCount();
        verify(x).getItemCount();
    }

    @Test
    public void getItemCount2() {
        HistoryAdapter x = mock(HistoryAdapter.class);
        x.mHistoryList = new ArrayList<>();
        doCallRealMethod().when(x).getItemCount();
        x.getItemCount();
        verify(x).getItemCount();
    }

    @Test
    public void onBindViewHolder() {
        HistoryAdapter x = mock(HistoryAdapter.class);
        History history = mock(History.class);
        x.mHistoryList = new ArrayList<>();
        x.mHistoryList.add(history);
        HistoryAdapter.ViewHistoryHolder holder = mock(HistoryAdapter.ViewHistoryHolder.class);
        holder.mFilename = mock(TextView.class);
        holder.mOperationDate = mock(TextView.class);
        holder.mOperationType = mock(TextView.class);
        holder.mOperationImage = mock(ImageView.class);
        when(x.mHistoryList.get(0).getFilePath()).thenReturn("prova.pdf");
        when(x.mHistoryList.get(0).getDate()).thenReturn("12 12 12 13:33");
        doCallRealMethod().when(x).onBindViewHolder(holder, 0);
        x.onBindViewHolder(holder, 0);
        verify(x).onBindViewHolder(holder, 0);
    }

    @Test
    public void onBindViewHolder2() {
        HistoryAdapter x = mock(HistoryAdapter.class);
        History history = mock(History.class);
        x.mHistoryList = new ArrayList<>();
        x.mHistoryList.add(history);
        HistoryAdapter.ViewHistoryHolder holder = mock(HistoryAdapter.ViewHistoryHolder.class);
        holder.mFilename = mock(TextView.class);
        holder.mOperationDate = mock(TextView.class);
        holder.mOperationType = mock(TextView.class);

        holder.mOperationImage = mock(ImageView.class);
        x.mIconsOperationList = new HashMap<>();
        x.mIconsOperationList.put("prova", 1);
        when(x.mHistoryList.get(0).getOperationType()).thenReturn("prova");
        when(x.mHistoryList.get(0).getFilePath()).thenReturn("prova.pdf");
        when(x.mHistoryList.get(0).getDate()).thenReturn("12 12 12 13:33");
        doCallRealMethod().when(x).onBindViewHolder(holder, 0);
        x.onBindViewHolder(holder, 0);
        verify(x).onBindViewHolder(holder, 0);
    }

    @Test
    public void onBindViewHolder3() {
        HistoryAdapter x = mock(HistoryAdapter.class);
        History history = mock(History.class);
        x.mHistoryList = new ArrayList<>();
        x.mHistoryList.add(history);
        HistoryAdapter.ViewHistoryHolder holder = mock(HistoryAdapter.ViewHistoryHolder.class);
        holder.mFilename = mock(TextView.class);
        holder.mOperationDate = mock(TextView.class);
        holder.mOperationType = mock(TextView.class);
        holder.mOperationImage = mock(ImageView.class);
        x.mIconsOperationList = new HashMap<>();
        x.mIconsOperationList.put("prova", 1);
        when(x.mHistoryList.get(0).getOperationType()).thenReturn("prova");
        when(x.mHistoryList.get(0).getFilePath()).thenReturn("prova.pdf");
        when(x.mHistoryList.get(0).getDate()).thenReturn("2");
        doCallRealMethod().when(x).onBindViewHolder(holder, 0);
        x.onBindViewHolder(holder, 0);
        verify(x).onBindViewHolder(holder, 0);
    }

    @Test
    public void onBindViewHolder4() {
        HistoryAdapter x = mock(HistoryAdapter.class);
        History history = mock(History.class);
        x.mHistoryList = new ArrayList<>();
        x.mHistoryList.add(history);
        HistoryAdapter.ViewHistoryHolder holder = mock(HistoryAdapter.ViewHistoryHolder.class);
        holder.mFilename = mock(TextView.class);
        holder.mOperationDate = mock(TextView.class);
        holder.mOperationType = mock(TextView.class);
        holder.mOperationImage = mock(ImageView.class);
        x.mIconsOperationList = null;
        when(x.mHistoryList.get(0).getOperationType()).thenReturn("prova");
        when(x.mHistoryList.get(0).getFilePath()).thenReturn("prova.pdf");
        when(x.mHistoryList.get(0).getDate()).thenReturn("2");
        doCallRealMethod().when(x).onBindViewHolder(holder, 0);
        x.onBindViewHolder(holder, 0);
        verify(x).onBindViewHolder(holder, 0);
    }
}