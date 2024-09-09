package jp.ac.meijou.GHToDoTool;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import jp.ac.meijou.GHToDoTool.databinding.ActivityLinkSettingBinding;
import jp.ac.meijou.GHToDoTool.databinding.ActivityNotificationSettingBinding;

public class notificationSetting extends AppCompatActivity {

    private ActivityNotificationSettingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityNotificationSettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ナビゲーションバーここから
        binding.homeIcon.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        binding.scheduleIcon.setOnClickListener(view -> {
            Intent intent = new Intent(this, TimeTableActivity.class);
            startActivity(intent);
        });

        binding.linkIcon.setOnClickListener(view -> {
            Intent intent = new Intent(this, LinkPage.class);
            startActivity(intent);
        });

        binding.settingIcon.setOnClickListener(view -> {
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);
        });
        // ナビゲーションバーここまで
    }
}