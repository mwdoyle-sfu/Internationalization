package com.example.matt.internationalization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButton(R.id.btnHello, R.string.hello_world);
        setupButton(R.id.btnBye, R.string.goodbye_world);

    }

    private void setupButton(int buttonId, final int messageId){
        Button btn = (Button) findViewById(buttonId);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) findViewById(R.id.txtMessage);
//                textView.setText(messageId);

                // Get string from strings.xml
                String message = getString(messageId);
                textView.setText(message);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate the menu; this adds to the action bar if it is present
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
