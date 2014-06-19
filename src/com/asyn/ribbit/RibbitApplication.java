package com.asyn.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {

	@Override
	public void onCreate() {
		Parse.initialize(this, "lkRUYkS8tFClLvwJMz4OzCemoTj07NrsrLwiQv9H",
				"5WyV93Sl6w2jjKPTl4M5B92REGpft3qOnaizDN8U");
		
		
	}

}
