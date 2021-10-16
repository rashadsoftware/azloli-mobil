package rashad.alakbarov.expertmobile.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import rashad.alakbarov.expertmobile.R;

public class MainActivity extends AppCompatActivity {

    ImageView imgProfile;
    RecyclerView recyclerTopWorker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgProfile=findViewById(R.id.img_profile);
        recyclerTopWorker=findViewById(R.id.recycler_top_workers);

        imgProfile.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        });

        recyclerTopWorker.setHasFixedSize(true);
        recyclerTopWorker.setLayoutManager(new LinearLayoutManager(this));

         TopWorkerData[] topWorkerData=new TopWorkerData[]{
                 new TopWorkerData("Rashad Alakbarov", "Proqramçı", R.drawable.image1),
                 new TopWorkerData("Rashad Huseynov", "Satıcı", R.drawable.image2),
                 new TopWorkerData("Rashad Alakbarov", "Proqramçı", R.drawable.image1),
                 new TopWorkerData("Rashad Huseynov", "Satıcı", R.drawable.image2),
                 new TopWorkerData("Rashad Alakbarov", "Proqramçı", R.drawable.image1),
                 new TopWorkerData("Rashad Huseynov", "Satıcı", R.drawable.image2),
                 new TopWorkerData("Rashad Alakbarov", "Proqramçı", R.drawable.image1),
                 new TopWorkerData("Rashad Huseynov", "Satıcı", R.drawable.image2),
         };

         TopWorkerAdapter topWorkerAdapter=new TopWorkerAdapter(topWorkerData, MainActivity.this);
         recyclerTopWorker.setAdapter(topWorkerAdapter);
    }
}