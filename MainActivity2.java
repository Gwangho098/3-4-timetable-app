package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;



public class MainActivity2 extends AppCompatActivity {


    TextView textView11, textView12, textView13, textView14, textView15, textView21, textView22, textView23, textView24, textView25, textView31, textView32, textView33, textView34, textView35,
            textView41, textView42, textView43, textView44, textView45, textView51, textView52, textView53, textView54, textView55, textView61, textView62, textView63, textView64, textView65, textView71, textView72,
            textView73, textView74, textView75;
    String temp = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent myIntent = getIntent();
        String sub_A = myIntent.getExtras().getString("sub_A");
        String sub_B = myIntent.getExtras().getString("sub_B");
        String sub_C = myIntent.getExtras().getString("sub_C");
        String sub_D = myIntent.getExtras().getString("sub_D");
        String sub_E = myIntent.getExtras().getString("sub_E");

        TextView textView13 = (TextView) findViewById(R.id.textView13) ;
        textView13.setText(sub_A) ;

        TextView textView21 = (TextView) findViewById(R.id.textView21) ;
        textView21.setText(sub_A) ;

        TextView textView22 = (TextView) findViewById(R.id.textView22) ;
        textView22.setText(sub_C) ;

        TextView textView23 = (TextView) findViewById(R.id.textView23) ;
        textView23.setText(sub_C) ;

        TextView textView24 = (TextView) findViewById(R.id.textView24) ;
        textView24.setText(sub_C) ;

        TextView textView51 = (TextView) findViewById(R.id.textView51) ;
        textView51.setText(sub_B) ;

        TextView textView62 = (TextView) findViewById(R.id.textView62) ;
        textView62.setText(sub_B) ;

        TextView textView63 = (TextView) findViewById(R.id.textView63) ;
        textView63.setText(sub_E) ;

        TextView textView64 = (TextView) findViewById(R.id.textView64) ;
        textView64.setText(sub_D) ;

        TextView textView65 = (TextView) findViewById(R.id.textView65) ;
        textView65.setText(sub_B) ;

        TextView textView73 = (TextView) findViewById(R.id.textView73) ;
        textView73.setText(sub_D) ;

        TextView textView74 = (TextView) findViewById(R.id.textView74) ;
        textView74.setText(sub_E) ;

        TextView textView25 = (TextView) findViewById(R.id.textView25) ;
        textView25.setText(sub_A) ;
        textView11 = findViewById(R.id.textView11);

        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "박정아 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });
        textView12 = findViewById(R.id.textView12);

        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "안충모 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });

