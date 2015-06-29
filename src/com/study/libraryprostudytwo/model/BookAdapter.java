package com.study.libraryprostudytwo.model;

import java.util.ArrayList;
import java.util.List;

import com.study.libraryprostudytwo.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class BookAdapter extends BaseAdapter {

	private List<Book> booklist;
	private Context mContect;
	
	public BookAdapter(List<Book> booklist, Context contect) {
		super();
		this.booklist = booklist;
		mContect = contect;
	}

	public BookAdapter(Context contect) {
		super();
		mContect = contect;
		Book book = new Book();
		book.setBookTitle("这是第一本书");
		Book book1 = new Book();
		book1.setBookTitle("这是第二本书");
		booklist  = new ArrayList<Book>();
		booklist.add(book);
		booklist.add(book1);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return booklist.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return booklist.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View view, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if(view == null){
			holder = new ViewHolder();
			view = View.inflate(mContect, R.layout.item_bar_layout, null);
			holder.title = (TextView) view.findViewById(R.id.tv_title);
			view.setTag(holder);
		}else{
			holder = (ViewHolder) view.getTag();
		}
		//holder.title.setText(booklist.get(position).getBookTitle() + "timo");
		return view;
	}
	
	class ViewHolder{
		TextView title;
	}

}
