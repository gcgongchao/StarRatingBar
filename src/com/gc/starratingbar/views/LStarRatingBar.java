package com.gc.starratingbar.views;

import com.gc.starratingbar.R;
import com.gc.starratingbar.constants.StarContants;
import com.gc.starratingbar.effect.AlphaAnimation;
import com.gc.starratingbar.effect.ScaleAnimation;
import com.gc.starratingbar.effect.TranslationAnimation;

import android.R.integer;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
/**
 * 
 * @author GeneralAndroid
 * @function The Custom RatingBar has a series of animations;
 * @time 2015/07/27
 */
@SuppressLint({ "Recycle", "NewApi" }) 
public class LStarRatingBar extends LinearLayout{

	private Context mContext;

	/**
	 * ����ֵ�Ĳ�ͬӦ�ò�ͬ�Ķ���Ч��
	 */
	private int animationEffect;
	/**
	 * ����δѡ�е�ͼƬ��Դ
	 */
	private Drawable starUnselect;
	/**
	 * ����ѡ�е�ͼƬ��Դ
	 */
	private Drawable starSelected;
	/**
	 * ����ѡ�е���������
	 */
	private int starSelectedNum;
	private ImageView mIvStarOne,mIvStarSecond,mIvStarThree,mIvStarFour,mIvStarFive;
	private  Handler mHandler=new Handler()
	{

		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			super.handleMessage(msg);
			startAnimation(msg.what);
		}
		
	};
	public LStarRatingBar(Context context) {
		this(context, null);
		
	}

	public LStarRatingBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.mContext=context;
		TypedArray mTypedArray=context.obtainStyledAttributes(attrs, R.styleable.LStarRatingBar);
		//��ȡ�Զ������Ե�ֵ
//		orientation=mTypedArray.getInt(R.styleable.LStarRatingBar_orientation, 0);
		animationEffect=mTypedArray.getInt(R.styleable.LStarRatingBar_animationEffect, 0);
		starUnselect=mTypedArray.getDrawable(R.styleable.LStarRatingBar_starUnselect);
		starSelected=mTypedArray.getDrawable(R.styleable.LStarRatingBar_starSelected);
		starSelectedNum=mTypedArray.getInt(R.styleable.LStarRatingBar_starSelectedNum, 0);
		initView();
		startAnimation(0);
	}
	private void  initView()
	{
		removeAllViews();
		mIvStarOne=new ImageView(mContext);
		mIvStarOne.setBackground(starUnselect);
		mIvStarSecond=new ImageView(mContext);
		mIvStarSecond.setBackground(starUnselect);
		mIvStarThree=new ImageView(mContext);
		mIvStarThree.setBackground(starUnselect);
		mIvStarFour=new ImageView(mContext);
		mIvStarFour.setBackground(starUnselect);
		mIvStarFive=new ImageView(mContext);
		mIvStarFive.setBackground(starUnselect);
		LayoutParams mLayoutParams=new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		mLayoutParams.setMargins(10, 10,10, 10);
		if(animationEffect==StarContants.scaleEffect)
		{
			mLayoutParams.bottomMargin=30;
			mLayoutParams.topMargin=30;
		}
		
		this.addView(mIvStarOne, mLayoutParams);
		this.addView(mIvStarSecond, mLayoutParams);
		this.addView(mIvStarThree, mLayoutParams);
		this.addView(mIvStarFour, mLayoutParams);
		this.addView(mIvStarFive, mLayoutParams);
		
	}
	private void startAnimation(int index)
	{
		switch (animationEffect) {
		case StarContants.defEffect:
			
			break;
		case StarContants.scaleEffect:
//			this.setPadding(20, 20, 20, );
//			LayoutParams mLayoutParams=(LayoutParams) this.getLayoutParams();
//			mLayoutParams.bottomMargin=20;
//			mLayoutParams.topMargin=20;
//			setLayoutParams(mLayoutParams);
			
			switch (index) {
			case 0:
				ScaleAnimation.startAnimation(mIvStarOne, 360, 0,mHandler,starSelectedNum);
				break;
			case 1:
				ScaleAnimation.startAnimation(mIvStarSecond, 360, 1,mHandler,starSelectedNum);
				break;
			case 2:
				ScaleAnimation.startAnimation(mIvStarThree, 360, 2,mHandler,starSelectedNum);
				break;
			case 3:
				ScaleAnimation.startAnimation(mIvStarFour, 360, 3,mHandler,starSelectedNum);
				break;
			case 4:
				ScaleAnimation.startAnimation(mIvStarFive, 360, 4,mHandler,starSelectedNum);
				break;
				

			default:
				break;
			}
			break;
		case StarContants.alphaEffect:
			switch (index) {
			case 0:
				AlphaAnimation.startAnimation(mIvStarOne, 720, 0,mHandler,starSelectedNum);
				break;
			case 1:
				AlphaAnimation.startAnimation(mIvStarSecond, 720, 1,mHandler,starSelectedNum);
				break;
			case 2:
				AlphaAnimation.startAnimation(mIvStarThree, 720, 2,mHandler,starSelectedNum);
				break;
			case 3:
				AlphaAnimation.startAnimation(mIvStarFour, 720, 3,mHandler,starSelectedNum);
				break;
			case 4:
				AlphaAnimation.startAnimation(mIvStarFive, 720, 4,mHandler,starSelectedNum);
				break;
				

			default:
				break;
			}
			break;
		case StarContants.translationEffect:
			switch (index) {
			case 0:
				TranslationAnimation.startAnimation(mIvStarOne, 720, 0,mHandler,starSelectedNum);
				break;
			case 1:
				TranslationAnimation.startAnimation(mIvStarSecond, 720, 1,mHandler,starSelectedNum);
				break;
			case 2:
				TranslationAnimation.startAnimation(mIvStarThree, 720, 2,mHandler,starSelectedNum);
				break;
			case 3:
				TranslationAnimation.startAnimation(mIvStarFour, 720, 3,mHandler,starSelectedNum);
				break;
			case 4:
				TranslationAnimation.startAnimation(mIvStarFive, 720, 4,mHandler,starSelectedNum);
				break;
				

			default:
				break;
			}
			break;
		default:
			break;
		}
	}
	

}
