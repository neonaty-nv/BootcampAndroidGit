package cl.bootcamp.sprint_m4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import cl.bootcamp.sprint_m4.databinding.ActivityContactoBinding;
import cl.bootcamp.sprint_m4.databinding.ActivityMainBinding;

public class Contacto extends AppCompatActivity {

    ActivityContactoBinding binding;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityContactoBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        whatsapp();
        webview();
        correo();
    }

    public void whatsapp() {
        binding.btnWsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriUrl = Uri.parse("https://wa.me/56967864294");
                intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
    }

    public void webview() {
        binding.btnBehance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriUrl = Uri.parse("https://www.behance.net/nathalyvargas");
                intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });
    }

    public void correo() {
        binding.btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SEND);

                email.setType("text/plain");
                email.putExtra(Intent.EXTRA_TEXT, binding.etEmail.getText());
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"n.vargasvillarroel@gmail.com"});
                startActivity(email);
            }
        });
    }
}