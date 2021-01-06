package id.ac.unhas.ioiprofilelist;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    private TextView name, email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        email = findViewById(R.id.tv_about_email);
        name = findViewById(R.id.tv_about_nama);

    }
}

