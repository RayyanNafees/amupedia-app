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

public class Elecengineering extends AppCompatActivity {
    FloatingActionButton drawyerff;
    ImageView electricalengsyllabus , electricalengvideos , electricaleng_11 , electricaleng_21 ,electricaleng_22 , electricaleng_23 , electricaleng_31 , electricaleng_32 ,
            electricaleng_33 , electricaleng_34 , electricaleng_as1 , electricaleng_as2;
    VideoView vvelec;
    private AdView elecad , elec2ad , elec3ad , elec4ad , elec5ad , elec6ad , elec7ad;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvelec.start();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecengineering);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        elecad = findViewById(R.id.elec_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        elecad.loadAd(adRequest);
        elec2ad = findViewById(R.id.elec2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        elec2ad.loadAd(adRequest2);

        elec3ad = findViewById(R.id.elec3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        elec3ad.loadAd(adRequest3);

        elec4ad = findViewById(R.id.elec4_banner);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        elec4ad.loadAd(adRequest4);

        elec5ad = findViewById(R.id.elec5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        elec5ad.loadAd(adRequest5);

        elec6ad = findViewById(R.id.elec6_banner);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        elec6ad.loadAd(adRequest6);

        elec7ad = findViewById(R.id.elec7_banner);
        AdRequest adRequest7 = new AdRequest.Builder().build();
        elec7ad.loadAd(adRequest7);



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


        vvelec=findViewById(R.id.vvelec);
        vvelec.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.elec);
        vvelec.start();


        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        electricalengsyllabus = findViewById(R.id.electricalengsyllabus);
        electricalengsyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1cZzgJtNYWPH1Vmw8KJ2iN-k5hY4nmL2n/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        electricalengvideos = findViewById(R.id.electricalengvideos);
        electricalengvideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Vd2UJiIPbag&list=PL9RcWoqXmzaLTYUdnzKhF4bYug3GjGcEc"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        electricaleng_11  = findViewById(R.id.electricaleng_11 );
        electricaleng_11 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1IQoMJnfucIDOMGNlq8AF10ltgrLUSMgj/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        electricaleng_21  = findViewById(R.id.electricaleng_21 );
        electricaleng_21 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1oypMde_kDrSglXxcfPlt3Fuvavd7g1Y8/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        electricaleng_22  = findViewById(R.id.electricaleng_22 );
        electricaleng_22 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1gexZRxfDna4zRN85vVKcQi7iyeUyugYE/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        electricaleng_23  = findViewById(R.id.electricaleng_23 );
        electricaleng_23 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1R-is9kXcOCxpo1qHCjMuv68SsR9YtNLZ/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        electricaleng_31  = findViewById(R.id.electricaleng_31 );
        electricaleng_31 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1gexZRxfDna4zRN85vVKcQi7iyeUyugYE/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        electricaleng_32  = findViewById(R.id.electricaleng_32 );
        electricaleng_32 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/17hkomnLb1FvjTIaKH795Yq0GmQGpb92B/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        electricaleng_33  = findViewById(R.id.electricaleng_33 );
        electricaleng_33 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1_OPcN-T6cXpj7xU3LQbmPfohBVlboNny/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        electricaleng_34  = findViewById(R.id.electricaleng_34 );
        electricaleng_33 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1CiFJ4bVFPXrbtCzWgD65B_xmQI4QB8Ul/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        electricaleng_as2  = findViewById(R.id.electricaleng_as2 );
        electricaleng_as2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1CiFJ4bVFPXrbtCzWgD65B_xmQI4QB8Ul/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        electricaleng_as1  = findViewById(R.id.electricaleng_as1);
        electricaleng_as1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1HMvNLOa1Uri5tB9XrSTDzsmrCaRveWAL/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



    }
}