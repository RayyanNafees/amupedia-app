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

public class appliedchemistrylab extends AppCompatActivity {
    FloatingActionButton drawyerff;
    ImageView syllabusapclf ,versp , versy, ionp, iony , sapp , sapy, coalp , coaly, elecp , elecy, cloudy ,cloudp;
    VideoView vvclab;
    private AdView chemladview , cheml2adview , cheml3adview , cheml4adview , cheml5adview , cheml6adview , cheml7adview , cheml8adview ;



    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvclab.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliedchemistrylab);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


//////////////////////////////////


        chemladview = findViewById(R.id.chemistryl_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        chemladview.loadAd(adRequest);

        cheml2adview = findViewById(R.id.chemistryl2_banner);
        AdRequest adRequest2= new AdRequest.Builder().build();
        cheml2adview.loadAd(adRequest2);

        cheml3adview = findViewById(R.id.chemistryl3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        cheml3adview.loadAd(adRequest3);

        cheml4adview = findViewById(R.id.chemistryl4_banner);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        cheml4adview.loadAd(adRequest4);

        cheml5adview = findViewById(R.id.chemistryl5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        cheml5adview.loadAd(adRequest5);

        cheml6adview = findViewById(R.id.chemistryl6_banner);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        cheml6adview.loadAd(adRequest6);

        cheml7adview = findViewById(R.id.chemistryl7_banner);
        AdRequest adRequest7 = new AdRequest.Builder().build();
        cheml7adview.loadAd(adRequest7);

        cheml8adview = findViewById(R.id.chemistryl8_banner);
        AdRequest adRequest8 = new AdRequest.Builder().build();
        cheml8adview.loadAd(adRequest8);

/////////////////////////////////

        vvclab=findViewById(R.id.vvclab);
        vvclab.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.chemlab);
        vvclab.start();

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

        syllabusapclf=findViewById(R.id.syllabusapclf);
        syllabusapclf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_4c12a8ccf1fb4981ba86bfd40f4803f9.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        versp=findViewById(R.id.versp);
        versp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1_uTaUAaeCE8J0T5N3Z_au9AwQ7LBBNvu/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        versy=findViewById(R.id.versy);
        versy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Sm4RubV1gCw"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        ionp=findViewById(R.id.ionp);
        ionp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1fvK-Ctj3ju5kT-J4bCePxi7yWSPl2m_-/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        iony=findViewById(R.id.iony);
        iony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=BmpknJNDXfE&feature=emb_title"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        sapp=findViewById(R.id.sapp);
        sapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1NhW43Q36vepM_PQaLfRbuJyCZ28RPO37/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        sapy=findViewById(R.id.sapy);
        sapy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=iPXyYG8_NZ8"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



        coalp=findViewById(R.id.coalp);
        coalp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1jElqxPpR1bR42vil-hE7ng-14CGfL_nW/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        coaly=findViewById(R.id.coaly);
        coaly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=yZyfcq8aUnQ&feature=emb_title"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        elecp=findViewById(R.id.elecp);
        elecp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1ynNkjLv9Kerpowjt_SIXO_FUQnLWngOs/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        elecy=findViewById(R.id.elecy);
        elecy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Fb__KLI7D0s&feature=emb_title"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        cloudp=findViewById(R.id.cloudp);
        cloudp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1EMXXCN-6G6wiT98srbAJ1wpz4PeGUl1d/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        cloudy=findViewById(R.id.cloudy);
        cloudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=j6WAac2cpbE&feature=emb_title"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}