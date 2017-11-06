package co.edu.uniquindio.android.electiva.looneytunes.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import co.edu.uniquindio.android.electiva.looneytunes.Fragments.ElmerFragment;
import co.edu.uniquindio.android.electiva.looneytunes.R;

public class ElmerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elmer);

        ElmerFragment detallePersonajeElmer = (ElmerFragment) getSupportFragmentManager().findFragmentById(R.id.fragmento_elmer);

    }

}
