package com.tridentnets.finance.utils;


import android.text.TextUtils;
import android.util.Patterns;

/**
 * @Desc
 * @Author Dharmalingam.R
 * @Company Trident Solution & Created on 17 Apr 2018
 */

public class BaseMethods {


    public  static boolean isValidEmail(String target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return !TextUtils.isEmpty(phoneNumber) && Patterns.PHONE.matcher(phoneNumber).matches();
    }
}

