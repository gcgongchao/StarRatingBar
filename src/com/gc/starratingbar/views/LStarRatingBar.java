package com.gc.starratingbar.views;

import com.gc.starratingbar.R;

import android.R.integer;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/**
 * 
 * @author Android将军
 * @function 水平或垂直的自定义RatingBar
 * @time 2015/07/27
 */
@SuppressLint("Recycle") 
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
	}
	
	

}
