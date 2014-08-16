package com.example.class_aug13_objanim;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class AnimSetActivity extends Activity {

	TextView txt1;
	TextView txt2;
	TextView txt3;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_anim_set);

		txt1 = (TextView) findViewById(R.id.txtSet1);
		txt2 = (TextView) findViewById(R.id.txtSet2);
		txt3 = (TextView) findViewById(R.id.txtSet3);

		// ObjectAnimator obj1 = ObjectAnimator.ofFloat(txt1, "y", 0f, 200f);
		// obj1.setInterpolator(new AccelerateInterpolator());
		// obj1.setRepeatCount(1);
		// obj1.setRepeatMode(ObjectAnimator.INFINITE);
		// ObjectAnimator obj2 = ObjectAnimator.ofFloat(txt2, "alpha", 0f, 1);
		//
		// txt1.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// Toast.makeText(AnimSetActivity.this, "aaa", Toast.LENGTH_SHORT)
		// .show();
		// }
		// });
		//
		// AnimatorSet animSet = new AnimatorSet();
		// animSet.playSequentially(obj1, obj2);
		// animSet.setDuration(3000);
		// animSet.start();

		// xml
		// ObjectAnimator animSet = (ObjectAnimator)
		// AnimatorInflater.loadAnimator(this,
		// R.animator.obj_anim);
		// animSet.setTarget(txt1);
		// animSet.start();
		Keyframe kf1 = Keyframe.ofFloat(0f, 0f);
		Keyframe kf2 = Keyframe.ofFloat(1f, 200f);
		PropertyValuesHolder p1 = PropertyValuesHolder.ofFloat("y", 0f, 100f);
		PropertyValuesHolder p2 = PropertyValuesHolder
				.ofKeyframe("y", kf1, kf2);
		ObjectAnimator objAnim = ObjectAnimator.ofPropertyValuesHolder(txt1,
				p1, p2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.anim_set, menu);
		return true;
	}

}
