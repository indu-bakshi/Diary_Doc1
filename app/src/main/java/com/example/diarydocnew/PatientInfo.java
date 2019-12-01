package com.example.diarydocnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_info);
        Button button6=(Button) findViewById(R.id.button6);
        Button button7=(Button) findViewById(R.id.button7);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6= new Intent(PatientInfo.this, AddPrescription.class);
                startActivity(intent6);

            }

        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7= new Intent(PatientInfo.this, ViewDiagnosis.class);
                startActivity(intent7);

            }

        });
    }
}