        textView13 = findViewById(R.id.textView13);

        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_A.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_A.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_A.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_A.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_A.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_A.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_A.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_A.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_A.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_A.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_A.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_A.equals("국제관계기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_A.equals("현대사회변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });

        textView14 = findViewById(R.id.textView14);

        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "김동현 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });
        textView15 = findViewById(R.id.textView15);

        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "육정우 T \n 운동장", Toast.LENGTH_SHORT).show();
            }
        });
        textView21 = findViewById(R.id.textView21);

        textView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_A.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_A.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_A.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_A.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_A.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_A.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_A.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_A.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_A.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_A.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_A.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_A.equals("국제관계기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_A.equals("현대사회변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });
        textView22 = findViewById(R.id.textView22);

        textView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_C.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_C.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_C.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_C.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_C.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_C.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_C.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_C.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_C.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_C.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_C.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_C.equals("국제관계기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_C.equals("현대사회변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });
        textView23 = findViewById(R.id.textView23);

        textView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_C.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_C.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_C.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_C.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_C.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_C.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_C.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_C.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_C.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_C.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_C.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_C.equals("국제관계기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_C.equals("현대사회변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });
        textView24 = findViewById(R.id.textView24);

        textView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_C.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_C.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_C.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_C.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_C.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_C.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_C.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_C.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_C.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_C.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_C.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_C.equals("국제관계기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_C.equals("현대사회변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });
        textView25 = findViewById(R.id.textView25);

        textView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_A.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_A.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_A.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_A.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_A.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_A.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_A.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_A.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_A.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_A.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_A.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_A.equals("국제관계기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_A.equals("현대사회변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });

        textView31 = findViewById(R.id.textView31);

        textView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "백승훈 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });

        textView32 = findViewById(R.id.textView32);

        textView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "문수련 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });

        textView33 = findViewById(R.id.textView33);

        textView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "배준 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });

        textView34 = findViewById(R.id.textView34);

        textView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "박정아 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });

        textView35 = findViewById(R.id.textView35);

        textView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "김동현 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });

        textView41 = findViewById(R.id.textView41);

        textView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "청운재 및 교실자습", Toast.LENGTH_SHORT).show();
            }
        });

        textView42 = findViewById(R.id.textView42);

        textView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "청운재 및 교실자습", Toast.LENGTH_SHORT).show();
            }
        });

        textView43 = findViewById(R.id.textView43);

        textView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "청운재 및 교실자습", Toast.LENGTH_SHORT).show();
            }
        });

        textView44 = findViewById(R.id.textView44);

        textView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "청운재 및 교실자습", Toast.LENGTH_SHORT).show();
            }
        });

        textView45 = findViewById(R.id.textView45);

        textView45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "청운재 및 교실자습", Toast.LENGTH_SHORT).show();
            }
        });
        textView51 = findViewById(R.id.textView51);

        textView51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_B.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_B.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_B.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_B.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_B.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_B.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_B.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_B.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_B.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_B.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_B.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_B.equals("국제관계기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_B.equals("현대사회변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });

        textView52 = findViewById(R.id.textView52);

        textView52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "백승훈 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });

        textView53 = findViewById(R.id.textView53);

        textView53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "유정화 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });

        textView54 = findViewById(R.id.textView54);

        textView54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "백승훈 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });

        textView55 = findViewById(R.id.textView55);

        textView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "유정화 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });

        textView61 = findViewById(R.id.textView61);

        textView61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "최현용 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });
        textView62 = findViewById(R.id.textView62);

        textView62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_B.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_B.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_B.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_B.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_B.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_B.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_B.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_B.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_B.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_B.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_B.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_B.equals("국제관계기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_B.equals("현대사회변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });
        textView63 = findViewById(R.id.textView63);

        textView63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_E.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_E.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_E.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_E.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_E.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_E.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_E.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_E.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_E.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_E.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_E.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_E.equals("국제관계와 국제기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_E.equals("현대세계의 변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });

        textView64 = findViewById(R.id.textView64);

        textView64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_D.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_D.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_D.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_D.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_D.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_D.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_D.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_D.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_D.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_D.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_D.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_D.equals("국제관계와 국제기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_D.equals("현대세계의 변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });

        textView65 = findViewById(R.id.textView65);

        textView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_B.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_B.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_B.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_B.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_B.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_B.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_B.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_B.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_B.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_B.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_B.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_B.equals("국제관계기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_B.equals("현대사회변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });

        textView71 = findViewById(R.id.textView71);

        textView71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "조수아 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });

        textView72 = findViewById(R.id.textView72);

        textView72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "배준 T \n 3-4반 교실", Toast.LENGTH_SHORT).show();
            }
        });
        textView73 = findViewById(R.id.textView73);

        textView73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_D.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_D.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_D.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_D.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_D.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_D.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_D.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_D.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_D.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_D.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_D.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_D.equals("국제관계와 국제기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_D.equals("현대세계의 변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });
        textView74 = findViewById(R.id.textView74);

        textView74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub_E.equals("한국지리")) {
                    temp = "황승근 T \n 3-2반 교실";
                }else if(sub_E.equals("물리학Ⅱ")){
                    temp = "허승환 T \n 3-4반 교실";
                }else if(sub_E.equals("화학Ⅱ")){
                    temp = "황윤서 T \n 3-5반 교실";
                }else if(sub_E.equals("생명과학Ⅱ")){
                    temp = "조수아 T \n 3-6반 교실";
                }else if(sub_E.equals("지구과학Ⅱ")){
                    temp = "김기권 T \n 3-7반 교실";
                }else if(sub_E.equals("고급물리학")){
                    temp = "허승환 T \n 3-6반 교실";
                }else if(sub_E.equals("고급화학")){
                    temp = "김동만 T \n 3-7반 교실";
                }else if(sub_E.equals("고급생명과학")){
                    temp = "조수아 T \n 3-8반 교실";
                }else if(sub_E.equals("일본어")){
                    temp = "3-1반 교실";
                }else if(sub_E.equals("프로그래밍")){
                    temp = "문수련 T \n 컴퓨터실";
                }else if(sub_E.equals("국제경제")){
                    temp = "민동훈 T \n 3-1반 교실";
                }else if(sub_E.equals("국제관계와 국제기구")){
                    temp = "안가은 T \n 3-2반 교실";
                }else if(sub_E.equals("현대세계의 변화")){
                    temp = "송요한 T & 한혜성 T \n 3-3반 교실";
                }
                Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
            }
        });


        textView75 = findViewById(R.id.textView75);

        textView75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), " 각 동아리 담당 T \n 각 동아리 교실", Toast.LENGTH_SHORT).show();
            }
        });
    }
}