package co.edu.uniquindio.android.electiva.looneytunes.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.edu.uniquindio.android.electiva.looneytunes.R;

/**
 *
 * Fragmento que contiene la información del personaje Lucas
 *
 * @author Angela Londoño
 * @author Rodrigo Ramirez
 * @author Cristian Agudelo
 *
 * A simple {@link Fragment} subclass.
 */
public class LucasFragment extends Fragment {

    /**
     * Método constructor del fragmento LucasFragment
     */
    public LucasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lucas, container, false);
    }

}
