package com.blockpuzzle.game;

public class NativeLoader extends android.app.NativeActivity {
    static {
        System.loadLibrary("main");
    }
}
