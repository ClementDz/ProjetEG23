package com.example.clmentdurnez.projeteg23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        // Liaison entre l’objet graphique R.id.button et la variable listeCourseButton
        final Button listeCourseButton = (Button) findViewById(R.id.button7);
        // Création d’un évènement qui attend un clic sur le bouton
        listeCourseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(inscription.this, Accueil.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });

    }
}
