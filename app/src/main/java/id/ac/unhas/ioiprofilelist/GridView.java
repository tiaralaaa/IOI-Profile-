package id.ac.unhas.ioiprofilelist;


import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GridView extends AppCompatActivity {

    private TextView tvRating;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_grid_member);

        tvRating = findViewById(R.id.rating);

    }
}
