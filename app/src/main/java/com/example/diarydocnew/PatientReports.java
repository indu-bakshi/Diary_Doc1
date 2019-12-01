package com.example.diarydocnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientReports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_reports);
        Button button5=(Button) findViewById(R.id.button5);
        Button button8=(Button) findViewById(R.id.button8);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5= new Intent(PatientReports.this, AddDiagnosis.class);
                startActivity(intent5);

            }

        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8= new Intent(PatientReports.this, ViewPrescription.class);
                startActivity(intent8);

            }

        });
    }
}
