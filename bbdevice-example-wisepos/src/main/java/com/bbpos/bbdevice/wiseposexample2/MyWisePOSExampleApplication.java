package com.bbpos.bbdevice.wiseposexample2;

import android.app.Application;
import org.acra.*;
import org.acra.annotation.*;

//@ReportsCrashes(formUri = "http://www.backendofyourchoice.com/reportpath")

@ReportsCrashes(mailTo = "johnfu@bbpos.com",
        customReportContent = { ReportField.APP_VERSION_CODE, ReportField.APP_VERSION_NAME, ReportField.ANDROID_VERSION, ReportField.PHONE_MODEL, ReportField.CUSTOM_DATA, ReportField.STACK_TRACE, ReportField.LOGCAT },
        mode = ReportingInteractionMode.SILENT)

public class MyWisePOSExampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // The following line triggers the initialization of ACRA
        ACRA.init(this);
    }
}