package swati4star.createpdf.adapter;

import android.support.constraint.ConstraintLayout;
import android.widget.TextView;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import swati4star.createpdf.model.FAQItem;

public class FAQAdapterTest {

    @Mock
    FAQAdapter x;

    @Test
    public void onBindViewHolder() {
        MockitoAnnotations.initMocks(this);
        FAQAdapter.FAQViewHolder faqViewHolder = Mockito.mock(FAQAdapter.FAQViewHolder.class);
        FAQItem item = Mockito.mock(FAQItem.class);
        x.mFaqs = new ArrayList<>();
        x.mFaqs.add(item);
        faqViewHolder.question = Mockito.mock(TextView.class);
        faqViewHolder.answer = Mockito.mock(TextView.class);
        faqViewHolder.expandableView = Mockito.mock(ConstraintLayout.class);
        Mockito.doCallRealMethod().when(x).onBindViewHolder(faqViewHolder, 0);
        x.onBindViewHolder(faqViewHolder, 0);
        Mockito.verify(x).onBindViewHolder(faqViewHolder, 0);
    }

    @Test
    public void onBindViewHolder2() {
        MockitoAnnotations.initMocks(this);
        FAQAdapter.FAQViewHolder faqViewHolder = Mockito.mock(FAQAdapter.FAQViewHolder.class);
        FAQItem item = Mockito.mock(FAQItem.class);
        x.mFaqs = new ArrayList<>();
        x.mFaqs.add(item);
        faqViewHolder.question = Mockito.mock(TextView.class);
        faqViewHolder.answer = Mockito.mock(TextView.class);
        faqViewHolder.expandableView = Mockito.mock(ConstraintLayout.class);
        Mockito.doCallRealMethod().when(x).onBindViewHolder(faqViewHolder, 0);
        Mockito.when(item.isExpanded()).thenReturn(true);
        x.onBindViewHolder(faqViewHolder, 0);
        Mockito.verify(x).onBindViewHolder(faqViewHolder, 0);
    }
}