package education.educate.amupedia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import education.educate.amupedia.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Drawyer extends AppCompatActivity {
    private AdView adView;
    Button home;
    Button course;
    Button blog;
    Button about , feedbackbutton , ppbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawyer);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

       adView = findViewById(R.id.drawer_banner);
       AdRequest adRequest = new AdRequest.Builder().build();
       adView.loadAd(adRequest);

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



        home=findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                overridePendingTransition(R.anim.left_slide_out,R.anim.nothing);            }
        });

        ppbutton=findViewById(R.id.ppbutton);
        ppbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),privacy_policy.class));
                overridePendingTransition(R.anim.left_slide_out,R.anim.nothing);            }
        });

        course = findViewById(R.id.coursebutton);
        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Courses.class));
                overridePendingTransition(R.anim.left_slide_out,R.anim.nothing);
            }
        });

        blog=findViewById(R.id.blogbutton);
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Blog.class));
                overridePendingTransition(R.anim.left_slide_out,R.anim.nothing);
            }
        });

        about=findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Aboutus.class));
                overridePendingTransition(R.anim.left_slide_out,R.anim.nothing);
            }
        });

        feedbackbutton=findViewById(R.id.feedbackbutton);
        feedbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),feedback.class));
                overridePendingTransition(R.anim.left_slide_out,R.anim.nothing);
            }
        });
    }
}