package com.gc.starratingbar.effect;



import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
/**
 * 
 * @author Android将军
 * @function  先放大在缩小
 */
public class ScaleAnimation {

	public static void startAnimation(final View object,int duration)
	{
		AnimatorSet set = new AnimatorSet();
		set.playTogether(
				ObjectAnimator.ofFloat(object, "scaleX", 1, 2f),
				ObjectAnimator.ofFloat(object, "scaleY", 1, 2f),
				ObjectAnimator.ofFloat(object, "scaleX", 2f, 1f),
				ObjectAnimator.ofFloat(object, "scaleY", 2f, 1f)

		);
		set.addListener(new AnimatorListener() {
			@Override
			public void onAnimationStart(Animator animation) {
//				object.setBackgroundResource(R.drawable.star_bottom);
			}
			@Override
			public void onAnimationRepeat(Animator animation) {
				
			}
			@Override
			public void onAnimationEnd(Animator animation) {
				
//				object.setBackgroundResource(R.drawable.star_top);
//				if(index>rating)
//				{
//					
//				}else {
//					handler.sendEmptyMessage(index);
//				}
//			
			}

			@Override
			public void onAnimationCancel(Animator animation) {
			}
		});

		set.setDuration(duration).start();
	}
}
