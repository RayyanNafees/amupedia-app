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

public class appliedchemistryf extends AppCompatActivity {
    FloatingActionButton drawyerff;
    ImageView syllabusapcf ,waterp , watery ,flp, fly ,cpp ,cpy , pp , ppy;
    VideoView vvchemistry;
    private AdView chemistryadview, chemistry2adview , chemistry3adview , chemistry4adview , chemistry5adview, chemistry6adview;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvchemistry.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliedchemistryf);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        vvchemistry=findViewById(R.id.vvchemistry);
        vvchemistry.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.chemistry);
        vvchemistry.start();

///////////////////////////////////////

        chemistryadview = findViewById(R.id.chemistry_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        chemistryadview.loadAd(adRequest);

        chemistry2adview = findViewById(R.id.chemistry2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        chemistry2adview.loadAd(adRequest2);

        chemistry3adview = findViewById(R.id.chemistry3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        chemistry3adview.loadAd(adRequest3);

        chemistry4adview = findViewById(R.id.chemistry4_banner);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        chemistry4adview.loadAd(adRequest4);

        chemistry5adview = findViewById(R.id.chemistry5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        chemistry5adview.loadAd(adRequest5);

        chemistry6adview = findViewById(R.id.chemistry6_banner);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        chemistry6adview.loadAd(adRequest6);


//////////////////////////////////////

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



        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        syllabusapcf = findViewById(R.id.syllabusapcf);
        syllabusapcf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_4c12a8ccf1fb4981ba86bfd40f4803f9.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        waterp = findViewById(R.id.waterp);
        waterp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1W9u4rnFNwlXOEDoPeNF7MzoXnQqe2_jL/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        watery = findViewById(R.id.watery);
        watery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLQvzPLYdJBGcGyREMkipXypbrwjJoJIpj"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        flp = findViewById(R.id.flp);
        flp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1GqwnQ7mwrpKPC1UoxVhnpJUQMxtkLkIV/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        fly = findViewById(R.id.fly);
        fly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLQvzPLYdJBGcodM-2_TvUUR1L5VJUBbdc"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        cpp = findViewById(R.id.cpp);
        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1LcYa2aoOuzINfSnO1dIGoiuJWKkJPlvp/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cpy = findViewById(R.id.cpy);
        cpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLQvzPLYdJBGfoWZK9G7uiWlFHdZ2Xg2ZN"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        pp = findViewById(R.id.pp);
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1daEW95k74std5L_UCqNw6cqYtobVIGjo/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ppy = findViewById(R.id.ppy);
        ppy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLzSTglXGeoUuhXb4czCE_0fA2tQPA1yEk"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
    }
