package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edt_ten,edt_sdt;
    Switch sw_gt;
    Spinner sp_trinhdo;
    TextView tv_tuoi;
    SeekBar sb_tuoi;
    CheckBox cb_thethao;
    RadioGroup rg_amnhac;
    RadioButton rb_rock,rb_rap,rb_pop, rb_amnhac;
    Button btn_register,btn_cancel;
    ArrayList<String> trinhdo;
    ArrayAdapter arrayAdapter;
    Nguoi nguoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        tuoi();
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancel();
            }
        });
    }

    private void init() {
        edt_ten = findViewById(R.id.edt_ten);
        edt_sdt = findViewById(R.id.edt_sdt);
        sw_gt = findViewById(R.id.sw_gt);
        sp_trinhdo = findViewById(R.id.sp_trinhdo);
        tv_tuoi = findViewById(R.id.tv_tuoi);
        sb_tuoi = findViewById(R.id.sb_tuoi);
        cb_thethao = findViewById(R.id.cb_thethao);
        rg_amnhac = findViewById(R.id.rg_amnhac);
        rb_rock = findViewById(R.id.rb_rock);
        rb_rap = findViewById(R.id.rb_rap);
        rb_pop = findViewById(R.id.rb_pop);
        btn_register = findViewById(R.id.btn_register);
        btn_cancel =findViewById(R.id.btn_cancel);
        trinhdo = new ArrayList<>();
        trinhdo.add("ĐH");
        trinhdo.add("CĐ");
        trinhdo.add("CH");
        arrayAdapter =new ArrayAdapter(this, android.support.constraint.R.layout.support_simple_spinner_dropdown_item,trinhdo);
        arrayAdapter.setDropDownViewResource(android.support.constraint.R.layout.support_simple_spinner_dropdown_item);
        sp_trinhdo.setAdapter(arrayAdapter);

    }
    private void tuoi() {
        sb_tuoi.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv_tuoi.setText("Tuổi: "+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    private void register() {
        String hoten = edt_ten.getText().toString();
        String sdt = edt_sdt.getText().toString();
        boolean gioitinh = sw_gt.isChecked();
        String trinhdo = sp_trinhdo.getSelectedItem().toString();
        int tuoi = sb_tuoi.getProgress();
        boolean thethao = cb_thethao.isChecked();
        rb_amnhac = findViewById(rg_amnhac.getCheckedRadioButtonId());
        String amnhac = rb_amnhac.getText().toString();
        nguoi = new Nguoi(hoten,sdt,gioitinh,trinhdo,tuoi,thethao,amnhac);
        Toast.makeText(this, "Đã lưu", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,thongtinActivity.class);
        intent.putExtra("nguoi",nguoi);
        startActivity(intent);
    }
    private void cancel() {
        edt_ten.setText("");
        edt_sdt.setText("");
        sw_gt.setChecked(false);
        sb_tuoi.setProgress(0);
        tv_tuoi.setText("Tuổi");
        cb_thethao.setChecked(false);
        sp_trinhdo.setAdapter(arrayAdapter);
        rb_rock.setChecked(true);
    }

}