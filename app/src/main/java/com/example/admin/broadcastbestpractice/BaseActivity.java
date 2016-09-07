package com.example.admin.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by admin on 2016/9/7.
 */
public class BaseActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
