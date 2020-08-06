package com.example.hiv_ebeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginAndRegisterPage extends AppCompatActivity {

    private Button regButton;
    private Button logInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_and_register_page);

        regButton = (Button) findViewById(R.id.signUpBtn);
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegister();
            }
        });


    }

    public void openRegister(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }


}