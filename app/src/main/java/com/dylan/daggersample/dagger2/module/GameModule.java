package com.dylan.daggersample.dagger2.module;

import com.dylan.daggersample.data.GameData;

import dagger.Module;
import dagger.Provides;

@Module
public class GameModule {

    @Provides
    GameData providesGameData() {
        return new GameData();
    }
}
