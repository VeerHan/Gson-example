package com.leohan.gsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    /**
     * json数据示例
     */
    private final static String jsonStr = "{ \"code\": 0, \"msg\": \"轮播会议获取成功\", \"records\": [ { \"joinNumber\": 3, \"id\": 10, \"startDateStr\": \"2016-10-26 09:00 星期三\", \"theme\": \"2016年度海外高层次人群聚会\" }, { \"joinNumber\": 3, \"id\": 1, \"startDateStr\": \"2016-10-24 08:00 星期一\", \"theme\": \"2016年度苏州医疗会议\" } ] }";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        MeetingData meetingData = gson.fromJson(jsonStr, MeetingData.class);

        List<MeetingData.RecordsEntity> records = meetingData.getRecords();
        int code = meetingData.getCode();
        String msg = meetingData.getMsg();

        Log.d("test", "records = " + records);
        Log.d("test", "code = " + code);
        Log.d("test", "msg = " + msg);
    }
}
