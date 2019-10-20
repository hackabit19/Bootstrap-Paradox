package com.nikki.hack;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.content.pm.PackageManager;
import android.app.DownloadManager;

public class DownloadActivity extends AppCompatActivity {

    private static final int PERMISSION_STORAGE_CODE = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
                //String permissions[] = (Manifest.permission.WRITE_EXTERNAL_STORAGE);
                //requestPermissions(permissions, PERMISSION_STORAGE_CODE);
            }
            else{

            }
        }
        else{

        }

        }


}
