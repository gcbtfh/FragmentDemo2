package android.demo.fpt.fragmentdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(String textTop, String textBottom){
        BottomFragment bottomFragment = (BottomFragment) this.getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.showText(textTop, textBottom);
    }
}
