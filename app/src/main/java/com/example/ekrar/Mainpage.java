package com.example.ekrar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mainpage extends AppCompatActivity {
TextView txt_update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
          txt_update=(TextView)findViewById(R.id.text_update);
          txt_update.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent mainIntent = new Intent(Mainpage.this, Update_MyProfile.class);
                  Mainpage.this.startActivity(mainIntent);
                  Mainpage.this.finish();
              }
          });
    }
}
