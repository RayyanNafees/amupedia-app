package education.educate.amupedia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import education.educate.amupedia.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class english_btech extends AppCompatActivity {

    ImageView englishp1 , englishp2 , englishp3 , englishp4 , englishp5 , englishp6 , englishp7 , englishy1 , englishy2 ,englishp8 , englishsyllabus;
    FloatingActionButton drawyerff;
    VideoView vveng;
    private AdView engad , eng1 , eng2 ,eng3 , eng4 , eng5 , eng6;


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vveng.start();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_btech);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        engad = findViewById(R.id.eng_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        engad.loadAd(adRequest);

        eng1 = findViewById(R.id.eng1_banner);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        eng1.loadAd(adRequest1);

        eng2 = findViewById(R.id.eng2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        eng2.loadAd(adRequest2);

        eng3 = findViewById(R.id.eng3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        eng3.loadAd(adRequest3);

        eng4 = findViewById(R.id.eng4_banner);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        eng4.loadAd(adRequest4);

        eng5 = findViewById(R.id.eng5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        eng5.loadAd(adRequest5);

        eng6 = findViewById(R.id.eng6_banner);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        eng6.loadAd(adRequest6);

        ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if(networkInfo==null || !networkInfo.isConnected() || !networkInfo.isAvailable() || networkInfo.isFailover()){

            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.alert_dialogue);
            dialog.setCancelable(false);
            dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT);
            dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;


            Button button = dialog.findViewById(R.id.btn);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recreate();

                }
            });

            dialog.show();

        }



        vveng=findViewById(R.id.vveng);
        vveng.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.eng);
        vveng.start();

        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        englishp1 = findViewById(R.id.englishp1);
        englishp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/ebbcb7_437e9c9c37a448088b10ac31252dc59a.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        englishp2 = findViewById(R.id.englishp2);
        englishp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_a0ed5ad7f25d44df9c2235d97a7c25a3.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        englishp3 = findViewById(R.id.englishp3);
        englishp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_fbdd48c46b93407da87936ec897a0a7a.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        englishp4 = findViewById(R.id.englishp4);
        englishp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_485fa40b44f54d2eae6dbbe899213f7a.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        englishp5 = findViewById(R.id.englishp5);
        englishp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_8c0ac66d474941b79f92a68a6fb56248.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        englishp6 = findViewById(R.id.englishp6);
        englishp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_47238a1840c54dba8fc5b643e9d8b3b6.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        englishp7 = findViewById(R.id.englishp7);
        englishp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_4aad4f970c1d464fa7ad8c9a04eacb61.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        englishp8 = findViewById(R.id.englishp8);
        englishp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_e6c41d7e02964c9cafb995881e62c050.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        englishy1 = findViewById(R.id.englishy1);
        englishy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=1flo3ys4m7g&feature=emb_title"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        englishy2 = findViewById(R.id.englishy2);
        englishy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=pqJ09yeClec&feature=emb_title"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        englishsyllabus = findViewById(R.id.englishsyllabus);
        englishsyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_044bec02d3714f2e92feb4e3aa892f1c.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


    }
}