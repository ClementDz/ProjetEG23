package com.example.clmentdurnez.projeteg23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activites);

        // bouton "ex specifique"
        final Button listeCourseButton = (Button) findViewById(R.id.button2);
        // Création d’un évènement qui attend un clic sur le bouton
        listeCourseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(Activites.this, exercice_specifique.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });

        // bouton "ex 1h"
        final Button listeCourseButton2 = (Button) findViewById(R.id.button3);
        // Création d’un évènement qui attend un clic sur le bouton
        listeCourseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(Activites.this, Exercice_1_h.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });

    }
}
