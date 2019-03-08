package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText text = (EditText)findViewById(R.id.editText2);

        final Button b1 = (Button)findViewById(R.id.button1);
        final Button b2 = (Button)findViewById(R.id.button2);
        final Button b3 = (Button)findViewById(R.id.button3);
        final Button b4 = (Button)findViewById(R.id.button4);
        final Button b5 = (Button)findViewById(R.id.button5);
        final Button b6 = (Button)findViewById(R.id.button6);
        final Button b7 = (Button)findViewById(R.id.button7);
        final Button b8 = (Button)findViewById(R.id.button8);
        final Button b9 = (Button)findViewById(R.id.button9);
        final Button b10 = (Button)findViewById(R.id.button10);
        final Button b11 = (Button)findViewById(R.id.button11);
        final Button b12 = (Button)findViewById(R.id.button12);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String str = b1.getText().toString();
                text.setText(str);
            }

        });

    }


}
