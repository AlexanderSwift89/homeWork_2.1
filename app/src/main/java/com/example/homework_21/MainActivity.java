package com.example.homework_21;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import static com.example.homework_21.R.id.buttonOk;


public class MainActivity extends AppCompatActivity {

    public EditText inputUserName;
    public EditText inputEmailName;
    private TextView messageOutput;
    public Button buttonOk;
    public Button buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUserName = (EditText) findViewById(R.id.inputUserName);
        inputEmailName = (EditText) findViewById(R.id.inputEmailName);
        messageOutput = (TextView) findViewById(R.id.messageOutput);
        buttonOk = (Button) findViewById(R.id.buttonOk);
        buttonClear = (Button) findViewById(R.id.buttonClear);

        View.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                switch (view.getId()) {
                    case R.id.buttonOk:
                        Editable userName = inputUserName.getText();
                        Editable emailName = inputEmailName.getText();
                        messageOutput.setText ("Подписка на рассылку успешно оформлена для пользователя " + userName + " на электронный адрес " + emailName);
                        break;
                    case R.id.buttonClear:
                        messageOutput.setText (" ");
                        break;
                }
            }
        };
        buttonOk.setOnClickListener(onClickListener);
        buttonClear.setOnClickListener(onClickListener);
    }
}