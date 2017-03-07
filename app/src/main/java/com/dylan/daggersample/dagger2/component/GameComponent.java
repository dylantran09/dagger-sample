package com.dylan.daggersample.dagger2.component;

import com.dylan.daggersample.dagger2.module.GameModule;
import com.dylan.daggersample.session.GameSession;

import dagger.Component;

@Component(modules = GameModule.class)
public interface GameComponent {
    void inject(GameSession session);
}
