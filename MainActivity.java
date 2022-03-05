package com.example.timetable;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button confirm_btn;
    Button subject_A_btn, subject_B_btn, subject_C_btn, subject_D_btn, subject_E_btn;
    TextView subject_A_txt, subject_B_txt, subject_C_txt, subject_D_txt, subject_E_txt;
    String sub_A = "null", sub_B = "null", sub_C = "null", sub_D = "null", sub_E = "null";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        confirm_btn = (Button) findViewById(R.id.confirm_btn);

        confirm_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myintent = new Intent(MainActivity.this, MainActivity2.class);

                myintent.putExtra("sub_A", sub_A);
                myintent.putExtra("sub_B", sub_B);
                myintent.putExtra("sub_C", sub_C);
                myintent.putExtra("sub_D", sub_D);
                myintent.putExtra("sub_E", sub_E);

                startActivity(myintent);
                finish();

            }
        });

        subject_A_btn = (Button) findViewById(R.id.subject_A_btn);

        subject_A_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 final String[] items = new String[]{"한국지리", "물리학Ⅱ", "화학Ⅱ", "생명과학Ⅱ"};
                 final int[] selectedindex = {0};

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("선택과목 A를 선택해주세요.")
                        .setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                selectedindex[0] = which;
                            }
                        })
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                subject_A_txt = (TextView) findViewById(R.id.subject_A_txt);
                                subject_A_txt.setText(items[selectedindex[0]]);
                                sub_A = items[selectedindex[0]];
                            }
                        }).create().show();
            }
        });

        subject_B_btn = (Button) findViewById(R.id.subject_B_btn);

        subject_B_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] items = new String[]{"한국지리", "물리학Ⅱ", "화학Ⅱ", "생명과학Ⅱ", "지구과학Ⅱ"};
                final int[] selectedindex = {0};

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("선택과목 B를 선택해주세요.")
                        .setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                selectedindex[0] = which;
                            }
                        })
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                subject_B_txt = (TextView) findViewById(R.id.subject_B_txt);
                                subject_B_txt.setText(items[selectedindex[0]]);
                                sub_B = items[selectedindex[0]];
                            }
                        }).create().show();
            }
        });

        subject_C_btn = (Button) findViewById(R.id.subject_C_btn);

        subject_C_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] items = new String[]{"한국지리", "물리학Ⅱ", "화학Ⅱ", "생명과학Ⅱ", "지구과학Ⅱ"};
                final int[] selectedindex = {0};

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("선택과목 C를 선택해주세요.")
                        .setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                selectedindex[0] = which;
                            }
                        })
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                subject_C_txt = (TextView) findViewById(R.id.subject_C_txt);
                                subject_C_txt.setText(items[selectedindex[0]]);
                                sub_C = items[selectedindex[0]];
                            }
                        }).create().show();
            }
        });

        subject_D_btn = (Button) findViewById(R.id.subject_D_btn);

        subject_D_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] items = new String[]{"일본어Ⅱ", "국제관계와 국제기구", "현대세계의 변화",
                        "프로그래밍", "고급물리학", "고급화학", "고급생명과학"};
                final int[] selectedindex = {0};

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("선택과목 D를 선택해주세요.")
                        .setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                selectedindex[0] = which;
                            }
                        })
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                subject_D_txt = (TextView) findViewById(R.id.subject_D_txt);
                                subject_D_txt.setText(items[selectedindex[0]]);
                                sub_D = items[selectedindex[0]];
                            }
                        }).create().show();
            }
        });

        subject_E_btn = (Button) findViewById(R.id.subject_E_btn);

        subject_E_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] items = new String[]{"국제경제", "국제관계와 국제기구", "현대세계의 변화",
                        "프로그래밍", "고급물리학", "고급화학", "고급생명과학"};
                final int[] selectedindex = {0};

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("선택과목 E를 선택해주세요.")
                        .setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                selectedindex[0] = which;
                            }
                        })
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                subject_E_txt = (TextView) findViewById(R.id.subject_E_txt);
                                subject_E_txt.setText(items[selectedindex[0]]);
                                sub_E = items[selectedindex[0]];
                            }
                        }).create().show();
            }
        });
    }
}