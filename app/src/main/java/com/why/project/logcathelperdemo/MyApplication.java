package com.why.project.logcathelperdemo;

import android.app.Application;

import com.why.project.logcathelperdemo.logcathelper.LogcatHelper;

/**
 * Created by HaiyuKing
 * Used 自定义application
 */

public class MyApplication extends Application{
	@Override
	public void onCreate() {
		super.onCreate();
		//在应用中start LogcatHelper
		LogcatHelper.getInstance(this).start();
	}

	@Override
	public void onTerminate() {
		super.onTerminate();
		//在应用中stop LogcatHelper
		LogcatHelper.getInstance(this).stop();
	}

	@Override
	public void onTrimMemory(int level) {
		super.onTrimMemory(level);
	}

}
