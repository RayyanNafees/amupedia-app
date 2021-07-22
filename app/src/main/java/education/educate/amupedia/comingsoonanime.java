package education.educate.amupedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import education.educate.amupedia.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class comingsoonanime extends AppCompatActivity {
    private AdView comingad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_comingsoonanime);

        comingad = findViewById(R.id.comingsoon_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        comingad.loadAd(adRequest);
    }
}