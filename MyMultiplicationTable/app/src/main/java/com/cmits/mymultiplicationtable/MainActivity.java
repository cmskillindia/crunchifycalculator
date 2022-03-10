package com.cmits.mymultiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button display_button,clear_button;
    TextView display_answer;
    EditText user_input;
    String z = " ";
    String ui_x = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display_button = findViewById(R.id.display_button);
        clear_button = findViewById(R.id.clear_button);
        display_answer = findViewById(R.id.display_answer);
        user_input = findViewById(R.id.user_input);

        display_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ui_x = String.valueOf(user_input.getText());
                int b = Integer.valueOf(ui_x);
                calculateMultiplication(b);

            }
        });

        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display_answer.setText("");
                user_input.setText(" ");
            }
        });
    }
     void calculateMultiplication(int ui)
     {
         for(int i=1; i<=10 ; i++)
         {
             int answer = ui*i ;
             String s = ui + "x" + i + "=" + answer;
             z = z+s+"\n";
         }
         display_answer.setText(z);
     }
}
