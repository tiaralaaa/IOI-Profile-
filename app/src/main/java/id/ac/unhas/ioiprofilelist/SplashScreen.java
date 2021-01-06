package id.ac.unhas.ioiprofilelist;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int loading_time=4000;
        super.onCreate(savedInstanceState);

        setContentView(R.layout.screen_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent home=new Intent(SplashScreen.this, MainActivity.class);
                startActivity(home);
                finish();

            }
        },loading_time);
    }
}
