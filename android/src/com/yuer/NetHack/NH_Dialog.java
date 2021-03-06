package com.yuer.NetHack;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class NH_Dialog extends AlertDialog
{
	private final View mTag;

	public NH_Dialog(Context context, View tag)
	{
		super(context);
		mTag = tag;
	}

	public View getTag() {
		return mTag;
	}
/*
	public NH_Dialog(Context context, int theme)
	{
		super(context, theme);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}*/
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
	}

	public void setPositiveButton(String string, OnClickListener onClickListener)
	{
		setButton(DialogInterface.BUTTON_POSITIVE, string, onClickListener);
	}

	public void setNegativeButton(String string, OnClickListener onClickListener)
	{
		setButton(DialogInterface.BUTTON_NEGATIVE, string, onClickListener);
	}

	public void setNeutralButton(String string, OnClickListener onClickListener)
	{
		setButton(DialogInterface.BUTTON_NEUTRAL, string, onClickListener);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		if(keyCode == KeyEvent.KEYCODE_VOLUME_UP || keyCode == KeyEvent.KEYCODE_VOLUME_DOWN)
			return true;
		return super.onKeyDown(keyCode, event);
	};

	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		if(keyCode == KeyEvent.KEYCODE_VOLUME_UP || keyCode == KeyEvent.KEYCODE_VOLUME_DOWN)
			return true;
		return super.onKeyUp(keyCode, event);
	};
}
