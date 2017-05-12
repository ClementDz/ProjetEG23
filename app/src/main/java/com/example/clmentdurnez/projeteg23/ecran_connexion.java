package com.example.clmentdurnez.projeteg23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ecran_connexion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecran_connexion);

        // bouton "se connecter"
        final Button listeCourseButton = (Button) findViewById(R.id.button5);
        // Création d’un évènement qui attend un clic sur le bouton
        listeCourseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(ecran_connexion.this, Accueil.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });

        // bouton "inscription"
        final Button listeCourseButton2 = (Button) findViewById(R.id.button6);
        // Création d’un évènement qui attend un clic sur le bouton
        listeCourseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(ecran_connexion.this, inscription.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });


    }
}
