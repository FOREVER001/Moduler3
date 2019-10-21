package com.tianzhuan.net_moduler;

import com.tianzhuan.common.RecordPathManager;
import com.tianzhuan.common.base.BaseApplication;
import com.tianzhuan.order.Order_MainActivity;
import com.tianzhuan.personal.Personal_MainActivity;

public class AppApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        RecordPathManager.joinGroup("app","MainActivity",MainActivity.class);
        RecordPathManager.joinGroup("order","Order_MainActivity", Order_MainActivity.class);
        RecordPathManager.joinGroup("personal","Personal_MainActivity", Personal_MainActivity.class);
    }
}
