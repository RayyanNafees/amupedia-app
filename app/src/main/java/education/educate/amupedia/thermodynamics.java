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

public class thermodynamics extends AppCompatActivity {
    FloatingActionButton drawyerff;
    ImageView thermodyanamicssyllabus, thermodynamics_11, thermodynamics_12, thermodynamics_13, thermodynamics_14, thermodynamics_21, thermodynamics_22, thermodynamics_23, thermodynamics_24,
            thermodynamics_25, thermodynamics_31, thermodynamics_32, thermodynamics_33, thermodynamics_34, thermodynamics_4, thermodynamics_video;
    VideoView vvthermo;
    private AdView thermoad, thermoad2, thermoad3, thermoad4, thermoad5, thermoad6, thermoad7;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if (hasFocus) {
            vvthermo.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermodynamics);

        thermoad = findViewById(R.id.thermo_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        thermoad.loadAd(adRequest);

        thermoad2 = findViewById(R.id.thermo2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        thermoad2.loadAd(adRequest2);

        thermoad3 = findViewById(R.id.thermo3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        thermoad3.loadAd(adRequest3);

        thermoad4 = findViewById(R.id.thermo4_banner);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        thermoad4.loadAd(adRequest4);

        thermoad5 = findViewById(R.id.thermo5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        thermoad5.loadAd(adRequest5);

        thermoad6 = findViewById(R.id.thermo6_banner);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        thermoad6.loadAd(adRequest6);

        thermoad7 = findViewById(R.id.thermo7_banner);
        AdRequest adRequest7 = new AdRequest.Builder().build();
        thermoad7.loadAd(adRequest7);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo.isAvailable() || networkInfo.isFailover()) {

            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.alert_dialogue);
            dialog.setCancelable(false);
            dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
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


        vvthermo = findViewById(R.id.vvthermo);
        vvthermo.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.thermo);
        vvthermo.start();

        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in, R.anim.nothing);
            }
        });

        thermodyanamicssyllabus = findViewById(R.id.thermodyanamicssyllabus);
        thermodyanamicssyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_ef0010f21601459398f71a5a9e30d7ee.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_video = findViewById(R.id.thermodynamics_video);
        thermodynamics_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PL9RcWoqXmzaK6AHCCyL_J6gqc02RN-w-D"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_11 = findViewById(R.id.thermodynamics_11);
        thermodynamics_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_60ea55d3e3da4f24a65f0513db6d0be9.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_12 = findViewById(R.id.thermodynamics_12);
        thermodynamics_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_625940c5579a45db8b76d20e8b2a1a09.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_13 = findViewById(R.id.thermodynamics_13);
        thermodynamics_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_3be56cb6d5cb4e64bcafb3376bcc6f40.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_14 = findViewById(R.id.thermodynamics_14);
        thermodynamics_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_23813a5e14344b60a01424c6ede1ae41.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_21 = findViewById(R.id.thermodynamics_21);
        thermodynamics_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_5e144883b46d41dabae4b30cd53c8d68.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_22 = findViewById(R.id.thermodynamics_22);
        thermodynamics_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_92ec02e6a4b045cb9d1f6d10c4257652.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_23 = findViewById(R.id.thermodynamics_23);
        thermodynamics_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_6753b6da0dae4ca48407e96236a4efdb.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_24 = findViewById(R.id.thermodynamics_24);
        thermodynamics_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_4d2801b0b9d9410db8c9160f2f6748c4.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_25 = findViewById(R.id.thermodynamics_25);
        thermodynamics_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_cbb1660c46e64c2bb0561b025bb01783.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_31 = findViewById(R.id.thermodynamics_31);
        thermodynamics_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_8f131fda4bd64869af38ea33311cf006.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_32 = findViewById(R.id.thermodynamics_32);
        thermodynamics_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_3d7e78cf5b8e4984b363b96595bf9026.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_33 = findViewById(R.id.thermodynamics_33);
        thermodynamics_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_ce431275298f4269bf5c8194b34665e1.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_34 = findViewById(R.id.thermodynamics_34);
        thermodynamics_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_0d8eeff7c22d43d795cd7a8869513f78.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        thermodynamics_4 = findViewById(R.id.thermodynamics_41);
        thermodynamics_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/3d609f_8a7949ed702c484b861d5e6cb9fff1bc.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


    }
}