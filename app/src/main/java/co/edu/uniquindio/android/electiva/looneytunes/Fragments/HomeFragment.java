package co.edu.uniquindio.android.electiva.looneytunes.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import co.edu.uniquindio.android.electiva.looneytunes.R;

/**
 * Fragmento
 *
 * @author Angela Londoño
 * @author Rodrigo Ramirez
 * @author Cristian Agudelo
 *
 */
public class HomeFragment extends Fragment {


    /**
     * Método constructor del fragmento HomeFragment
     */
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        String frameVideo = "<html><body><iframe width=\"420\"height=\"315\" style=\\\"border: 0; width: 100%; height: 100%; padding:0px; margin:0px\\\" src=\"https://www.youtube.com/embed/CAs-Vur-XD8\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

        WebView displayYoutubeVideo = (WebView) view.findViewById(R.id.video_web);
        displayYoutubeVideo.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        WebSettings webSettings = displayYoutubeVideo.getSettings();
        webSettings.setJavaScriptEnabled(true);

        displayYoutubeVideo.loadData(frameVideo, "text/html", "utf-8");
        return view;
    }

    /**
     * Método que permite verifiar que opcion se eleige en el menu
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.cambiar_idioma) {
        }
        return super.onOptionsItemSelected(item);

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }


}
