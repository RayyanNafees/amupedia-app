package education.educate.amupedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

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
import android.widget.VideoView;

import education.educate.amupedia.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Blog extends AppCompatActivity {
    CardView blogcardview, blogcardview2 , blogcardview3;
    FloatingActionButton drawyerff;
    VideoView vvblog;
    private AdView blogad, blogad2;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvblog.start();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        blogad = findViewById(R.id.blog_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        blogad.loadAd(adRequest);

        blogad2 = findViewById(R.id.blog2_banner);
        AdRequest adRequest2= new AdRequest.Builder().build();
        blogad2.loadAd(adRequest2);

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


        vvblog=findViewById(R.id.vvblog);
        vvblog.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.blog);
        vvblog.start();

        blogcardview = findViewById(R.id.blogcardView);
        blogcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amupedia.com/post/how-to-type-assignments-in-your-handwriting-in-10-easy-steps"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        blogcardview2 = findViewById(R.id.blogcardView2);
        blogcardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amupedia.com/post/start-your-career-as-a-data-scientist"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        blogcardview3 = findViewById(R.id.blogcardView3);
        blogcardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amupedia.com/post/autocad"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });
    }
}