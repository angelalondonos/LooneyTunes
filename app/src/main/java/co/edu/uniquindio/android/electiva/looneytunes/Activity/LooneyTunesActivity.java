package co.edu.uniquindio.android.electiva.looneytunes.Activity;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import co.edu.uniquindio.android.electiva.looneytunes.R;

/**
 * @author Angela Londoño
 * @author Rodrigo Ramirez
 * @author Cristian Agudelo
 *
 */

public class LooneyTunesActivity extends AppCompatActivity {

    public DrawerLayout drawerLayout;
    public NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looney_tunes);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_nav_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        navView = (NavigationView)findViewById(R.id.navview);
        navView.setItemIconTintList(null);

    }

}
