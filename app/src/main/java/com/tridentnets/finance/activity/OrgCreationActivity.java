package com.tridentnets.finance.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.tridentnets.finance.R;

import butterknife.BindView;

public class OrgCreationActivity extends AppCompatActivity {
    @BindView(R.id.edt_start_org_name)
    EditText edtStartOrgName;
    private String strOrgname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org_creation);
        strOrgname = edtStartOrgName.getText().toString().trim();
    }

    private boolean isFillOrgName() {
        return strOrgname.length() > 0;
    }
}
