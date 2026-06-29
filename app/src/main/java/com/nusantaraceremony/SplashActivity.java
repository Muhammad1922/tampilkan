package com.nusantaraceremony;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Build splash layout
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.parseColor("#8B4513"));
        layout.setLayoutParams(new ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        ));

        // Flower emoji as logo placeholder
        TextView logo = new TextView(this);
        logo.setText("🌺");
        logo.setTextSize(80);
        logo.setGravity(Gravity.CENTER);
        layout.addView(logo);

        // App name
        TextView appName = new TextView(this);
        appName.setText("NUSANTARA CEREMONY");
        appName.setTextSize(22);
        appName.setTextColor(Color.parseColor("#D4AF37"));
        appName.setGravity(Gravity.CENTER);
        appName.setPadding(0, 20, 0, 8);
        // Set typeface bold
        appName.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        layout.addView(appName);

        // Tagline
        TextView tagline = new TextView(this);
        tagline.setText("Keanggunan Tradisi Nusantara");
        tagline.setTextSize(13);
        tagline.setTextColor(Color.parseColor("#F5DEB3"));
        tagline.setGravity(Gravity.CENTER);
        layout.addView(tagline);

        setContentView(layout);

        // Navigate to MainActivity after 2 seconds
        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, 2000);
    }
}
