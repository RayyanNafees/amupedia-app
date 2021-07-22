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

public class appliedphysicslabf extends AppCompatActivity {
    FloatingActionButton drawyerff;
    ImageView syllabusphysicslab , physicslab_1 , physicslab_12 , physicslab_2 , physicslab_22 , physicslab_3 , physicslab_32 , physicslab_4 , physicslab_42,
    physicslab_5a , physicslab_52a ,physicslab_5b , physicslab_52b , physicslab_6 ,physicslab_62 , physicslab_7 , physicslab_72 , physicslab_8 , physicslab_82 , physicslab_9 , physicslab_92;
    AdView physicsladview, physicsl2adview , physicsl3adview , physics99ad , physicsl5adview , physicsl6adview , physicsl7adview , physicsl8adview,
            physicsl9adview , physicsl10adview , physicsl11adview , physicsl12adview;
    VideoView vvphysicsl;


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvphysicsl.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliedphysicslabf);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        physicsladview = findViewById(R.id.physicsl_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        physicsladview.loadAd(adRequest);

        physicsl2adview = findViewById(R.id.physicsl2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        physicsl2adview.loadAd(adRequest2);

        physicsl3adview = findViewById(R.id.physicsl3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        physicsl3adview.loadAd(adRequest3);

        physicsl5adview = findViewById(R.id.physicsl5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        physicsl5adview.loadAd(adRequest5);

        physicsl6adview = findViewById(R.id.physicsl6_banner);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        physicsl6adview.loadAd(adRequest6);

        physicsl7adview = findViewById(R.id.physicsl7_banner);
        AdRequest adRequest7 = new AdRequest.Builder().build();
        physicsl7adview.loadAd(adRequest7);

        physicsl8adview = findViewById(R.id.physicsl8_banner);
        AdRequest adRequest8 = new AdRequest.Builder().build();
        physicsl8adview.loadAd(adRequest8);

        physicsl9adview = findViewById(R.id.physicsl9_banner);
        AdRequest adRequest9 = new AdRequest.Builder().build();
        physicsl9adview.loadAd(adRequest9);

        physicsl10adview = findViewById(R.id.physicsl10_banner);
        AdRequest adRequest10 = new AdRequest.Builder().build();
        physicsl10adview.loadAd(adRequest10);

        physicsl11adview = findViewById(R.id.physicsl11_banner);
        AdRequest adRequest11 = new AdRequest.Builder().build();
        physicsl11adview.loadAd(adRequest11);

        physicsl12adview = findViewById(R.id.physicsl12_banner);
        AdRequest adRequest12 = new AdRequest.Builder().build();
        physicsl12adview.loadAd(adRequest12);

        physics99ad = findViewById(R.id.physicsl99_banner);
        AdRequest adRequest13 = new AdRequest.Builder().build();
        physics99ad.loadAd(adRequest13);




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




        vvphysicsl=findViewById(R.id.vvphysicsl);
        vvphysicsl.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.physicsl);
        vvphysicsl.start();

        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        syllabusphysicslab = findViewById(R.id.syllabusphysicslab);
        syllabusphysicslab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_135cd6deb9854843bc81f993aeb992e0.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        physicslab_1 = findViewById(R.id.physicslab_1);
        physicslab_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_77427e7b3f4b48878f6a287c3a6a5b28.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        physicslab_12 = findViewById(R.id.physicslab_12);
        physicslab_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=9mRZDexwJUM"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        physicslab_2 = findViewById(R.id.physicslab_2);
        physicslab_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_d139db9d206c4d5e83090aded87a00d4.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        physicslab_22 = findViewById(R.id.physicslab_22);
        physicslab_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=shMUQK_9ORg"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        physicslab_3 = findViewById(R.id.physicslab_3);
        physicslab_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_c31ffcf63f6f4488a5a0872a3019d12a.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        physicslab_32 = findViewById(R.id.physicslab_32);
        physicslab_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=TdhpBSwA95g"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        physicslab_4 = findViewById(R.id.physicslab_4);
        physicslab_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_2833cb5053af4387ac1f532b63a1e0bc.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        physicslab_42 = findViewById(R.id.physicslab_42);
        physicslab_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=i8yi-ADuNYk"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        physicslab_5a = findViewById(R.id.physicslab_5a);
        physicslab_5a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_0a67403fc31e4f8d997b1b8282ad4918.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        physicslab_52a = findViewById(R.id.physicslab_52a);
        physicslab_52a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=OD7DiQ0SuJI"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        physicslab_5b = findViewById(R.id.physicslab_5b);
        physicslab_5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_351d37d517ee4b4e97bf2d1c720d7c24.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        physicslab_52b = findViewById(R.id.physicslab_52b);
        physicslab_52b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=MIBKLJicj0w"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        physicslab_6 = findViewById(R.id.physicslab_6);
        physicslab_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_a9b93a8621584157b63dbf71f0527a92.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        physicslab_62 = findViewById(R.id.physicslab_62);
        physicslab_62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=GZt9xd4uSms"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        physicslab_7 = findViewById(R.id.physicslab_7);
        physicslab_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_964ee3cd996640629f9a294935fae985.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        physicslab_72 = findViewById(R.id.physicslab_72);
        physicslab_72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=iqmjjLHTTQg"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        physicslab_8 = findViewById(R.id.physicslab_8);
        physicslab_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_e7de9a6983f74d11a28f92dc0fab6042.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        physicslab_82 = findViewById(R.id.physicslab_82);
        physicslab_82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=GMlNKjF_zf0"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        physicslab_9 = findViewById(R.id.physicslab_9);
        physicslab_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_88cfc820683844f49c1ab96f6e4d88ce.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        physicslab_92 = findViewById(R.id.physicslab_92);
        physicslab_92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=YJI2d-vTcfM"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


////////////////////////////////////




    }
}