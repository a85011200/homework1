package irdc.ex03_01.aclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView01 = findViewById(R.id.mytextview01);
        String str_1 = "I am a string given in res/values/strings.xml\n";
        String str_2 = "test 測試 android TextView";
        /*mTextView01.setText(str_2);*/
        /*mTextView01.setText(str_1+str_2);*/
    }
}
