package rashad.alakbarov.expertmobile.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import rashad.alakbarov.expertmobile.R;

public class LoginActivity extends AppCompatActivity {

    TextView txtLoginSubtitle;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtLoginSubtitle=findViewById(R.id.txt_login_subtitle);
        btnLogin=findViewById(R.id.btnLogin);

        txtLoginSubtitle.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            finish();
        });

        btnLogin.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
            finish();
        });
    }
}