package com.example.volumebalok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang, edtLebar, edtTinggi;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPanjang=(EditText)findViewById(R.id.edt_Panjang);
        edtLebar=(EditText)findViewById(R.id.edt_Lebar);
        edtTinggi=(EditText)findViewById(R.id.edt_Tinggi);
        btnCalculate=(Button)findViewById(R.id.btn_Hitung);
        tvResult=(TextView)findViewById(R.id.tv_result);
btnCalculate.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int p, l, t, vol;
        if (edtPanjang.getText().toString().isEmpty()){
            edtPanjang.setError("Harap Isi Panjang Balok");
            return;
        }
        if (edtLebar.getText().toString().isEmpty()){
            edtLebar.setError("Harap Isi Lebar Balok");
            return;
        }
        if (edtTinggi.getText().toString().isEmpty()){
            edtTinggi.setError("Harap Isi Tinggi Balok");
            return;
        }
        p=Integer.parseInt(edtPanjang.getText().toString());
        l=Integer.parseInt(edtLebar.getText().toString());
        t=Integer.parseInt(edtTinggi.getText().toString());
        vol=p*l*t;
        tvResult.setText(String.valueOf(vol));
    }
});

    }


}