package com.tanxe.cehv12quizapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/** @noinspection ALL*/
public class StartGame extends AppCompatActivity {
    MediaPlayer mptime;
    TextView tvTimer;
    TextView tvResult;
    ImageView ivShowImage;
    HashMap<String, Integer> map = new HashMap<>();
    ArrayList<String> techList = new ArrayList<>();
    int index;
    Button btn1, btn2, btn3, btn4;
    TextView tvPoints;
    int points;
    CountDownTimer countDownTimer;
    long millisUntilFinished;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_game);
        tvTimer = findViewById(R.id.tvTimer);
        tvResult = findViewById(R.id.tvResult);
        ivShowImage = findViewById(R.id.ivShowImage);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        tvPoints = findViewById(R.id.tvPoints);
        index = 0;

        techList.add("Hipaa");
        techList.add("-sX");
        techList.add("Blind SQLi");
        techList.add("802.11a");
        techList.add("Blind");
        techList.add("Hexadecimal");
        techList.add("nmap –T4 –F 10.10.0.0/24");
        techList.add("Tcpdump");
        techList.add("Access Gateway");
        techList.add("Residual risk");
        techList.add("WHOIS");
        techList.add("Encryption");
        techList.add("nmap -sT -O -T0");
        techList.add("SHA-1");
        techList.add("-sS");
        techList.add("xss");
        techList.add("Meet-in-the-middle attack");
        techList.add("Userland Exploit");
        techList.add("Output the results in XML format to a file");
        techList.add("False positive");
        techList.add("Kismet");
        techList.add("Bluejacking");
        techList.add("Aircrack-ng");
        techList.add("[site:]");
        techList.add("False Positives and False Negatives");
        techList.add("IDS");
        techList.add("Multipartite Virus");
        techList.add("Bluedriving");
        techList.add("Botnet");
        techList.add("WIPS");
        techList.add("Public Key");
        techList.add("Gray Hat");
        techList.add("ESP");
        techList.add("Ettercap");
        techList.add("Windows");
        techList.add("Nikto");
        techList.add("Rainbow Table Attack");
        techList.add("Netcat");
        techList.add("-T");
        techList.add("Burp Suite");
        techList.add("Grey-box");
        techList.add("Remote access policy");
        techList.add("PKI");
        techList.add("tcp.port == 21");
        techList.add("SYN");
        techList.add("Media Access Control (MAC)");
        techList.add("Reconnaissance");
        techList.add("Sniffers operate on Layer 2 of the OSI model");
        techList.add("RSA");
        techList.add("IPsec");
        techList.add("Web application firewall");
        techList.add("Internal, Black-box");
        techList.add("compmgmt.msc");
        techList.add("Auxiliary Module");
        techList.add("Footprinting");
        techList.add("-F");
        techList.add("123");
        techList.add("Work at the Data Link Layer");
        techList.add("Snort");
        techList.add("aLTEr");

        map.put(techList.get(0), R.drawable.hipaa);
        map.put(techList.get(1), R.drawable.sx);
        map.put(techList.get(2), R.drawable.blindsqli);
        map.put(techList.get(3), R.drawable.a);
        map.put(techList.get(4), R.drawable.blind);
        map.put(techList.get(5), R.drawable.hexadecimal);
        map.put(techList.get(6), R.drawable.nmapt4f10100024);
        map.put(techList.get(7), R.drawable.tcpdump);
        map.put(techList.get(8), R.drawable.accessgateway);
        map.put(techList.get(9), R.drawable.residualrisk);
        map.put(techList.get(10), R.drawable.whois);
        map.put(techList.get(11), R.drawable.encryption);
        map.put(techList.get(12), R.drawable.nmapstoto);
        map.put(techList.get(13), R.drawable.sha1);
        map.put(techList.get(14), R.drawable.ss);
        map.put(techList.get(15), R.drawable.xss);
        map.put(techList.get(16), R.drawable.meetinthemiddleattack);
        map.put(techList.get(17), R.drawable.userlandexploit);
        map.put(techList.get(18), R.drawable.outputtheresultsinxmlformattoafile);
        map.put(techList.get(19), R.drawable.falsepositive);
        map.put(techList.get(20), R.drawable.kismet);
        map.put(techList.get(21), R.drawable.bluejacking);
        map.put(techList.get(22), R.drawable.aircrackng);
        map.put(techList.get(23), R.drawable.site);
        map.put(techList.get(24), R.drawable.falsepositivesandfalsenegatives);
        map.put(techList.get(25), R.drawable.ids);
        map.put(techList.get(26), R.drawable.multipartitevirus);
        map.put(techList.get(27), R.drawable.bluedriving);
        map.put(techList.get(28), R.drawable.botnet);
        map.put(techList.get(29), R.drawable.wips);
        map.put(techList.get(30), R.drawable.publickey);
        map.put(techList.get(31), R.drawable.grayhat);
        map.put(techList.get(32), R.drawable.esp);
        map.put(techList.get(33), R.drawable.ettercap);
        map.put(techList.get(34), R.drawable.windows);
        map.put(techList.get(35), R.drawable.nikto);
        map.put(techList.get(36), R.drawable.rainbowtableattack);
        map.put(techList.get(37), R.drawable.netcat);
        map.put(techList.get(38), R.drawable.t);
        map.put(techList.get(39), R.drawable.burpsuite);
        map.put(techList.get(40), R.drawable.greybox);
        map.put(techList.get(41), R.drawable.remoteaccesspolicy);
        map.put(techList.get(42), R.drawable.pki);
        map.put(techList.get(43), R.drawable.tcpport21);
        map.put(techList.get(44), R.drawable.syn);
        map.put(techList.get(45), R.drawable.mediaaccesscontrolmac);
        map.put(techList.get(46), R.drawable.reconnaissance);
        map.put(techList.get(47), R.drawable.sniffersoperateonlayer2oftheosimodel);
        map.put(techList.get(48), R.drawable.rsa);
        map.put(techList.get(49), R.drawable.ipsec);
        map.put(techList.get(50), R.drawable.webapplicationfirewall);
        map.put(techList.get(51), R.drawable.internalblackbox);
        map.put(techList.get(52), R.drawable.compmgmtmsc);
        map.put(techList.get(53), R.drawable.auxiliarymodule);
        map.put(techList.get(54), R.drawable.footprinting);
        map.put(techList.get(55), R.drawable.f);
        map.put(techList.get(56), R.drawable.c);
        map.put(techList.get(57), R.drawable.workatthedatalinklayer);
        map.put(techList.get(58), R.drawable.snort);
        map.put(techList.get(59), R.drawable.alter);


        Collections.shuffle(techList);
        millisUntilFinished = 1000;
        points = 0;
        startGame();
    }

    @SuppressLint("SetTextI18n")
    private void startGame() {
        mptime= MediaPlayer.create(this, R.raw.time);
        millisUntilFinished = 60000;
        tvTimer.setText((millisUntilFinished / 1000) + "s");
        tvPoints.setText(points + " / " + techList.size());
        generateQuestions(index);
        countDownTimer = new CountDownTimer(millisUntilFinished, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (millisUntilFinished < 60000) {
                    tvTimer.setTextColor(Color.WHITE);
                }
                if (millisUntilFinished < 10000) {
                    tvTimer.setTextColor(Color.RED);
                    {
                        mptime.start();
                    }
                }
                tvTimer.setText((millisUntilFinished / 1000) + "s");
            }


            @Override
            public void onFinish() {
                index++;
                if (index > techList.size() - 1){
                    ivShowImage.setVisibility(View.GONE);
                    btn1.setVisibility(View.GONE);
                    btn2.setVisibility(View.GONE);
                    btn3.setVisibility(View.GONE);
                    btn4.setVisibility(View.GONE);
                    Intent intent = new Intent(StartGame.this, GameOver.class);
                    intent.putExtra("points", points);
                    startActivity(intent);
                    finish();
                } else {
                    countDownTimer = null;
                    startGame();
                }
            }
        }.start();
    }

    private void generateQuestions(int index) {
        ArrayList<String> techListTemp = (ArrayList<String>) techList.clone();
        String correctAnswer = techList.get(index);
        techListTemp.remove(correctAnswer);
        Collections.shuffle(techListTemp);
        ArrayList<String> newList = new ArrayList<>();
        newList.add(techListTemp.get(0));
        newList.add(techListTemp.get(1));
        newList.add(techListTemp.get(2));

        newList.add(correctAnswer);
        Collections.shuffle(newList);
        btn1.setText(newList.get(0));
        btn2.setText(newList.get(1));
        btn3.setText(newList.get(2));
        btn4.setText(newList.get(3));
        ivShowImage.setImageResource(map.get(techList.get(index)));
    }


    public void nextQuestion(View view) {
        btn1.setBackgroundColor(Color.parseColor("#001A41"));
        btn2.setBackgroundColor(Color.parseColor("#001A41"));
        btn3.setBackgroundColor(Color.parseColor("#001A41"));
        btn4.setBackgroundColor(Color.parseColor("#001A41"));
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        countDownTimer.cancel();
        index++;
        if (index > techList.size() - 1){
            ivShowImage.setVisibility(View.GONE);
            btn1.setVisibility(View.GONE);
            btn2.setVisibility(View.GONE);
            btn3.setVisibility(View.GONE);
            btn4.setVisibility(View.GONE);
            Intent intent = new Intent(StartGame.this, GameOver.class);
            intent.putExtra("points", points);
            startActivity(intent);
            finish();
        } else {
            countDownTimer = null;
            startGame();
        }
    }

    @SuppressLint("SetTextI18n")
    public void answerSelected(View view) {
        view.setBackgroundColor(Color.parseColor("#0099CC"));
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        countDownTimer.cancel();
        String answer = ((Button) view).getText().toString().trim();
        String correctAnswer = techList.get(index);
        if(answer.equals(correctAnswer)){
            points++;
            tvPoints.setText(points + " / " + techList.size());
            view.setBackgroundColor(Color.parseColor("#4CAF50"));
            CharSequence text = "Correct";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(this /* MyActivity */, text, duration);
            toast.show();
            MediaPlayer player= MediaPlayer.create(this,R.raw.correct);
            player.start();

        } else {
            view.setBackgroundColor(Color.parseColor("#F44336"));
            CharSequence text = "Wrong";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(this /* MyActivity */, text, duration);
            toast.show();
            MediaPlayer player= MediaPlayer.create(this,R.raw.wrong);
            player.start();
        }

    }
}