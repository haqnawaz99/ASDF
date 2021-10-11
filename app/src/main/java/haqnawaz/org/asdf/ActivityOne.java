package haqnawaz.org.asdf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    Button buttonIncrease, buttonDecrease, buttonReset;
    TextView textView;
    int counter= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        buttonIncrease = findViewById(R.id.btnIncrease);
        buttonDecrease = findViewById(R.id.btnDecrease);
        buttonReset = findViewById(R.id.btnReset);
        textView = findViewById(R.id.textViewCounter);

        buttonIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textView.setText(Integer.toString(counter));
            }
        });
    }

    public void ResetNumber(View view) {
        counter=0;
        textView.setText(Integer.toString(counter));
    }
}