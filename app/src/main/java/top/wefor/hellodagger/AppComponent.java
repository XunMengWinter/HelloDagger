package top.wefor.hellodagger;

import dagger.Component;

/**
 * Created on 16/6/13 17:27.
 *
 * @author ice, GitHub: https://github.com/XunMengWinter
 */
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}