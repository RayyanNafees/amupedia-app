package edu.educ.amupedia;

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
import android.widget.VideoView;

import edu.educ.amupedia.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BE_first_year extends AppCompatActivity {

    FloatingActionButton drawyerff;
    private AdView befirstadview;
    Button Applied_Mathematics_1, Applied_Mathematics_2 , Applied_Chemistry, Applied_Chemistry_Lab , Applied_Physics, Applied_Physics_lab
            , Thermodynamics, Elecengineering ,Environment, Computer ,Engineeringgraphics, English , manufacturinglab ,  som , electronics , mechanics;

    VideoView vvbesubjects;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),BEhomepage.class));
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            vvbesubjects.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_first_year);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        befirstadview = findViewById(R.id.befirst_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        befirstadview.loadAd(adRequest);


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

        vvbesubjects=findViewById(R.id.vvbesubjects);
        vvbesubjects.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.btechsubjects);
        vvbesubjects.start();
        drawyerff = findViewById(R.id.fmain);
        drawyerff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Drawyer.class));
                overridePendingTransition(R.anim.left_slide_in,R.anim.nothing);
            }
        });

        Applied_Mathematics_1 = findViewById(R.id.Applied_Mathematics_1);
        Applied_Mathematics_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Apmfbtf.class));
            }
        });

        Applied_Mathematics_2 = findViewById(R.id.Applied_Mathematics_2);
        Applied_Mathematics_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Apmsbtf.class));
            }
        });

        Applied_Chemistry = findViewById(R.id.Applied_Chemistry);
        Applied_Chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),appliedchemistryf.class));
            }
        });

        Applied_Chemistry_Lab = findViewById(R.id.Applied_Chemistry_Lab);
        Applied_Chemistry_Lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),appliedchemistrylab.class));
            }
        });

        Applied_Physics = findViewById(R.id.Applied_Physics);
        Applied_Physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),appliedphysicsf.class));
            }
        });

        Applied_Physics_lab = findViewById(R.id.Applied_physics_Lab);
        Applied_Physics_lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),appliedphysicslabf.class));
            }
        });

        Thermodynamics = findViewById(R.id.Thermo_Dynamics);
        Thermodynamics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),thermodynamics.class));
            }
        });

        Elecengineering = findViewById(R.id.Electrical_Engineering);
        Elecengineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Elecengineering.class));
            }
        });

        Environment = findViewById(R.id.Environmental_Studies);
        Environment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Environmentalstudies.class));
            }
        });

        Computer = findViewById(R.id.Computer_engineering);
        Computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),computer.class));
            }
        });

        Engineeringgraphics = findViewById(R.id.Engineering_Graphics);
        Engineeringgraphics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),engineeringgraphics.class));
            }
        });

        English = findViewById(R.id.English);
        English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),english_btech.class));
            }
        });

        manufacturinglab = findViewById(R.id.Manufacturing_lab);
        manufacturinglab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),manufacturinglabs.class));
            }
        });

        som = findViewById(R.id.Strength_Of_Materials);
        som.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),som.class));
            }
        });

        electronics = findViewById(R.id.Electronics);
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),elb.class));
            }
        });

        mechanics = findViewById(R.id.Mechanics);
        mechanics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),comingsoonanime.class));
            }
        });



    }
}