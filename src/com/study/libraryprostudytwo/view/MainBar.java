package com.study.libraryprostudytwo.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.study.libraryprostudytwo.R;

public class MainBar extends LinearLayout {

	private ImageButton mSetting;
	private ImageButton mNotiy;
	private TextView mUserName;
	private TextView mBookNumber;
	private TextView mForgeatNumber;
	private Context mContext;
	
	
	public MainBar(Context context) {
		super(context);
		
		init(context);
	}

	public MainBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	@SuppressLint("NewApi")
	public MainBar(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context);
	}

	private void init(Context context) {

		mContext = context;
		LayoutInflater inflat = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflat.inflate(R.layout.main_bar, this);
		mSetting = (ImageButton) findViewById(R.id.img_setting);
		mNotiy = (ImageButton) findViewById(R.id.img_notiy);
		mUserName = (TextView) findViewById(R.id.tv_user_name);
		mBookNumber = (TextView) findViewById(R.id.tv_book_number);
		mForgeatNumber = (TextView) findViewById(R.id.tv_forgeatbooknumber);
	}

	public void setNotiyListener(OnClickListener listener){
		mNotiy.setOnClickListener(listener);
	}
	
	public void setSettingListener(OnClickListener listener){
		mSetting.setOnClickListener(listener);
	}
	
	public void setSettingMode(boolean checked){
		if(checked){
			mSetting.setImageResource(R.drawable.newsetting);
		}else{
			mSetting.setImageResource(R.drawable.newsetting2);
		}
	}
	
	public void setNotiyMode(boolean checked){
		if(checked){
			mNotiy.setImageResource(R.drawable.notiy);
		}else{
			mNotiy.setImageResource(R.drawable.nonotiy);
		}
	}
	
	public void setUserName(String name){
		mUserName.setText(name);
	}
	
	public void setBookNum(int num){
		mBookNumber.setText(num + "");
	}
	
	public void setForgeatBookNum(int num){
		mForgeatNumber.setText(num + "±¾");
	}
	
}
