package sdu.alice.animalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class Game extends AppCompatActivity {

    //Explicit
    Button btn1, btn2, btn3, btn4;
    ImageView questionImageView;
    MediaPlayer mediaPlayer;
    ImageButton volumImageButton;
    int questionCount = 10;
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String answer;
    int score = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Initial view
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        questionImageView = (ImageView) findViewById(R.id.imvQuestion);
        volumImageButton = (ImageButton) findViewById(R.id.imageButton);

        for (int i=1; i <= questionCount; i++) {
            qID.add(i); //จองพท.หน่วยความจำจำนวนข้อคำถามบน memory
        }   //for
        Collections.shuffle(qID);   //set Random Question
        setQuestion(qID.remove(0)); //คำถามที่แสดงแล้วให้ pop ออกจาก array โดย pop ที่ตำแหน่งที่ 0

    }   //Main Class

    private void setQuestion(int qID){  //กำหนดคำถามแต่ละข้อ และเฉลย

        if (qID == 1) {
            answer = "นก";  //set คำตอบที่ถูกต้อง
            questionImageView.setImageResource(R.drawable.bird_02); //แสดงรูปภาพคำถาม
            mediaPlayer = MediaPlayer.create(this,R.raw.bird );     //แสดงเสียงสัตว์ที่ตรงกับภาพ

            ArrayList<String> choice = new ArrayList<String>(); //จองพื้นที่หน่วยความจำ
            choice.add("นก");       //เก็บ choice ลงในแต่ละตำแหน่งของ array
            choice.add("แมว");
            choice.add("ม้า");
            choice.add("หมู");
            Collections.shuffle(choice);    //แสดง choice แบบ random
            btn1.setText(choice.remove(0)); //choice ที่แสดงแล้วให้ pop ออกจาก array โดย pop ที่ตำแหน่งที่ 0
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.cat);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แมว");
            choice.add("ช้าง");
            choice.add("ยุง");
            choice.add("หมา");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.cow);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("วัว");
            choice.add("ช้าง");
            choice.add("แกะ");
            choice.add("นก");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 4) {
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมา");
            choice.add("ช้าง");
            choice.add("ยุง");
            choice.add("วัว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("แมว");
            choice.add("สิงโต");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ม้า");
            choice.add("หมู");
            choice.add("แกะ");
            choice.add("ยุง");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 7) {
            answer = "ลิงโต";
            questionImageView.setImageResource(R.drawable.lion_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("แมว");
            choice.add("แกะ");
            choice.add("นก");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ยุง");
            choice.add("สิงโต");
            choice.add("หมา");
            choice.add("แมว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมู");
            choice.add("ช้าง");
            choice.add("แกะ");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep_02);
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แกะ");
            choice.add("ยุง");
            choice.add("หมา");
            choice.add("วัว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
    }   //Method setQuestion

    public void choiceAns(View view){   //Method ตรวจคำตอบ

        Button button = (Button) view;
        String buttonString = button.getText().toString();  //เก็บข้อความบนปุ่มลงบนตัวแปร buttonString
        if (buttonString.equals(answer)) {  //ถ้าข้อความบนปุ่มที่เลือกตรงกับคำตอบที่เฉลย
            score++;        //ได้คะแนน 1 คะแนน
        }

        if (qID.isEmpty()) {        //ถ้าทำครบทุกข้อแล้ว หรือ qID เป็นค่าว่าง
            dialogboxScore();       //เรียก Method dialogboxScore เพื่อแสดงคะแนน
        } else {                    //แต่ถ้ายังทำไม่ครบ
            setQuestion(qID.remove(0));     // ให้ pop คำถามออกจาก array โดย pop ที่ตำแหน่งที่ 0 และทำคำถามถัดไป
        }

    }   //Method choiceAns

    private void dialogboxScore() { //Method แสดงคะแนน
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณได้คะแนน " + score + " คะแนน")
                .setCancelable(false)
                .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }   //Method dialogboxScore

    public void playSound(View view){
        mediaPlayer.start();
    }   //method playSound

}   //Main Class
