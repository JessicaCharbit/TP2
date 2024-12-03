package model;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder>
{
    private List<Country> countries = null;
    //Constructeur
    public CountryAdapter(List<Country> countries)
    {
        if(countries != null)
        {
            this.countries = countries;
        }
    }
    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.country_layout, parent, false);
        return new CountryViewHolder(view);
    }
    // Méthode pour afficher un coutry
    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position)
    {
        Country country = countries.get(position);
        holder.afficher(country);
    }
    //Simple méthode pour renvoyer la taille des données
    @Override
    public int getItemCount()
    {
        if(countries != null)

        return countries.size();
        return 0;
    }
}

