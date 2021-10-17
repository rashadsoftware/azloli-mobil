package rashad.alakbarov.expertmobile.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import rashad.alakbarov.expertmobile.R;

public class RegisterActivity extends AppCompatActivity {

    TextView txtRegisterSubtitle;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtRegisterSubtitle=findViewById(R.id.txt_register_subtitle);
        btnRegister=findViewById(R.id.btnRegister);

        txtRegisterSubtitle.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            finish();
        });

        btnRegister.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            finish();
        });
    }
}