package education.educate.amupedia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
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

public class mechanics extends AppCompatActivity {
    FloatingActionButton drawyerff;
    ImageView unit_11 , unit_12 , unit_13 , unit_14 , unit_21 , unit_22 , unit_23 , unit_24 , unit_31 , unit_32 , unit_41 , unit_42 , syllabusmc;
    VideoView vvmechanics;
    private AdView mc1 , mc2 , mc3 , mc4 , mc5 , mc6;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvmechanics.start();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanics);

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



        mc6= findViewById(R.id.mc6_banner);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        mc6.loadAd(adRequest6);

        mc1= findViewById(R.id.mc_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        mc1.loadAd(adRequest);

        mc2= findViewById(R.id.mc2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mc2.loadAd(adRequest2);

        mc3= findViewById(R.id.mc3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        mc3.loadAd(adRequest3);

        mc4= findViewById(R.id.mc4_banner);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        mc4.loadAd(adRequest4);

        mc5= findViewById(R.id.mc5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        mc5.loadAd(adRequest5);



        vvmechanics=findViewById(R.id.vvmechanics);
        vvmechanics.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.mclatest);
        vvmechanics.start();

        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        syllabusmc = findViewById(R.id.syllabusmc);
        syllabusmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/408c58_17efcada2adf4717907ac39417cbf968.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        unit_11 = findViewById(R.id.unit_11);
        unit_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1eEDKVl1nF0tMYkeK4QFPkBMngnPvqnH3/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        unit_12 = findViewById(R.id.unit_12);
        unit_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1S5BYtvu_5e4zFGqs5RYFnaLXhxbKNqp3/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        unit_13 = findViewById(R.id.unit_13);
        unit_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1cSWNbp7aoZfRQK558ia9yWLCf7-UCmO3/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        unit_14 = findViewById(R.id.unit_14);
        unit_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1Om0YasFnl6uAK_o7jTcf65HojH2BOddO/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        unit_21 = findViewById(R.id.unit_21);
        unit_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1q4tj4FtVun9BaM3GKJQFnxWBX8srGDwv/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        unit_22 = findViewById(R.id.unit_22);
        unit_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1iTrfgoqBsCsY6yZySd7NE8AyKs-AmN8w/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        unit_23 = findViewById(R.id.unit_23);
        unit_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1x_d6OvjlUIewTEofzbG17HSCjv6Ou4rJ/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        unit_24 = findViewById(R.id.unit_24);
        unit_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1MzAY9EAAzKoHu3Rb8lN_8O-PLcBfppKk/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        unit_31 = findViewById(R.id.unit_31);
        unit_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/13N1YdlOZk4Ubk9H4Jde9dcGl6eMRCuaF/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        unit_32 = findViewById(R.id.unit_32);
        unit_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1mjwu9DlmMY_0OnqWPawv1KYG9bX2YtH-/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        unit_41 = findViewById(R.id.unit_41);
        unit_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1Jx0Q-Qt47jzVQLxr2IAtliVQMoX4dW1-/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        unit_42 = findViewById(R.id.unit_42);
        unit_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/18swiB3QEg0zizPG6TM9RqLxdyr_38ZNL/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
