package com.example.pandadesktop4.greendaooo;

import android.app.Application;

import com.example.pandadesktop4.greendaooo.db.DaoMaster;
import com.example.pandadesktop4.greendaooo.db.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by pandadesktop4 on 1/8/17.
 */
public class AppController extends Application {


    public static final boolean ENCRYPTED=true;
    private DaoSession daoSession;

    @Override
    public void onCreate()
    {
        super.onCreate();
        DaoMaster.DevOpenHelper helper= new DaoMaster.DevOpenHelper(this,"users-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }


    public DaoSession getDaoSession()
    {
        return daoSession;
    }
}
