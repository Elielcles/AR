package com.elielcles.ar;

import android.os.Bundle;
import android.widget.FrameLayout;

import org.artoolkit.ar6.base.ARActivity;
import org.artoolkit.ar6.base.rendering.ARRenderer;

/**
 * Created by Elielcles on 26/10/2017.
 */

public class ARTrackigActivy extends ARActivity {
    @Override
    public void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.main);


    }



    @Override
    protected ARRenderer supplyRenderer() {

        return new ARTrackingRenderer();
    }

    @Override
    protected FrameLayout supplyFrameLayout() {
        return (FrameLayout) this.findViewById(R.id.mainLayout);
    }
}
