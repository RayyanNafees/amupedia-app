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

public class Apmfbtf extends AppCompatActivity {
    FloatingActionButton drawyerff;
    ImageView mat1, mat2 ,mat3 ,mat4 , mat5 ,mat6 , mat7 , maty1 , c1 ,c2 ,c3 ,c4 ,c5 ,c6,
    cy1 , cy2 , cy3 , cy4 , cy5 , cy6 , cy7 , cy8 , cy9 , cy10 , cy11 , cy12 , cy13 , cy14 , cy15 , cy16,
    iap1 ,iap2 ,iap3 ,iap4 ,iap5 ,iay1 ,iay2 ,iay3 ,iay4 ,iay5 ,iay6 , iay7,
    ordp1 ,ordp2 ,ordp3 ,ordp4 ,ordp5 ,ordp6 ,ordp7 ,ordp8,
    ordy1 , ordy2 ,ordy3 ,ordy4 ,ordy5 ,ordy6, syllabusamf,
    sm1 , sm2;
    VideoView vvmath1bf;
    private AdView apmfbtfadview, apmfbtf2adview , apmfbtf3adview , apmfbtf4adview , apmfbtf5adview , apmfbtf6adview , apmfbtf7adview;


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvmath1bf.start();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apmfbtf);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

/////////////

        apmfbtfadview = findViewById(R.id.apmfbtf_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        apmfbtfadview.loadAd(adRequest);


        apmfbtf2adview = findViewById(R.id.apmfbtf2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        apmfbtf2adview.loadAd(adRequest2);

        apmfbtf3adview = findViewById(R.id.apmfbtf3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        apmfbtf3adview.loadAd(adRequest3);

        apmfbtf4adview = findViewById(R.id.apmfbtf4_banner);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        apmfbtf4adview.loadAd(adRequest4);

        apmfbtf5adview = findViewById(R.id.apmfbtf5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        apmfbtf5adview.loadAd(adRequest5);

        apmfbtf6adview = findViewById(R.id.apmfbtf6_banner);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        apmfbtf6adview.loadAd(adRequest6);

        apmfbtf7adview = findViewById(R.id.apmfbtf7_banner);
        AdRequest adRequest7 = new AdRequest.Builder().build();
        apmfbtf7adview.loadAd(adRequest7);



/////////////

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


        vvmath1bf=findViewById(R.id.vvmath1bf);
        vvmath1bf.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.math1bf);
        vvmath1bf.start();


        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        mat1 = findViewById(R.id.matrices1);
        mat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/13eLpsguDbUkksgOQsfiU-horiUwR_ABj/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //

        mat2 = findViewById(R.id.matrices2);
        mat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/18lVA1KJT9bFKO3rQOezf5vpHOECxgmE8/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //

        mat3 = findViewById(R.id.matrices3);
        mat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/14O3haLuwyeLygBmCTfPx4a6z29EeBY4x/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //

        mat4 = findViewById(R.id.matrices4);
        mat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1hGtu-ZbQu_aBM2WtOO0ts8Adc9uCQi67/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
         //
        mat5 = findViewById(R.id.matrices5);
        mat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1ag6rhPbcoDVHTi1VPtDNZIPc5Pl1tAAF/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //

        mat6 = findViewById(R.id.matrices6);
        mat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1ZiWNgNdIor3Si5wSVpexDq5PCj-fzFOU/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //

        mat7 = findViewById(R.id.matrices7);
        mat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1ZI1UpXiCsFKP5YbjUdPaJB7T0kEXhodj/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //**********************************

        maty1 = findViewById(R.id.matricesyoutubevideo1);
        maty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=pfN1_rrEEuw&list=PLhSp9OSVmeyIVQpCt2kwsC1dNVl1GwlVn"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        /********************************************************************************* UNIT 2 *******/

        c1 = findViewById(R.id.curve1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1vbmtRBwEC6YY_d3htllMpH9i2Fyk_6Po/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //

        c2 = findViewById(R.id.curve2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1goL5uQ0czyGRz89rpHwG55kylJ3lryWn/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        c3 = findViewById(R.id.curve3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1J0F_Yh0S0PGy29qLCO6qyT4ub6eEAUhm/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        c4 = findViewById(R.id.curve4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1J0F_Yh0S0PGy29qLCO6qyT4ub6eEAUhm/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        c5 = findViewById(R.id.curve5);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1jMytKo8cxeCFYRSb9Ej4BcZy5-qdS-gA/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        c6 = findViewById(R.id.curve6);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1jMytKo8cxeCFYRSb9Ej4BcZy5-qdS-gA/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //*********************
        cy1 = findViewById(R.id.curveyoutubevideo1);
        cy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=KijGLjxKlsY&list=PLU6SqdYcYsfLLAU6Hxi0C_TnrZeqgbJMJ&index=2"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy2 = findViewById(R.id.curveyoutubevideo2);
        cy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=JinafWKRSLU&list=PLU6SqdYcYsfLLAU6Hxi0C_TnrZeqgbJMJ&index=3"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy3 = findViewById(R.id.curveyoutubevideo3);
        cy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=EGnI8WyYb3o&list=PLU6SqdYcYsfLLAU6Hxi0C_TnrZeqgbJMJ&index=4"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy4 = findViewById(R.id.curveyoutubevideo4);
        cy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Ac1mr2WrO-g&list=PLU6SqdYcYsfLLAU6Hxi0C_TnrZeqgbJMJ&index=7"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy5 = findViewById(R.id.curveyoutubevideo5);
        cy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=LEspaisjDFE&list=PLU6SqdYcYsfLLAU6Hxi0C_TnrZeqgbJMJ&index=9"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy6 = findViewById(R.id.curveyoutubevideo6);
        cy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=WX6O9TiFYsA&list=PLU6SqdYcYsfLLw-QCXT9KAA0mPq-PMfd5&index=2"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy7 = findViewById(R.id.curveyoutubevideo7);
        cy7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=mco9p6EzR50&list=PLU6SqdYcYsfLLw-QCXT9KAA0mPq-PMfd5&index=3"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy8 = findViewById(R.id.curveyoutubevideo8);
        cy8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=CBrIHByAlrw&list=PLU6SqdYcYsfLLw-QCXT9KAA0mPq-PMfd5&index=4"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy9 = findViewById(R.id.curveyoutubevideo9);
        cy9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=m8lmI6LQyWs&list=PLU6SqdYcYsfLLw-QCXT9KAA0mPq-PMfd5&index=5"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy10 = findViewById(R.id.curveyoutubevideo10);
        cy10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=CioY8ElsjO4&list=PLU6SqdYcYsfLa93f2pwdASYgPWQMBFBv-&index=2"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy11 = findViewById(R.id.curveyoutubevideo11);
        cy11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=yhGOx0qhGF0&list=PLU6SqdYcYsfLa93f2pwdASYgPWQMBFBv-&index=3"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy12 = findViewById(R.id.curveyoutubevideo12);
        cy12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=zLQE8tO5G90&list=PLU6SqdYcYsfLa93f2pwdASYgPWQMBFBv-&index=4"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy13 = findViewById(R.id.curveyoutubevideo13);
        cy13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=vfg1mmsSMMM&list=PLU6SqdYcYsfJqbZvQECrwnlQrp4fg6isX"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy14 = findViewById(R.id.curveyoutubevideo14);
        cy14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=9sLsX9DV5Fs&list=PLU6SqdYcYsfJqbZvQECrwnlQrp4fg6isX&index=5"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy15 = findViewById(R.id.curveyoutubevideo15);
        cy15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=tF4vDQ6X7Kg&list=PLU6SqdYcYsfJqbZvQECrwnlQrp4fg6isX&index=7"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        cy16 = findViewById(R.id.curveyoutubevideo16);
        cy16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=S-qzRWJOlf8&list=PLU6SqdYcYsfJqbZvQECrwnlQrp4fg6isX&index=3"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



        iap1 = findViewById(R.id.ia1);
        iap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1JhMSUpFw2x7xoYRjt22DUPffh7BhAS6W/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        iap2 = findViewById(R.id.ia2);
        iap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/17vcBE3EyTYTnAGB0wmTZqC7MLsmufBPU/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        iap3 = findViewById(R.id.ia3);
        iap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1Zbi0X4ED_hmTaeDTsOSg0oyQnUrGfxcn/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        iap4 = findViewById(R.id.ia4);
        iap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1_5l8dGYNCnbxn4Z2ybI7UeuhEGYsILA0/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        iay1 = findViewById(R.id.iayoutubevideo1);
        iay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=n4JJ3fNKHUc&list=PLU6SqdYcYsfL7EIZrqNVMyQ5xMbCu18Mf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        iay2 = findViewById(R.id.iayoutubevideo2);
        iay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=qwJYHoalErk&list=PLU6SqdYcYsfL7EIZrqNVMyQ5xMbCu18Mf&index=3"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        iay3 = findViewById(R.id.iayoutubevideo3);
        iay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=LDPGDtxezWs&list=PLU6SqdYcYsfL7EIZrqNVMyQ5xMbCu18Mf&index=4"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        iay4 = findViewById(R.id.iayoutubevideo4);
        iay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=jCmexnTwxmM"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        iay5 = findViewById(R.id.iayoutubevideo5);
        iay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=jCmexnTwxmM"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        iay6 = findViewById(R.id.iayoutubevideo6);
        iay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=x4U4n4DaxZ8&list=PLU6SqdYcYsfK8JhTfv-A1LreCcbMQ0BXF&index=3"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        iay7 = findViewById(R.id.iayoutubevideo7);
        iay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=SduCO-r_TOA"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

/************************************ UNIT 3 */

        ordp1 = findViewById(R.id.ordp1);
        ordp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1vLxIZYRdnLHr2HJ_c1rFSyCvc4-nxPSI/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ordp2 = findViewById(R.id.ordp2);
        ordp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1NJBygOuWX6av6Uug7VeAzD_R0sol4Iyi/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ordp3 = findViewById(R.id.ordp3);
        ordp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/17BWLXEavj_xjI8g0a40Te5tG_U0nV2se/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ordp4 = findViewById(R.id.ordp4);
        ordp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/18ZbZIaC-gOZTvzrJDNkWBnwSmK5Vhfnb/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ordp5 = findViewById(R.id.ordp5);
        ordp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1BVkbFJrZz7JJyZd15XJiYQ06uePPvwqu/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ordp6 = findViewById(R.id.ordp6);
        ordp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1Y6GymCDdcaElQe18ZVCURkuUhqIEY1bR/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ordp7 = findViewById(R.id.ordp7);
        ordp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1YaTo1KbxGEpQ8WVoUzuQgFJU3evMZxuH/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ordp8 = findViewById(R.id.ordp8);
        ordp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/12hYmsrMGzDLoVMlB7m2RlZxqgEOKWr0X/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



        ordy1 = findViewById(R.id.ordyoutubevideo1);
        ordy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=vQcThbJJjOI&list=PLU6SqdYcYsfJmqo86d12EoNNWKtAZqu8q&index=49"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ordy2 = findViewById(R.id.ordyoutubevideo2);
        ordy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Qscs_AZTf7c&list=PLU6SqdYcYsfJmqo86d12EoNNWKtAZqu8q&index=3"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        ordy3 = findViewById(R.id.ordyoutubevideo3);
        ordy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=tHqx1qxA8q4&list=PLU6SqdYcYsfJmqo86d12EoNNWKtAZqu8q&index=5"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ordy4 = findViewById(R.id.ordyoutubevideo4);
        ordy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=1HKn9IvYiEM&list=PLU6SqdYcYsfJmqo86d12EoNNWKtAZqu8q&index=7"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ordy5 = findViewById(R.id.ordyoutubevideo5);
        ordy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Qscs_AZTf7c&list=PLU6SqdYcYsfJmqo86d12EoNNWKtAZqu8q&index=3"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ordy6 = findViewById(R.id.ordyoutubevideo6);
        ordy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Y8CF01gbd_U"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


    /******************************************* Short notes */

        sm1 = findViewById(R.id.sm1);
        sm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1m6_1lzeY1eWVjgAzULTQEMK3vrIZIeXY/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        sm2 = findViewById(R.id.sm2);
        sm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/11pDOfTy1lemlEoYGIsa5Dsqk6OJXefuj/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        sm1 = findViewById(R.id.sm1);
        sm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1m6_1lzeY1eWVjgAzULTQEMK3vrIZIeXY/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        syllabusamf = findViewById(R.id.syllabusamf);
        syllabusamf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1jMytKo8cxeCFYRSb9Ej4BcZy5-qdS-gA/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}