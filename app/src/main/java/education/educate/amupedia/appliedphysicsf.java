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

public class appliedphysicsf extends AppCompatActivity {
    FloatingActionButton drawyerff;
    ImageView syllabusapsf , semiconductorsp1, semiconductorsp2, semiconductorsp3 , lasers_1 , lasers_2 ,waves_1, waves_2 ,waves_3, statis_1 ,statis_2;
    VideoView vvphysics;
    private AdView physadview, phys2adview , phys3adview , phys4adview , phys5adview , phys6adview ;



    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvphysics.start();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliedphysicsf);

        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ///////////////////////////////////////////////////

        physadview = findViewById(R.id.physics_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        physadview.loadAd(adRequest);

        phys2adview = findViewById(R.id.physics2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        phys2adview.loadAd(adRequest2);

        phys3adview = findViewById(R.id.physics3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        phys3adview.loadAd(adRequest3);

        phys4adview = findViewById(R.id.physics4_banner);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        phys4adview.loadAd(adRequest4);

        phys5adview = findViewById(R.id.physics5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        phys5adview.loadAd(adRequest5);
        phys5adview.loadAd(adRequest5);

        phys6adview = findViewById(R.id.physics6_banner);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        phys6adview.loadAd(adRequest6);

        //////////////////////////////////////////////////

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


        vvphysics=findViewById(R.id.vvphysics);
        vvphysics.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.physics);
        vvphysics.start();

        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        syllabusapsf = findViewById(R.id.syllabusapsf);
        syllabusapsf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/408c58_c365d2f2db344949abc7a82b089d757b.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        semiconductorsp1 = findViewById(R.id.semiconductorsp1);
        semiconductorsp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1umbTHfSzCqXRQAPWKMJ-poiiKBSDLCIG/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        semiconductorsp2 = findViewById(R.id.semiconductorsp2);
        semiconductorsp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/16z5LODLy7Rga29MBPPxnJnHklNMyN6Fq/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        semiconductorsp3 = findViewById(R.id.semiconductorsp3);
        semiconductorsp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1fpGe5pxatdQ3PLzNUCHq6EnWMeKag1bz/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



        lasers_1 = findViewById(R.id.lasers_1);
        lasers_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/19pm66cf_mPGeq2GQQB-Z80jPpxy7ODye/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        lasers_2 = findViewById(R.id.lasers_2);
        lasers_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1mP8GZXkS_eF9XocMP6YKIV5Qi_oOHkzl/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



        waves_1 = findViewById(R.id.waves_1);
        waves_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1Be_wA83-K3ahy9QXxiKNWuwk28G_oR-7/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        waves_2 = findViewById(R.id.waves_2);
        waves_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1OkD9ATWfDj0OvXohPyBxgUBHlGB8Mlh9/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        waves_3 = findViewById(R.id.waves_3);
        waves_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1aIMHYh2j226i14tLLNxk9OcPAwHLpWHE/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



        statis_1 = findViewById(R.id.statis_1);
        statis_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1Hv3bfdQpxyt3CANJ_sMcrrEjxGGFIjbx/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        statis_2 = findViewById(R.id.statis_2);
        statis_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1gv7BHvTcTnZPYTYJRwydp40FOw-uw3DL/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


    }
}