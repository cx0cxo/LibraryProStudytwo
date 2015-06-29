package com.study.libraryprostudytwo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.study.libraryprostudytwo.R;

public class TitleBar extends LinearLayout {

	private ImageView mImgView;
	private TextView mTitle;
	
	public TitleBar(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context);
	}

	

	public TitleBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}
	
	public TitleBar(Context context) {
		super(context);
		init(context);
	}
	
	private void init(Context context) {
		LayoutInflater infalter = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		infalter.inflate(R.layout.title_bar, this);
		mTitle = (TextView) findViewById(R.id.tv_title);
	}



	public ImageView getImgView() {
		return mImgView;
	}



	public void setImgView(ImageView imgView) {
		mImgView = imgView;
	}



	public void setTitle(String title) {
		mTitle.setText( title);
	}

}
