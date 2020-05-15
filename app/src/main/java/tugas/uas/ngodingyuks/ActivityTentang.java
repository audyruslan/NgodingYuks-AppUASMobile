package tugas.uas.ngodingyuks;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTentang extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Tentang");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
