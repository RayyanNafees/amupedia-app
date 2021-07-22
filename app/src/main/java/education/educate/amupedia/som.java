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

public class som extends AppCompatActivity {
    FloatingActionButton drawyerff;
    ImageView som_1 ,som_1y1 , som_1y2 , som_4_4, som_2 , som_2y , som_3_1 , som_3_2 , som_3_3 , som_3y , som_4_1 , som_4_2 , som_4_3 , som_4y1 , som_4y2 ,som_4y3 , syllabussom;
    VideoView vvsomv;
    private AdView somad , somad2 , somad3 , somad4 , somad5 , somad6;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvsomv.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        somad = findViewById(R.id.som_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        somad.loadAd(adRequest);

        somad2 = findViewById(R.id.som2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        somad2.loadAd(adRequest2);

        somad3 = findViewById(R.id.som3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        somad3.loadAd(adRequest3);

        somad4 = findViewById(R.id.som4_banner);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        somad4.loadAd(adRequest4);

        somad5 = findViewById(R.id.som5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        somad5.loadAd(adRequest5);

        somad6 = findViewById(R.id.som6_banner);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        somad6.loadAd(adRequest6);

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



        vvsomv=findViewById(R.id.vvsomv);
        vvsomv.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.somv);
        vvsomv.start();

        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        som_1 = findViewById(R.id.som_1);
        som_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1KHZ3RWoyfAehmv_1QvvG2yHEzM5H7h0E/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_1y1 = findViewById(R.id.som_1y1);
        som_1y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=-cvCyyyOVDE"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        som_1y2 = findViewById(R.id.som_1y2);
        som_1y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Dv5Vb8GoVFk"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_2 = findViewById(R.id.som_2);
        som_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1ty7FkVNrE1nTjSqLW-lxcJZhoeLLGTgI/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        som_2y = findViewById(R.id.som_2y);
        som_2y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=qxaCqUmIN04"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_3_1 = findViewById(R.id.som_3_1);
        som_3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1KuwZbxYeKx5R_k9Dou1O050PuzStf-ta/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_3_2 = findViewById(R.id.som_3_2);
        som_3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1rTckr9m91_6fpeK67HDbE2BxSQA8tRRG/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_3_3 = findViewById(R.id.som_3_3);
        som_3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/15wPGzuPogg7jvlbj37Yvv68yXMvu6Eot/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_3y = findViewById(R.id. som_3y);
        som_3y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=5gE9TwSA7Wg"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_4_1 = findViewById(R.id. som_4_1);
        som_4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1AqnQbEX7IgpdkA34sRctLxWhT5ypSmEd/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_4_2 = findViewById(R.id. som_4_2);
        som_4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1yzQ4nUlK8eRUE9kQXI9Fz07jqGVMin2P/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_4_3 = findViewById(R.id. som_4_3);
        som_4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1xdxloTOmL0WGcxDiC8VwKIJdcIujXctZ/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        som_4_4 = findViewById(R.id. som_4_4);
        som_4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1YQKJWbqoGqB42adZOChR5W1EqmeCAMR_/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_4y1 = findViewById(R.id. som_4y1);
        som_4y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=EXNZ6_dVhPw"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_4y2 = findViewById(R.id. som_4y2);
        som_4y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=PxQV_ZcXblE"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        som_4y3 = findViewById(R.id. som_4y3);
        som_4y3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=LAb_ezELQ_Y"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        syllabussom = findViewById(R.id. syllabussom);
        syllabussom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_b1e3004baec34a1599684bdaf6efd5bc.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}