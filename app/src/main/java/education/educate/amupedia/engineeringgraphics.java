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

public class engineeringgraphics extends AppCompatActivity {

    ImageView engineeringraphics , engineeringraphicsy1 , engineeringraphicsy2 , engineeringraphicsy3 , engineeringraphicsy4 , engineeringraphicsy5, engineeringraphicsy6, engineeringraphicsy7,
     engineeringraphicsp1 , engineeringraphicsp2 , engineeringraphicsp3 , engineeringraphicsp4 , engineeringraphicsp5 , engineeringraphicsp6 , engineeringraphicsp7, sheet1
            , sheet2, sheet3, sheet4, sheet5, sheet6, sheet7;
    FloatingActionButton drawyerff;
    private AdView edad ,ed2ad , ed3ad , ed4ad , ed5ad;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vved.start();
        }
    }

    VideoView vved;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineeringgraphics);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        edad = findViewById(R.id.ed_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        edad.loadAd(adRequest);

        ed2ad = findViewById(R.id.ed2_banner);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        ed2ad.loadAd(adRequest2);

        ed3ad = findViewById(R.id.ed3_banner);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        ed3ad.loadAd(adRequest3);

        ed4ad = findViewById(R.id.ed4_banner);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        ed4ad.loadAd(adRequest4);

        ed5ad = findViewById(R.id.ed5_banner);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        ed5ad.loadAd(adRequest5);



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


        vved=findViewById(R.id.vved);
        vved.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.ed);
        vved.start();

        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        engineeringraphics = findViewById(R.id.engineeringraphicssyllabus);
        engineeringraphics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_4e7b7b3188e342fb8419c7fb52a6dbc0.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        engineeringraphics = findViewById(R.id.engineeringraphicssyllabus);
        engineeringraphics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://27c5e116-11a7-4dd8-87e8-9b8b77ba7ba5.filesusr.com/ugd/42f86e_4e7b7b3188e342fb8419c7fb52a6dbc0.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        engineeringraphicsy1 = findViewById(R.id.engineeringraphicsy1);
        engineeringraphicsy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=6RMU2cpY0NI"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        engineeringraphicsy2 = findViewById(R.id.engineeringraphicsy2);
        engineeringraphicsy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLIhUrsYr8yHwTgo_zu_ELqOC1ypcp5Gr9"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        engineeringraphicsy3 = findViewById(R.id.engineeringraphicsy3);
        engineeringraphicsy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=r0ZSJfDL-Fo"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        engineeringraphicsy4 = findViewById(R.id.engineeringraphicsy4);
        engineeringraphicsy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLDN15nk5uLiBVR22X01vcnvVCuQIklXGx"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        engineeringraphicsy5 = findViewById(R.id.engineeringraphicsy5);
        engineeringraphicsy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=tFgcmupXh9M"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
engineeringraphicsy6 = findViewById(R.id.engineeringraphicsy6);
        engineeringraphicsy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLDN15nk5uLiCxbMOdIIVDZ4i1IslzrT1W"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        engineeringraphicsy7 = findViewById(R.id.engineeringraphicsy7);
        engineeringraphicsy7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLIhUrsYr8yHwdB96ft6c0Uwc4SDCLuG1v"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        engineeringraphicsp1 = findViewById(R.id.engineeringraphicsp1);
        engineeringraphicsp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1M759cAIluqarEJMEE4GmZcD57EyFxZrV/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
  engineeringraphicsp2 = findViewById(R.id.engineeringraphicsp2);
        engineeringraphicsp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1-lfoARA8YTJjqZd0SUWWY3C3ZfmcXoRC/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        engineeringraphicsp3 = findViewById(R.id.engineeringraphicsp3);
        engineeringraphicsp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1SR_cYsWIaWMOBvULc_bz1hbFcai8RG1r/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        engineeringraphicsp4 = findViewById(R.id.engineeringraphicsp4);
        engineeringraphicsp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1zITXUc_uQTtcQQq-ECLj1wcGyS8Mt4-I/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        engineeringraphicsp5 = findViewById(R.id.engineeringraphicsp5);
        engineeringraphicsp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1rvYVcxSnVXGXIz_uURg9DvrfqvsfSXW4/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        engineeringraphicsp6 = findViewById(R.id.engineeringraphicsp6);
        engineeringraphicsp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/15w6IXtWdUKiARwQ2wvL8AkgX0VaJYpaz/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        engineeringraphicsp7 = findViewById(R.id.engineeringraphicsp7);
        engineeringraphicsp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1z15XVGjoq_V1oM2XBbyfbj6atOKG213s/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

     //////////////////////
        sheet1 = findViewById(R.id.sheet1);
        sheet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1bQTRiGsmsDtm_yh2PRlJ9UwZ-0TgqTxx/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        sheet2 = findViewById(R.id.sheet2);
        sheet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1hU6lPkzvtHl8oYgmIvkzaP_ILLtnY9JG/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        sheet3 = findViewById(R.id.sheet3);
        sheet3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1YV-fvVpP_F2VBF81iXogEptHJwA97Jnv/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        sheet4 = findViewById(R.id.sheet4);
        sheet4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1Xw8EOciQ77UTXASfKg5KpTm_uHfyKZco/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        sheet5 = findViewById(R.id.sheet5);
        sheet5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1QmPUYvtoLz4TPtT0G-_qYlMwXNLkGcDD/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        sheet6 = findViewById(R.id.sheet6);
        sheet6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1s67nRD4jPUOzod9SL15cKZXDo6o97a8-/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        sheet7 = findViewById(R.id.sheet7);
        sheet7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/file/d/1YZOS6l4Be0d1gpZjEYEvv-Kuy7SBguiM/view"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}