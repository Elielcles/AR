package com.elielcles.ar;

import android.app.Application;

import org.artoolkit.ar6.base.assets.AssetHelper;

/**
 * Created by Elielcles on 24/10/2017.
 */

public class ArExemplo extends Application {
    @Override
    public void onCreate () {
        super.onCreate();

        AssetHelper assetHelper = new AssetHelper (getAssets());
        assetHelper.cacheAssetFolder(this,"Data");
    }
}
