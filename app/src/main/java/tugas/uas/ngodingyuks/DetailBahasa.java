package tugas.uas.ngodingyuks;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailBahasa extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bahasa);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);

        Bahasa bahasa = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (bahasa != null) {
            Glide.with(this)
                    .load(bahasa.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(bahasa.getNama_bahasa());
            tvDeskripsi.setText(bahasa.getDetail_bahasa());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Bahasa");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
