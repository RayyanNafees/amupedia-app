package education.educate.amupedia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

import education.educate.amupedia.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {
    private AdView mainView;
    VideoView vv;
    FloatingActionButton drawyerff;
    CardView btech;
    CardView be;
    CardView bcom;
    CardView othercourses, amupedia;
    FirebaseRemoteConfig remoteConfig;

    @Override
    public void onBackPressed() {
        finishAffinity();
        System.exit(0);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if (hasFocus) {
            vv.start();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        int currentVersionCode;
        currentVersionCode = getCurrentVersionCode();

        Log.d("myApp", String.valueOf(currentVersionCode));

        remoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(5).build();
        remoteConfig.setConfigSettingsAsync(configSettings);

        remoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener<Boolean>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<Boolean> task) {
                if(task.isSuccessful()){
                     final String new_version_code = remoteConfig.getString("new_version_code");
                     if(Integer.parseInt(new_version_code) > getCurrentVersionCode()){
                         showUpdateDialog();

                     }
                }
            }
        });


        mainView = findViewById(R.id.main_activity_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        mainView.loadAd(adRequest);


        ////////////////////


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


        ////////////////////

        vv = findViewById(R.id.vv);
        vv.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.amupedianewlogo);
        vv.start();

        vv.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        amupedia = findViewById(R.id.amupedia_com);
        amupedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.amupedia.com/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in, R.anim.nothing);
            }
        });

        btech = findViewById(R.id.btechcard);
        btech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Btechhomepage.class));
            }
        });

        be = (CardView) findViewById(R.id.BEcard);
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BEhomepage.class));
            }
        });

        bcom = (CardView) findViewById(R.id.bcomcard);
        bcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), comingsoonanime.class));
            }
        });

        othercourses = (CardView) findViewById(R.id.othercoursescard);
        othercourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), comingsoonanime.class));
            }
        });
    }

    private void showUpdateDialog() {
        final AlertDialog dialog = new AlertDialog.Builder(this).setTitle("New Update Available").setMessage("Update Now")
                .setPositiveButton("Update", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try{
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=education.educate.amupedia")));
                        }catch(Exception e){
                            Toast.makeText(getApplicationContext(), "Something went wrong. Try again later !", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
        .show();
        dialog.setCancelable(false);
    }

    private int getCurrentVersionCode() {

        PackageInfo packageInfo = null;
        try{
            packageInfo = getPackageManager().getPackageInfo(getPackageName(),0);
        }catch(Exception e){
            Log.d("myApp" , e.getMessage());
        }

        return packageInfo.versionCode;
    }

}