package com.study.libraryprostudytwo.model;

import java.util.UUID;

import com.study.libraryprostudytwo.R;

import android.graphics.Bitmap;

public class Book {

	public static final int BOOK_HAD_READ = 1;
	public static final int BOOK_CAN_HAVE = 2;
	public static final int BOOK_HAD = 3;
	
	private int mType;
	private int mNumber = 0;
	private UUID mBookId;
	private String mBookTitle;
	private String mBookAithor;
	private String mChuBanShe;
	private String mIndexNumber;
	private int mDefaultPicResource = R.drawable.b18035_m;
	
	public Book() {
		mBookId = UUID.randomUUID();
	}
	
	public Book(UUID bookId, String bookTitle,
			String bookAithor, String chuBanShe, String indexNumber
			) {
		mType = BOOK_CAN_HAVE;
		mNumber = 1;
		mBookId = bookId;
		mBookTitle = bookTitle;
		mBookAithor = bookAithor;
		mChuBanShe = chuBanShe;
		mIndexNumber = indexNumber;
		
	}
	
	
	public Book(int type, int number, UUID bookId, String bookTitle,
			String bookAithor, String chuBanShe, String indexNumber,
			int defaultPicResource) {
		super();
		mType = type;
		mNumber = number;
		mBookId = bookId;
		mBookTitle = bookTitle;
		mBookAithor = bookAithor;
		mChuBanShe = chuBanShe;
		mIndexNumber = indexNumber;
		mDefaultPicResource = defaultPicResource;
	}
	public int getNumber() {
		return mNumber;
	}
	public void setNumber(int number) {
		mNumber = number;
	}
	public int getType() {
		return mType;
	}
	public void setType(int type) {
		mType = type;
	}
	public UUID getBookId() {
		return mBookId;
	}
	public void setBookId(UUID bookId) {
		mBookId = bookId;
	}
	public String getBookTitle() {
		return mBookTitle;
	}
	public void setBookTitle(String bookTitle) {
		mBookTitle = bookTitle;
	}
	public String getBookAithor() {
		return mBookAithor;
	}
	public void setBookAithor(String bookAithor) {
		mBookAithor = bookAithor;
	}
	public String getChuBanShe() {
		return mChuBanShe;
	}
	public void setChuBanShe(String chuBanShe) {
		mChuBanShe = chuBanShe;
	}
	public String getIndexNumber() {
		return mIndexNumber;
	}
	public void setIndexNumber(String indexNumber) {
		mIndexNumber = indexNumber;
	}
	public int getDefaultPicResource() {
		return mDefaultPicResource;
	}
	public void setDefaultPicResource(int defaultPicResource) {
		mDefaultPicResource = defaultPicResource;
	}
	
	
}
