package net.yuzumone.twltrus.tdr.di

import dagger.Component
import dagger.android.AndroidInjector
import net.yuzumone.twltrus.tdr.App
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    ActivityModule::class
])
interface ApplicationComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<App>()
}