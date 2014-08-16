package com.example.class_aug13_objanim;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class ObjAnimActivity extends Activity {

	TextView txt1;
	TextView txt2;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_obj_anim);
		txt1 = (TextView) findViewById(R.id.txt1);
		txt2 = (TextView) findViewById(R.id.txt2);
		// 旋转
		// ObjectAnimator objAni = ObjectAnimator.ofFloat(txt1, "rotation", 0f,
		// 360f);
		// objAni.setDuration(2000);
		// objAni.start();
		// ObjectAnimator objAni2 = ObjectAnimator.ofFloat(txt2, "rotationX",
		// 0f,
		// 270f);
		// objAni2.setDuration(2000);
		// objAni2.start();

		// 透明
		// ObjectAnimator objAni = ObjectAnimator.ofFloat(txt1, "alpha", 0f,
		// 1f);
		// objAni.setDuration(2000);
		// objAni.start();
		// ObjectAnimator objAni2 = ObjectAnimator.ofFloat(txt2, "alpha", 0f,
		// 0.5f);
		// objAni2.setDuration(2000);
		// objAni2.start();

		// 放大缩小
		ObjectAnimator objAni = ObjectAnimator.ofFloat(txt1, "scaleX", 1f, 2f);
		objAni.setDuration(2000);
		objAni.start();
		ObjectAnimator objAni2 = ObjectAnimator
				.ofFloat(txt2, "scaleY", 0f, 0.5f);
		objAni2.setDuration(2000);
		objAni2.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.obj_anim, menu);
		return true;
	}

}
