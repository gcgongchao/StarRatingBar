package com.gc.starratingbar.effect;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator.AnimatorListener;
import android.os.Handler;
import android.view.View;

import com.gc.starratingbar.R;

public class AlphaAnimation {
	public  static void startAnimation(final View object,int duration,final int index,final Handler mHandler,final int starNum)
	{
		AnimatorSet set = new AnimatorSet();
		set.playTogether(
				ObjectAnimator.ofFloat(object, "alpha", 0, 1f),
				ObjectAnimator.ofFloat(object, "alpha", 1f, 0),
				ObjectAnimator.ofFloat(object, "alpha", 0, 1f)
//				ObjectAnimator.ofFloat(object, "scaleX", 2f, 1f),
//				ObjectAnimator.ofFloat(object, "scaleY", 2f, 1f)

		);
		set.addListener(new AnimatorListener() {
			@Override
			public void onAnimationStart(Animator animation) {
				object.setBackgroundResource(R.drawable.star_bottom);
			}
			@Override
			public void onAnimationRepeat(Animator animation) {
				
			}
			@Override
			public void onAnimationEnd(Animator animation) {
				
				object.setBackgroundResource(R.drawable.star_top);
				if(index>(starNum-2))
				{
//					
				}else {
					mHandler.sendEmptyMessage(index+1);
				}
//			
			}

			@Override
			public void onAnimationCancel(Animator animation) {
			}
		});

		set.setDuration(duration).start();
	}
}
