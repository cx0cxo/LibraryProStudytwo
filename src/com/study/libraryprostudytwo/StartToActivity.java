package com.study.libraryprostudytwo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.study.libraryprostudytwo.model.BookAdapter;
import com.study.libraryprostudytwo.view.MainBar;
import com.study.libraryprostudytwo.view.TitleBar;

public class StartToActivity extends Activity {

	private BookAdapter adapter;
	private ListView mLiewView;
	private MainBar mMainBar;
	private TitleBar mTitleBar;
	private TitleBar bar1;
	private TitleBar bar2;
	private TitleBar bar3;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_to);
		mMainBar = new MainBar(this);
		mTitleBar = new TitleBar(this);
		mLiewView = (ListView) findViewById(R.id.lv_listview);
		adapter = new BookAdapter(this);
		mLiewView.addHeaderView(mMainBar);
		mLiewView.addHeaderView(mTitleBar);
		bar1 = new TitleBar(this);
		bar1.setTitle("当前借阅");
		bar2 = new TitleBar(this);
		bar2.setTitle("以往借阅");
		bar3 = new TitleBar(this);
		bar3.setTitle("我的收藏");
		mLiewView.addFooterView(bar1);
		mLiewView.addFooterView(bar2);
		mLiewView.addFooterView(bar3);
		mLiewView.setAdapter(adapter);
		
	}
}
