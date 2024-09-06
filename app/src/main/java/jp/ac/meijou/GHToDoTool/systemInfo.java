package jp.ac.meijou.GHToDoTool;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import jp.ac.meijou.GHToDoTool.databinding.ActivitySystemInfoBinding;

public class systemInfo extends AppCompatActivity {

    private ActivitySystemInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivitySystemInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // OSバージョン取得
        String osVersion = "Android" + Build.VERSION.RELEASE;
        binding.osVersion.setText(osVersion);

        // 端末名を取得
        String deviceName = Build.MODEL;
        binding.devicename.setText(deviceName);
    }
}