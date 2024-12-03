package com.example.tp2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import model.Country;


public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView; // La vue pour afficher la liste
    private RecyclerView.Adapter adapter; // L'adaptateur pour lier les données à la vue
    private RecyclerView.LayoutManager layoutManager; // Le gestionnaire de mise en page

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initialiser le RecyclerView
        recyclerView = findViewById(R.id.recycler_view); // ID défini dans votre layout XML
        recyclerView.setHasFixedSize(true); // Optimisation si la taille des éléments est fixe

        // Initialiser le LayoutManager
        layoutManager = new LinearLayoutManager(this); // Affiche les éléments en liste verticale
        recyclerView.setLayoutManager(layoutManager);

        // Préparer les données (liste des pays)
        List<Country> countryList = getCountryData();

        // Initialiser l'Adapter
        adapter = new CountryAdapter(countryList); // Utiliser votre adaptateur personnalisé
        recyclerView.setAdapter(adapter); // Connecter l'adaptateur au RecyclerView
    }

    // Méthode pour générer une liste d'exemple de pays
    private List<Country> getCountryData() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("France", "République Française", "Paris",
                "EUR", "Euro", "€", 48.8566, 2.3522, "https://example.com/france.png"));
        countries.add(new Country("USA", "United States of America", "Washington D.C.",
                "USD", "Dollar", "$", 38.9072, -77.0369, "https://example.com/usa.png"));
        countries.add(new Country("Japan", "Nippon", "Tokyo",
                "JPY", "Yen", "¥", 35.6895, 139.6917, "https://example.com/japan.png"));

        return countries;
    }

}
