package haqnawaz.org.asdf;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {

    private LookAtMe lookAtMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lookAtMe = findViewById(R.id.lookme);

        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.one));
        // lookAtMe.setVideoPath("https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_480_1_5MG.mp4"); //to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}