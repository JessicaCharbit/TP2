package com.example.tp2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Définit le layout à afficher
        setContentView(R.layout.activity_main);

        // Applique les insets pour gérer les barres système (status bar, navigation bar, etc.)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Récupère les références des éléments de l'interface
        EditText etUsername = findViewById(R.id.editTextName);  // Change `etUsername` en `editTextName`
        EditText etPassword = findViewById(R.id.editTextPassword);  // Change `etPassword` en `editTextPassword`
        Button btnLogin = findViewById(R.id.loginButton);  // Change `btnLogin` en `loginButton`


        // Configure l'action du bouton de connexion
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                // Vérifie si le mot de passe et le nom d'utilisateur sont corrects
                //if (checkUserPass(username, password)) {
                 //   Toast.makeText(MainActivity.this, getString(R.string.login_success), Toast.LENGTH_SHORT).show();
               // } else {
                    Toast.makeText(MainActivity.this, getString(R.string.login_error), Toast.LENGTH_SHORT).show();
               // }
            }
        });
    }

    // Méthode pour vérifier le login et le mot de passe
    public boolean checkUserPass(String username, String password) {
        // Le mot de passe en dur dans le code
        String correctPassword = "JimMorrisson";

        // Vérifie si le mot de passe fourni est égal à celui en dur
        return password.equals(correctPassword);
    }
}
