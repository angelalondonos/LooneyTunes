package co.edu.uniquindio.android.electiva.looneytunes.Activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import co.edu.uniquindio.android.electiva.looneytunes.Fragments.ElmerFragment;
import co.edu.uniquindio.android.electiva.looneytunes.Fragments.HomeFragment;
import co.edu.uniquindio.android.electiva.looneytunes.Fragments.LolasFragment;
import co.edu.uniquindio.android.electiva.looneytunes.Fragments.LucasFragment;
import co.edu.uniquindio.android.electiva.looneytunes.R;

/**
 * Actividad principal
 *
 * @author Angela Londoño
 * @author Rodrigo Ramirez
 * @author Cristian Agudelo
 *
 */

public class LooneyTunesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    /**
     * creación de un DrawerLayout
     */
    public DrawerLayout drawerLayout;
    /**
     * creación de un NavigationView
     */
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
        navView.setNavigationItemSelectedListener(this);

        HomeFragment homeFragment = new HomeFragment();
        remplazarFragmento(homeFragment);

    }

    /**
     * Método que permite inicar el DrawerLayout
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Método que permite cambiar de fragment
     * @param fragment
     */
    private void remplazarFragmento(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, fragment).addToBackStack(null).commit();

    }

    /**
     * Método que permite cambiar de opcion en el Navigation Drawer
     * @param item
     * @return
     */
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_seccion_1:
                remplazarFragmento(new LucasFragment());
                break;
            case R.id.menu_seccion_2:
                remplazarFragmento(new ElmerFragment());
                break;
            case R.id.menu_seccion_3:
                remplazarFragmento(new LolasFragment());
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

    /**
     * Metodo que permite crear el menu de opciones
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


}
