package rashad.alakbarov.expertmobile.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import rashad.alakbarov.expertmobile.R;

public class ProfileDetailActivity extends AppCompatActivity {

    ImageView backbtn, chatbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_detail);

        backbtn=findViewById(R.id.backBtn);
        chatbtn=findViewById(R.id.chatProfile);

        backbtn.setOnClickListener(v -> ProfileDetailActivity.super.onBackPressed());

        chatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileDetailActivity.this, ChatActivity.class));
                finish();
            }
        });
    }
}