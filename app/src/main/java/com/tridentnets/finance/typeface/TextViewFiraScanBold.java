package com.tridentnets.finance.typeface;


import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.tridentnets.finance.R;

/**
 * @Desc
 * @Author Dharmalingam.R
 * @Company Trident Solution & Created on 11 Apr 2018
 */

public class TextViewFiraScanBold extends AppCompatTextView {
    public TextViewFiraScanBold(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public TextViewFiraScanBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public TextViewFiraScanBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
    }
    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface(context.getString(R.string.fira_scans_bold), context);
        setTypeface(customFont);
    }
}
