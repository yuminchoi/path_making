package com.example.myapplication.Art_Activity;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.suke.widget.SwitchButton;


public class Art_6F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;

    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_6f);
        textview=findViewById(R.id.textView6);

        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        FL1View fl1view = new FL1View(fl1.getContext());
        fl1.addView(fl1view);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        FL2View fl2view = new FL2View(fl2.getContext());
        fl2.addView(fl2view);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        FL3View fl3view = new FL3View(fl3.getContext());
        fl3.addView(fl3view);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        FL4View fl4view = new FL4View(fl4.getContext());
        fl4.addView(fl4view);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        FL5View fl5view = new FL5View(fl5.getContext());
        fl5.addView(fl5view);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        FL6AView fl6Aview = new FL6AView(fl6A.getContext());
        fl6A.addView(fl6Aview);
        fl6A.setVisibility(View.GONE);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        FL6View fl6view = new FL6View(fl6.getContext());
        fl6.addView(fl6view);
        fl6.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        FL7View fl7view = new FL7View(fl7.getContext());
        fl7.addView(fl7view);
        fl7.setVisibility(View.GONE);

        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        FL8View fl8view = new FL8View(fl8.getContext());
        fl8.addView(fl8view);
        fl8.setVisibility(View.GONE);

        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        FL9View fl9view = new FL9View(fl9.getContext());
        fl9.addView(fl9view);
        fl9.setVisibility(View.GONE);

        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        FL10View fl10view = new FL10View(fl10.getContext());
        fl10.addView(fl10view);
        fl10.setVisibility(View.GONE);

        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        finalView finalview = new finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);

        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if (isChecked) {
                    Toast.makeText(Art_6F_Activity.this, "모든 대피로", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "yes");
                    prefEditor.apply();

                    fl1.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl3.setVisibility(View.INVISIBLE);
                    fl4.setVisibility(View.INVISIBLE);
                    fl5.setVisibility(View.INVISIBLE);
                    fl6A.setVisibility(View.INVISIBLE);
                    fl6.setVisibility(View.INVISIBLE);
                    fl7.setVisibility(View.INVISIBLE);
                    fl8.setVisibility(View.INVISIBLE);
                    fl9.setVisibility(View.INVISIBLE);
                    fl10.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Art_6F_Activity.this, "경로 리셋", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "false");
                    prefEditor.apply();

                    fl1.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl3.setVisibility(View.INVISIBLE);
                    fl4.setVisibility(View.INVISIBLE);
                    fl5.setVisibility(View.INVISIBLE);
                    fl6A.setVisibility(View.INVISIBLE);
                    fl6.setVisibility(View.INVISIBLE);
                    fl7.setVisibility(View.INVISIBLE);
                    fl8.setVisibility(View.INVISIBLE);
                    fl9.setVisibility(View.INVISIBLE);
                    fl10.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.INVISIBLE);
                }
            }
        });

        if (prefs.getString("checked", "no").equals("yes")) {
            switchButton.setChecked(true);
        } else {
            switchButton.setChecked(false);
        }

        moving_601();
        moving_602();
        moving_603();
        moving_604();
        moving_605();
        moving_606A();
        moving_606();
        moving_607();
        moving_608();
        moving_609();
        moving_610();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public class FL1View extends View {
        public FL1View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(500, 560);
            path.lineTo(500, 540);
            path.lineTo(800, 540);
            path.lineTo(800, 675);


            canvas.drawPath(path, MyPaint);
        }
    }


    public class FL2View extends View {
        public FL2View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(300, 540);
            path.lineTo(800, 540);
            path.lineTo(800, 675);


            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL3View extends View {
        public FL3View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(480, 520);
            path.lineTo(480, 540);
            path.lineTo(800, 540);
            path.lineTo(800, 675);
            path.lineTo(830, 675);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL4View extends View {
        public FL4View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(800, 520);
            path.lineTo(800, 675);
            path.lineTo(840, 675);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL5View extends View {
        public FL5View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(970, 520);
            path.lineTo(970, 540);
            path.lineTo(750, 540);
            path.lineTo(750, 675);
            path.lineTo(770, 675);
            path.lineTo(790, 675);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL6AView extends View {
        public FL6AView(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1150, 500);
            path.lineTo(1150, 540);
            path.lineTo(1330, 540);
            path.lineTo(1330, 570);
            path.lineTo(1330, 590);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL6View extends View {
        public FL6View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1360, 500);
            path.lineTo(1360, 540);
            path.lineTo(1330, 540);
            path.lineTo(1330, 570);
            path.lineTo(1330, 590);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL7View extends View {
        public FL7View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1550, 500);
            path.lineTo(1550, 540);
            path.lineTo(1320, 540);
            path.lineTo(1320, 570);
            path.lineTo(1320, 580);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL8View extends View {
        public FL8View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1650, 580);
            path.lineTo(1650, 540);
            path.lineTo(1320, 540);
            path.lineTo(1320, 570);
            path.lineTo(1320, 580);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL9View extends View {
        public FL9View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(1040, 570);
            path.lineTo(1040, 540);
            path.lineTo(1320, 540);
            path.lineTo(1320, 570);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL10View extends View {
        public FL10View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(970, 580);
            path.lineTo(970, 540);
            path.lineTo(750, 540);
            path.lineTo(750, 675);
            path.lineTo(770, 675);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class finalView extends View {
        public finalView(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{25, 40}, 0));
            MyPaint.setStrokeWidth(10f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(320, 540);
            path.lineTo(1800, 540);


            path.moveTo(1330,540);
            path.lineTo(1330,620);

            path.moveTo(800, 540);
            path.lineTo(800, 675);
            canvas.drawPath(path, MyPaint);
        }
    }

    // 601호에서 최단거리 이동
    private void moving_601() {
        final Button b = (Button) findViewById(R.id.a_601);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 550,550,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510,490,490,635,635); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1.setVisibility(View.VISIBLE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 602호에서 최단거리 이동
    private void moving_602() {
        final Button b = (Button) findViewById(R.id.a_602);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 300,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,490,635,635); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.VISIBLE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 603호에서 최단거리 이동
    private void moving_603() {
        final Button b = (Button) findViewById(R.id.a_603);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 500,500,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 470,490,490,625,625); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.VISIBLE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //604호에서 최단거리 이동
    private void moving_604() {
        final Button button = (Button) findViewById(R.id.a_604);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 800,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 470,490,625,625); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.VISIBLE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //605호에서 최단거리 이동
    private void moving_605() {
        final Button button = (Button) findViewById(R.id.a_605);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1020,1020,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 470,490,490,625,625); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.VISIBLE);
                fl6A.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //606A호에서 최단거리 이동
    private void moving_606A() {
        final Button button = (Button) findViewById(R.id.a_606A);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1200,1200,1380,1380); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",450,490,490,520); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.VISIBLE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //606호에서 최단거리 이동
    private void moving_606() {
        final Button button = (Button) findViewById(R.id.a_606);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1410,1410,1380,1380); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",450,490,490,520); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6.setVisibility(View.VISIBLE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //607호에서 최단거리 이동
    private void moving_607() {
        final Button button = (Button) findViewById(R.id.a_607);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1600,1600,1370,1370); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450,490,490,520); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.VISIBLE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //608호에서 최단거리 이동
    private void moving_608() {
        final Button button = (Button) findViewById(R.id.a_608);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1700,1700,1370,1370); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 530,490,490,520); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.VISIBLE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //609호에서 최단거리 이동
    private void moving_609() {
        final Button button = (Button) findViewById(R.id.a_609);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1090,1090,1370,1370); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,490,490,520); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.VISIBLE);
                fl10.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //610호에서 최단거리 이동
    private void moving_610() {
        final Button button = (Button) findViewById(R.id.a_610);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6A = (FrameLayout) findViewById(R.id.fl6A);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1020,1020,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 530,490,490,625,625); //y 좌표
                animation3.setDuration(1800);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6A.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.VISIBLE);
                flf.setVisibility(View.GONE);

            }
        });
    }

}

