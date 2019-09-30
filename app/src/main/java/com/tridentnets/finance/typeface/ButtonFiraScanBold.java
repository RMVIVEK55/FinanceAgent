package com.tridentnets.finance.typeface;


import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.tridentnets.finance.R;

/**
 * @Desc
 * @Author Dharmalingam.R
 * @Company Trident Solution & Created on 17 Apr 2018
 */

public class ButtonFiraScanBold  extends AppCompatButton{
    public ButtonFiraScanBold(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public ButtonFiraScanBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public ButtonFiraScanBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
    }
    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface(context.getString(R.string.fira_scans_medium), context);
        setTypeface(customFont);
    }
}
