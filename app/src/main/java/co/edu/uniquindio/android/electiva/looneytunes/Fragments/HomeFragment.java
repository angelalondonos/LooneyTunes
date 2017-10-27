package co.edu.uniquindio.android.electiva.looneytunes.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import co.edu.uniquindio.android.electiva.looneytunes.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container,
                false);
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


}
