package com.tridentnets.finance.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tridentnets.finance.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OrgCreateNextStepActivity extends AppCompatActivity {
    @BindView(R.id.edt_org_nxt_step_org_name)
    EditText edtOrgName;
    @BindView(R.id.edt_org_nxt_step_sub_domain_name)
    EditText edtOrgDomainName;
    @BindView(R.id.edt_org_nxt_step_sub_city)
    EditText edtOrgCity;
    @BindView(R.id.edt_org_nxt_step_sub_state)
    EditText edtOrgState;
    @BindView(R.id.edt_org_nxt_step_sub_country)
    EditText edtOrgCountryName;
    @BindView(R.id.edt_org_nxt_step_sub_phone_code)
    EditText edtOrgPhoneCode;
    @BindView(R.id.edt_org_nxt_step_phone_number)
    EditText edtOrgPhone;
    @BindView(R.id.btn_org_nxt_step)
    Button btnOrgNxtStep;
    @BindView(R.id.rlay_org_creation)
    RelativeLayout rLayOrgCreation;
    @BindView(R.id.txt_org_nxt_step_move_to_login)
    TextView txtOrgMoveToLogin;
    private String strOrgName, strOrgDomainName, strOrgState, strOrgCity, strOrgCountryName,
            strOrgPhoneCode, getStrOrgPhoneNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org_create_next_step);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ButterKnife.bind(this);
        getValues();
        initView();


    }

    private void initView() {
        btnOrgNxtStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rLayOrgCreation.setVisibility(View.VISIBLE);
                txtOrgMoveToLogin.setVisibility(View.VISIBLE);
                btnOrgNxtStep.setVisibility(View.GONE);

            }
        });
    }

    private void getValues() {
        strOrgCountryName = edtOrgCountryName.getText().toString().trim();
        strOrgName = edtOrgName.getText().toString().trim();
        strOrgDomainName = edtOrgDomainName.getText().toString().trim();
        strOrgCity = edtOrgCity.getText().toString().trim();
        strOrgState = edtOrgState.getText().toString().trim();
        strOrgPhoneCode = edtOrgPhoneCode.getText().toString().trim();
        getStrOrgPhoneNum = edtOrgPhone.getText().toString().trim();
    }

    private boolean isFillOrgDetails() {
        return strOrgName.length() > 0 && strOrgDomainName.length() > 0 && strOrgPhoneCode.length()
                > 0 && getStrOrgPhoneNum.length() > 0 && strOrgCountryName.length() > 0;
    }
}
