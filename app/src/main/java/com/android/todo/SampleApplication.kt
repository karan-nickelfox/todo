package com.android.todo

import android.app.Application
import net.hockeyapp.android.CrashManager;
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule

class todoApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@todoApplication))
    }

    public void onCreate() {
        super.onCreate()

        CrashManager.register(this@todoApplication)
    }
}