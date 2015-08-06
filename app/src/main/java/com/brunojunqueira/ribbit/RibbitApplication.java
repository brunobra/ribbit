package com.brunojunqueira.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by brunojunqueira on 05/08/15.
 */
public class RibbitApplication extends Application {

    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "0GZyadQYTFDESyeOcSnenCKSMTKiJpMm6z0vtwnu", "0NcdYslG2sAjLd60WTth9cMbsuAwcruNllFCdPJR");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }

}
