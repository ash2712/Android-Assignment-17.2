package com.example.ayush.timeapp;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public class timeService extends Service {
    public timeService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getTime(){
        Calendar cc = Calendar.getInstance();
        int mYear = cc.get(Calendar.YEAR);
        int mMonth = cc.get(Calendar.MONTH);
        int mDate = cc.get(Calendar.DATE);
        int mHour = cc.get(Calendar.HOUR_OF_DAY);
        int mMinute = cc.get(Calendar.MINUTE);
        int mSecond = cc.get(Calendar.SECOND);
        //gets the current date and time
        String finalTime = "Date = " + mYear + "/"+ mMonth + "/" + mDate +"\n" + "Time = " + mHour + ":" + mMinute + ":" + mSecond;
        //returns all the values in the form of one string
        return finalTime;
    }
}
