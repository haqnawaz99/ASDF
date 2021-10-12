package haqnawaz.org.asdf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class FontActivity extends AppCompatActivity {
    TextView textViewArabic, textViewUrdu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font);

        textViewArabic = findViewById(R.id.textViewArabic);
        textViewUrdu = findViewById(R.id.textViewUrdu);

        Typeface arabicFont = Typeface.createFromAsset(getAssets(), "fonts/noorehuda.ttf" );
        Typeface urduFont = Typeface.createFromAsset(getAssets(), "fonts/nastaleeq.ttf" );

        textViewArabic.setTypeface(arabicFont);
        textViewUrdu.setTypeface(urduFont);

;    }
}