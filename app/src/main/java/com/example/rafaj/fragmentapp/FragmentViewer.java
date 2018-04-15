package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView text;
    TextView texto;
    ImageView image;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        text = view.findViewById(R.id.textId);
        Bundle bundle = this.getArguments();
        texto = view.findViewById(R.id.contenido);
        image = view.findViewById(R.id.imageId);
        if(bundle != null){
            Toast.makeText(getActivity(), "Item: " + bundle.getString("KEY"), Toast.LENGTH_SHORT).show();
            setImage(bundle.getInt("imageId"));
            texto.setText(bundle.getString("Info"));
            text.setText(bundle.getString("KEY"));
        }

        return view;
    }

    public void setImage(int num){
        switch (num){
            case 0:
                image.setImageResource(R.drawable.sun);
                break;
            case 1:
                image.setImageResource(R.drawable.mercurio);
                break;
            case 2:
                image.setImageResource(R.drawable.venus);
                break;
            case 3:
                image.setImageResource(R.drawable.tierra);
                break;
            case 4:
                image.setImageResource(R.drawable.mars);
                break;
            case 5:
                image.setImageResource(R.drawable.jupiter);
                break;
            case 6:
                image.setImageResource(R.drawable.saturn);
                break;
            case 7:
                image.setImageResource(R.drawable.uranus);
                break;
            case 8:
                image.setImageResource(R.drawable.neptune);
                break;
        }
    }


}
