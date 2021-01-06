package id.ac.unhas.ioiprofilelist;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemRowMember extends AppCompatActivity {
    private TextView title, description;
    private Button more, favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_card_member);

        title = findViewById(R.id.judul);
        description = findViewById(R.id.keterangan);
        more = findViewById(R.id.more);
        favorite = findViewById(R.id.favorite);

    }

}

