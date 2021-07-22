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

public class computer extends AppCompatActivity {
    FloatingActionButton drawyerff;
    ImageView c_1 ,c_2 , c_3 ,c_4 ,c_5 ,c_6 ,c_7 , computervideo;
    VideoView vvce;
    private AdView computerad, computer2ad , computer3ad;


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvce.start();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        computerad = findViewById(R.id.computer_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        computerad.loadAd(adRequest);

        computer2ad = findViewById(R.id.computer2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        computer2ad.loadAd(adRequest2);

        computer3ad = findViewById(R.id.computer3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        computer3ad.loadAd(adRequest3);



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



        vvce=findViewById(R.id.vvce);
        vvce.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.ce);
        vvce.start();

        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        c_1 = findViewById(R.id.c_1);
        c_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_93c148e581b04a5b9d0198a55d1153fe.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        c_2 = findViewById(R.id.c_2);
        c_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_42e6385e93ef4c7ab4cb6b542608533b.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        c_3 = findViewById(R.id.c_3);
        c_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_0719a0ed3403488298a9b3612944c602.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        c_4 = findViewById(R.id.c_4);
        c_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_091aea988708480a9dadb7bfc920da02.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        c_5 = findViewById(R.id.c_5);
        c_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_95761981974745c799a3ea0fe03f5480.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        c_6 = findViewById(R.id.c_6);
        c_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_96cee2b704d54cb88b2b9613ad24d213.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        c_7 = findViewById(R.id.c_7);
        c_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_d04db715089241949299579f4a757a34.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        computervideo = findViewById(R.id.computer_video);
        computervideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=ZSPZob_1TOk&t=28144s"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });




    }
}