package com.tridentnets.finance.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneNumberUtils;
import android.text.Html;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.tridentnets.finance.R;
import com.tridentnets.finance.common.Keys;
import com.tridentnets.finance.utils.BaseMethods;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignUpActivity extends AppCompatActivity {
    @BindView(R.id.txt_terms_info)
    TextView txtTermInfo;
    @BindView(R.id.txt_already_signed)
    TextView txtAlreadySigned;
    private String strTermInfo,strFname,strLname,strEmail,strPassword,strPhone,strPhoneCode;
    @BindView(R.id.edt_fname)
    EditText edtFname;
    @BindView(R.id.edt_lname)
    EditText edtLname;
    @BindView(R.id.edt_email)
    EditText edtEmail;
    @BindView(R.id.edt_phone)
    EditText edtPhoneNumber;
    @BindView(R.id.edt_password)
    EditText edtPassword;
    @BindView(R.id.edt_phone_code)
    EditText edtPhoneCode;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ButterKnife.bind(this);
        initView();
        getStrValue();
    }

    private void getStrValue() {
        strFname=edtFname.getText().toString().trim();
        strLname=edtLname.getText().toString().trim();
        strEmail=edtEmail.getText().toString().trim();
        strPassword=edtPassword.getText().toString().trim();
        strPhone=edtPhoneNumber.getText().toString().trim();
        strPhoneCode=edtPhoneCode.getText().toString().trim();
    }

    private boolean isFillSignUp()
    {
        return strFname.length() > 0 && strFname.length() > 0 && BaseMethods.isValidEmail
                (strEmail) && BaseMethods
                .isValidPhoneNumber(strPhone) && strPhoneCode.length() > 0 && strPassword.length() > 0;
    }
    private void initView() {
        strTermInfo = "<font color= " + getResources().getColor(R.color.silver) + ">By clicking on " +
                "<b>\"create " +
                "Account\"</b>, " +
                "you agree to" +
                " " +
                "the </font><font color=" + getResources().getColor(R.color.dodgerblue) + " >Terms" +
                " of Service " +
                "</font><font color=" + getResources().getColor(R.color.silver) + ">and </font><font " +
                "color=" + getResources().getColor(R.color.dodgerblue) +
                ">privacy policy</font>";
        txtTermInfo.setText(Html.fromHtml(strTermInfo));
//        SpannableString ss = new SpannableString("Android is a Software stack");
//        ClickableSpan clickableSpan=new ClickableSpan() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"ab",Toast.LENGTH_LONG).show();
//            }
//        };
//        ss.setSpan(clickableSpan, 22, 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        txtTermInfo.setText(ss);
//        txtTermInfo.setMovementMethod(LinkMovementMethod.getInstance());
//        txtTermInfo.setHighlightColor(getResources().getColor(R.color.dodgerblue));


    }

    @OnClick(R.id.txt_already_signed)
    void login() {
        getStrValue();
        boolean b=isFillSignUp();
        Toast.makeText(getApplicationContext(),b+"",Toast.LENGTH_SHORT).show();
     startActivity(new Intent(SignUpActivity.this, LoginActivity.class));

    }

}
