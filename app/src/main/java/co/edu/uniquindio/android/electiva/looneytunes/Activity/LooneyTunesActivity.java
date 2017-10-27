package co.edu.uniquindio.android.electiva.looneytunes.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import co.edu.uniquindio.android.electiva.looneytunes.Fragments.HomeFragment;
import co.edu.uniquindio.android.electiva.looneytunes.R;

/**
 * @author Angela Londoño
 * @author Rodrigo Ramirez
 * @author Cristian Agudelo
 *
 */

public class LooneyTunesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private void remplazarFragmento(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,
                fragment).addToBackStack(null).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_seccion_1:
                remplazarFragmento(new HomeFragment());
                break;
            case R.id.menu_seccion_2:
                Log.i("NavigationView", "Pulsada seccion 2");
                break;
            case R.id.menu_seccion_3:
                Log.i("NavigationView", "Pulsada seccion 3");
                break;
            case R.id.menu_opcion_1:
                Log.i("NavigationView", "Pulsada opción 1");
                break;
            case R.id.menu_opcion_2:
                Log.i("NavigationView", "Pulsada opción 2");
                break;
        }
        item.setChecked(true);
        drawerLayout.closeDrawers();
        return true;
    }


}
