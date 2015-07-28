package com.gc.starratingbar.views;

import com.gc.starratingbar.R;
import com.gc.starratingbar.constants.StarContants;

import android.R.integer;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
/**
 * 
 * @author Android将军
 * @function 水平或垂直的自定义RatingBar,最大星星数为5
 * @time 2015/07/27
 */
@SuppressLint({ "Recycle", "NewApi" }) 
public class LStarRatingBar extends LinearLayout{

	private Context mContext;
	/**
	 * 值为0时水平排列，值为1时垂直排列
	 */
	private int orientation;
	/**
	 * 根据值的不同应用不同的动画效果
	 */
	private int animationEffect;
	/**
	 * 设置未选中的图片资源
	 */
	private Drawable starUnselect;
	/**
	 * 设置选中的图片资源
	 */
	private Drawable starSelected;
	/**
	 * 设置选中的星星数量
	 */
	private int starSelectedNum;
	private ImageView mIvStarOne,mIvStarSecond,mIvStarThree,mIvStarFour,mIvStarFive;
	public LStarRatingBar(Context context) {
		this(context, null);
		
	}

	public LStarRatingBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.mContext=context;
		TypedArray mTypedArray=context.obtainStyledAttributes(attrs, R.styleable.LStarRatingBar);
		//读取自定义属性的值
		orientation=mTypedArray.getInt(R.styleable.LStarRatingBar_orientation, 0);
		animationEffect=mTypedArray.getInt(R.styleable.LStarRatingBar_animationEffect, 0);
		starUnselect=mTypedArray.getDrawable(R.styleable.LStarRatingBar_starUnselect);
		starSelected=mTypedArray.getDrawable(R.styleable.LStarRatingBar_starSelected);
		starSelectedNum=mTypedArray.getInt(R.styleable.LStarRatingBar_starSelectedNum, 0);
		initView();
		startAnimation();
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
		setOrientation(orientation);
		this.addView(mIvStarOne, mLayoutParams);
		this.addView(mIvStarSecond, mLayoutParams);
		this.addView(mIvStarThree, mLayoutParams);
		this.addView(mIvStarFour, mLayoutParams);
		this.addView(mIvStarFive, mLayoutParams);
		
	}
	private void startAnimation()
	{
		switch (animationEffect) {
		case StarContants.defEffect:
			
			break;
		case StarContants.scaleEffect:
			
			break;
		default:
			break;
		}
	}
	

}
