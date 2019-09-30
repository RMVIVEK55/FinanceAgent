package com.tridentnets.finance.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tridentnets.finance.R;
import com.tridentnets.finance.utils.BaseMethods;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.edt_login_emilid)
    EditText edtLoginEmailId;
    @BindView(R.id.edt_login_password)
    EditText edtLoginPwd;
    String strLoginEmailid, strLoginPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager
                .LayoutParams.FLAG_FULLSCREEN);
        initView();

    }

    private void getValues() {
        strLoginEmailid = edtLoginEmailId.getText().toString().trim();
        strLoginPwd = edtLoginPwd.getText().toString().trim();
        btnLogin.setTextColor(Color.RED);
    }

    private void initView() {
      //  btnLogin.setOnClickListener(this);
    }

    private boolean isFillLoginDetails() {
        return BaseMethods.isValidEmail(strLoginEmailid) && strLoginPwd.length() >= 6;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                getValues();
                boolean b = isFillLoginDetails();
                Toast.makeText(getApplication(), b + "", Toast.LENGTH_SHORT).show();
        }
    }
}
