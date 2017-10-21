package com.omerakturk.gazetewithmenu.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.omerakturk.gazetewithmenu.R;
import com.omerakturk.gazetewithmenu.activity.WebHaberActivity;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GaleriFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GaleriFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GaleriFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public static final String GELEN_SITE ="" ;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Intent intent;
    private View view;
    private ImageView btnGaleri1,btnGaleri2,btnGaleri3,btnGaleri4,btnGaleri5,btnGaleri6,btnGaleri7,btnGaleri8,
    btnGaleri9,btnGaleri10,btnGaleri11,btnGaleri12;

    private OnFragmentInteractionListener mListener;

    public GaleriFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GaleriFragment newInstance(String param1, String param2) {
        GaleriFragment fragment = new GaleriFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_galeri,container,false);

        btnGaleri1= (ImageView) view.findViewById(R.id._btn_galeri1);
        btnGaleri2= (ImageView) view.findViewById(R.id._btn_galeri2);
        btnGaleri3= (ImageView) view.findViewById(R.id._btn_galeri3);
        btnGaleri4= (ImageView) view.findViewById(R.id._btn_galeri4);
        btnGaleri5= (ImageView) view.findViewById(R.id._btn_galeri5);
        btnGaleri6= (ImageView) view.findViewById(R.id._btn_galeri6);
        btnGaleri7= (ImageView) view.findViewById(R.id._btn_galeri7);
        btnGaleri8= (ImageView) view.findViewById(R.id._btn_galeri8);
        btnGaleri9= (ImageView) view.findViewById(R.id._btn_galeri9);
        btnGaleri10= (ImageView) view.findViewById(R.id._btn_galeri10);
        btnGaleri11= (ImageView) view.findViewById(R.id._btn_galeri11);
        btnGaleri12= (ImageView) view.findViewById(R.id._btn_galeri12);


                btnGaleri1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ensonhabergaleri));
                        startActivity(intent);
                    }
                });
                btnGaleri2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ntvgaleri));
                        startActivity(intent);
                    }
                });
                btnGaleri3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.aagaleri));
                        startActivity(intent);
                    }
                });
                btnGaleri4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.hurriyetgaleri));
                        startActivity(intent);
                    }
                });



                btnGaleri5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.cumhuriyetgaleri));
                        startActivity(intent);
                    }
                });
                btnGaleri6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.aksamgaleri));
                        startActivity(intent);
                    }
                });
                btnGaleri7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.cnngaleri));
                        startActivity(intent);
                    }
                });
                btnGaleri8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.karargaleri));
                        startActivity(intent);
                    }
                });


                btnGaleri9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.postagaleri));
                        startActivity(intent);
                    }
                });
                btnGaleri10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.haberturkgaleri));
                        startActivity(intent);
                    }
                });
                btnGaleri11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.yenisafakgaleri));
                        startActivity(intent);

                    }
                });
                btnGaleri12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sozcugaleri));
                        startActivity(intent);
                    }
                });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
