package co.edu.uniquindio.android.electiva.looneytunes.Fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import co.edu.uniquindio.android.electiva.looneytunes.R;

/**
 *
 * Fragmento que contiene la información del personaje Lola
 *
 * @author Angela Londoño
 * @author Rodrigo Ramirez
 * @author Cristian Agudelo
 *
 * A simple {@link Fragment} subclass.
 */
public class LolasFragment extends Fragment {

    /**
     * Boton que permite ir a un video en Youtube
     */
    private Button btnIrVideo;

    /**
     * Método constructor del fragmento {@link LolasFragment}
     */
    public LolasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_lolas, container, false);


        btnIrVideo = (Button) view.findViewById(R.id.btn_ir_a_trailes_lola);
        btnIrVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=yUMICXyyRUI"));
                startActivity(intent);
            }
        });

        return view;
    }

}
