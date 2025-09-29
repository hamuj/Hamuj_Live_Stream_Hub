package com.hamuj.livestream;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("Hamuj Live Stream Hub\nMade by Hamuj Ventures\nEmail: hamujent@gmail.com\nPhone: +254 702 936 663");
        tv.setTextSize(18);
        tv.setPadding(20, 20, 20, 20);

        setContentView(tv);
    }
}
