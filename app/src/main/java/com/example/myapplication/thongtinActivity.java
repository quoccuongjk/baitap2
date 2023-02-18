package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class thongtinActivity extends AppCompatActivity {
    Nguoi nguoi;
    TextView tv_hoten,tv_sdt,tv_gtinh,tv_trinhdo,tv_tuoi,tv_thethao,tv_amnhac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtin);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Thông tin");
        actionBar.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        nguoi =(Nguoi) intent.getSerializableExtra("nguoi");
        tv_hoten = findViewById(R.id.tv_hoten);
        tv_sdt = findViewById(R.id.tv_sdt);
        tv_gtinh = findViewById(R.id.tv_gtinh);
        tv_trinhdo = findViewById(R.id.tv_trinhdo);
        tv_tuoi = findViewById(R.id.tv_tuoi);
        tv_thethao = findViewById(R.id.tv_thethao);
        tv_amnhac = findViewById(R.id.tv_amnhac);
        tv_hoten.setText("Họ và tên: "+nguoi.getHoten());
        tv_sdt.setText("Số điện thoại: "+nguoi.getSdt());
        if (nguoi.isGioitinh()) {
            tv_gtinh.setText("Giới tính: Nam");
        } else {
            tv_gtinh.setText("Giới tính: Nữ");
        }
        tv_trinhdo.setText("Trinh độ: "+nguoi.getTrinhdo());
        tv_tuoi.setText("Tuổi: "+nguoi.getTuoi());
        if (nguoi.isThethao()) {
            tv_thethao.setText("Thể thao : có");
        } else {
            tv_thethao.setText("Thể thao : không");
        }
        tv_amnhac.setText("Âm nhạc: "+nguoi.getAmnhac());
    }
}