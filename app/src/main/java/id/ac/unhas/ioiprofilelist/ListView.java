package id.ac.unhas.ioiprofilelist;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListView extends AppCompatActivity {
    private ImageView imgPhoto;
    private TextView tvName, tvDetail, tvRating;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_member);

        imgPhoto = findViewById(R.id.image_member);
        tvName = findViewById(R.id.nama);
        tvDetail = findViewById(R.id.keterangan);
        tvRating = findViewById(R.id.rating);

    }
}

