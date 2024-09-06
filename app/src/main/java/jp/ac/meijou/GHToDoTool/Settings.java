package jp.ac.meijou.GHToDoTool;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import jp.ac.meijou.GHToDoTool.databinding.ActivitySettingsBinding;
import jp.ac.meijou.GHToDoTool.databinding.ActivitySystemInfoBinding;

public class Settings extends AppCompatActivity {

    private ActivitySettingsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // 情報ボタンでシステム情報ページに遷移
        binding.systemInfo.setOnClickListener(view ->{
            Intent intent = new Intent(this, systemInfo.class);
            startActivity(intent);
        });

        // リンクの編集画面へ遷移
        binding.linkSetting.setOnClickListener(view -> {
            Intent intent = new Intent(this, linkSetting.class);
            startActivity(intent);
        });


        // ナビゲーションバーここから
        binding.homeIcon.setOnClickListener(view -> {
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);
        });

        binding.scheduleIcon.setOnClickListener(view -> {
            Intent intent = new Intent(this, Settings.class);
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