package cl.pingon.cotizador.views.main.inputdata;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.pingon.cotizador.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InputCommentsFragment extends Fragment {


    public InputCommentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input_comments, container, false);
    }

}
