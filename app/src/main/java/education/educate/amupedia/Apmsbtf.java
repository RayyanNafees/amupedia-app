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

public class Apmsbtf extends AppCompatActivity {
    FloatingActionButton drawyerff;
    ImageView syllabus, pdap , pday ,mip , miy ,
            ltp1 ,ltp2 , ltp3 ,lty ,
            fsfp1 , fsfp2 , fsfy;
    VideoView vvmath2bf;
    private AdView Apmsbtfadview, Apmsbtf2adview ,Apmsbtf3adview , Apmsbtf4adview , Apmsbtf5adview , Apmsbtf6adview;



    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvmath2bf.start();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apmsbtf);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //////////////////

        Apmsbtfadview = findViewById(R.id.apmsbtf_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        Apmsbtfadview.loadAd(adRequest);

        Apmsbtf2adview = findViewById(R.id.apmsbtf2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        Apmsbtf2adview.loadAd(adRequest2);

        Apmsbtf3adview = findViewById(R.id.apmsbtf3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        Apmsbtf3adview.loadAd(adRequest3);

        Apmsbtf4adview = findViewById(R.id.apmsbtf4_banner);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        Apmsbtf4adview.loadAd(adRequest4);

        Apmsbtf5adview = findViewById(R.id.apmsbtf5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        Apmsbtf5adview.loadAd(adRequest5);

        Apmsbtf6adview = findViewById(R.id.apmsbtf6_banner);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        Apmsbtf6adview.loadAd(adRequest6);


        /////////////////////

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


        vvmath2bf=findViewById(R.id.vvmath2bf);
        vvmath2bf.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.math1bf);
        vvmath2bf.start();

        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        syllabus = findViewById(R.id.syllabusams);
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_1551b8f5d93942cb8c2dd4e74d2598f6.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        pdap = findViewById(R.id.pdap);
        pdap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_913d5a140b474233a809f8b336e3c98b.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        pday = findViewById(R.id.pday);
        pday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLQvzPLYdJBGdDHZRoEYBj4eb_S4u5-IhR"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        miy = findViewById(R.id.miy);
        miy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLVCBPCYGv7bDWb3v_WfVgRKsBe5NVHVJY"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        mip = findViewById(R.id.mip);
        mip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_5cfe937b174c4d0e88b9bc4e7c5a001b.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        ltp1 = findViewById(R.id.ltp1);
        ltp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_b1592bccd507487e81401e0ee3de7420.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ltp2 = findViewById(R.id.ltp2);
        ltp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_b1592bccd507487e81401e0ee3de7420.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ltp3 = findViewById(R.id.ltp3);
        ltp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_f4539167cd7e4e2f8b3fb80047d907ee.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        lty = findViewById(R.id.lty);
        lty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLQvzPLYdJBGdlsnQMms5MgzSyCLMOh8zT"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



        fsfp1 = findViewById(R.id.fsfp1);
        fsfp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_527ebbe3d5ee4f538862bb281e60b6bc.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        fsfp2 = findViewById(R.id.fsfp2);
        fsfp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_6c76ac83d7194bd38531ca4e0b047e37.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        fsfy = findViewById(R.id.fsfy);
        fsfy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLQvzPLYdJBGdRfoinCyJjA5TYFRfDW61p"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


    }
}