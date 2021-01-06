package id.ac.unhas.ioiprofilelist;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MoreDetailMembers extends AppCompatActivity {

    private ImageView imageMembers, ic_favourite;
    private TextView nameMembers, detailMembers, detailMoreMembers, detailRating;
    private Boolean is_favourite = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_detail_member);

        imageMembers = findViewById(R.id.image_member);
        nameMembers = findViewById(R.id.tv_item_nama_member);
        detailMoreMembers = findViewById(R.id.detail_more_member);
        detailMembers = findViewById(R.id.deskripsi);
        detailRating = findViewById(R.id.rating);
        ic_favourite = findViewById(R.id.ic_favourite);

        tampilDetail();

        ic_favourite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (!is_favourite) {
                    is_favourite = true;
                    ic_favourite.setColorFilter(Color.RED);

                    Toast.makeText(view.getContext(), "You Like Her", Toast.LENGTH_SHORT).show();
                } else {
                    is_favourite = false;
                    ic_favourite.setColorFilter(Color.BLACK);
                }
            }
        });

    }

    private void tampilDetail() {
        Intent intent = getIntent();

        int foto = intent.getIntExtra("FOTO", 0);
        String title = intent.getStringExtra("NAMA_MEMBER");
        String about = intent.getStringExtra("ABOUT");
        String description = intent.getStringExtra("DESKRIPSI");
        String rating = intent.getStringExtra("RATING");

        // tampilkan data di titlebar
        getSupportActionBar().setTitle(title);
        getSupportActionBar().show();
        nameMembers.setText(title);

        // tampilkan gambar
        Glide.with(this)
                .load(foto)
                .apply(new RequestOptions().override(350, 550))
                .into(imageMembers);

        // tampilkan data judul, detail dll
        detailMoreMembers.setText(about);

        // tampilkan data deskripsi
        detailMembers.setText(description);

        // tampilkan data rating
        detailRating.setText(rating);
    }
}
