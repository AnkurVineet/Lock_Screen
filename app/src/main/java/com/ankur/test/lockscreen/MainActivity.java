package com.ankur.test.lockscreen;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one = (Button) findViewById(R.id.button);
        Button two = (Button) findViewById(R.id.button2);
        Button three = (Button) findViewById(R.id.button3);
        Button four = (Button) findViewById(R.id.button4);
        Button five = (Button) findViewById(R.id.button5);
        Button six = (Button) findViewById(R.id.button6);
        Button seven = (Button) findViewById(R.id.button7);
        Button eight = (Button) findViewById(R.id.button8);
        Button nine = (Button) findViewById(R.id.button9);
        Button zero = (Button) findViewById(R.id.button13);
        int[] arr = new int[10];
        int[] rand = new int[10];
        int done=9,temp=0;
        double gen;
        while (done!=0)
        {
            gen = Math.random()*10;
            temp = (int) gen;
            if(arr[temp]!=1 && temp!=0)
            {
                rand[done] = temp;
                arr[temp]=1;
                done--;
            }
        }
        zero.setText(String.valueOf(rand[0]));
        one.setText(String.valueOf(rand[1]));
        two.setText(String.valueOf(rand[2]));
        three.setText(String.valueOf(rand[3]));
        four.setText(String.valueOf(rand[4]));
        five.setText(String.valueOf(rand[5]));
        six.setText(String.valueOf(rand[6]));
        seven.setText(String.valueOf(rand[7]));
        eight.setText(String.valueOf(rand[8]));
        nine.setText(String.valueOf(rand[9]));

    }
    public void one(View view)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = String.valueOf(ed.getText());
        ed.setText(str+"1");
    }
    public void two(View view)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = String.valueOf(ed.getText());
        ed.setText(str+"2");
    }
    public void three(View view)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = String.valueOf(ed.getText());
        ed.setText(str+"3");
    }
    public void four(View view)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = String.valueOf(ed.getText());
        ed.setText(str+"4");
    }
    public void five(View view)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = String.valueOf(ed.getText());
        ed.setText(str+"5");
    }
    public void six(View view)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = String.valueOf(ed.getText());
        ed.setText(str+"6");
    }
    public void seven(View view)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = String.valueOf(ed.getText());
        ed.setText(str+"7");
    }
    public void eight(View view)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = String.valueOf(ed.getText());
        ed.setText(str+"8");
    }
    public void nine(View view)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = String.valueOf(ed.getText());
        ed.setText(str+"9");
    }
    public void zero(View view)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = String.valueOf(ed.getText());
        ed.setText(str+"0");
    }
    public void del(View view)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = String.valueOf(ed.getText());
        int len = str.length();
        if(len>0)
         str = str.substring(0,len-1);
        ed.setText(str);
    }
    public void check(View view)
    {

    }
}
