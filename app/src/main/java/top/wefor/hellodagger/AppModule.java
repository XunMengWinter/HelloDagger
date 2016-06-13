package top.wefor.hellodagger;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created on 16/6/13 17:21.
 *
 * @author ice, GitHub: https://github.com/XunMengWinter
 */
@Module
public class AppModule {

    @Provides
    String provideHello() {
        return "hello dagger";
    }

    @Provides
    @Named("hi")
    String provideHi() {
        return "hi dagger";
    }

}
