package id.ac.unhas.ioiprofilelist;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CardView extends AppCompatActivity {
    private ImageView imgPhoto;
    private TextView tvName, tvDetail, tvRating;
    private Button btnMore, btnFavorite;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_card_member);

        imgPhoto = findViewById(R.id.image_member);
        tvName = findViewById(R.id.judul);
        tvDetail = findViewById(R.id.keterangan);
        btnMore = findViewById(R.id.more);
        btnFavorite = findViewById(R.id.favorite);
        tvRating = findViewById(R.id.rating);

    }
}

