package com.why.project.logcathelperdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.why.project.logcathelperdemo.logcathelper.LogcatHelper;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.v("MainActivity", "这是V日志");
		Log.d("MainActivity", "这是D日志");
		Log.i("MainActivity", "这是I日志");
		Log.w("MainActivity", "这是W日志");
		Log.e("MainActivity", "这是E日志");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();

		//使用完后，调用stop
		LogcatHelper.getInstance(getApplicationContext()).stop();
	}
}
