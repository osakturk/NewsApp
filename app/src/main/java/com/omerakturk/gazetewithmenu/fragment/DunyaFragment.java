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
 * {@link DunyaFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DunyaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DunyaFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public static final String GELEN_SITE ="";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Intent intent;
    private View view;
    private ImageView btnDunya1,btnDunya2,btnDunya3,btnDunya4,btnDunya5,btnDunya6,btnDunya7,btnDunya8
            ,btnDunya9,btnDunya10,btnDunya11,btnDunya12,btnDunya13,btnDunya14,btnDunya15,btnDunya16,btnDunya17;

    private OnFragmentInteractionListener mListener;

    public DunyaFragment() {
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
    public static DunyaFragment newInstance(String param1, String param2) {
        DunyaFragment fragment = new DunyaFragment();
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

        view=inflater.inflate(R.layout.fragment_dunya, container, false);
        // Inflate the layout for this fragment

        btnDunya1= (ImageView) view.findViewById(R.id._btn_dunya1);
        btnDunya2= (ImageView) view.findViewById(R.id._btn_dunya2);
        btnDunya3= (ImageView) view.findViewById(R.id._btn_dunya3);
        btnDunya4= (ImageView) view.findViewById(R.id._btn_dunya4);
        btnDunya5= (ImageView) view.findViewById(R.id._btn_dunya5);
        btnDunya6= (ImageView) view.findViewById(R.id._btn_dunya6);
        btnDunya7= (ImageView) view.findViewById(R.id._btn_dunya7);
        btnDunya8= (ImageView) view.findViewById(R.id._btn_dunya8);
        btnDunya9= (ImageView) view.findViewById(R.id._btn_dunya9);
        btnDunya10= (ImageView) view.findViewById(R.id._btn_dunya10);
        btnDunya11= (ImageView) view.findViewById(R.id._btn_dunya11);
        btnDunya12= (ImageView) view.findViewById(R.id._btn_dunya12);
        btnDunya13= (ImageView) view.findViewById(R.id._btn_dunya13);
        btnDunya14= (ImageView) view.findViewById(R.id._btn_dunya14);
        btnDunya15= (ImageView) view.findViewById(R.id._btn_dunya15);
        btnDunya16= (ImageView) view.findViewById(R.id._btn_dunya16);
        btnDunya17= (ImageView) view.findViewById(R.id._btn_dunya17);



                btnDunya1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.bbcturkce));
                        startActivity(intent);

                    }
                });
                btnDunya2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.aljazeeraturkce));
                        startActivity(intent);
                    }
                });
                btnDunya3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.reuters));
                        startActivity(intent);
                    }
                });
                btnDunya4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.thesun));
                        startActivity(intent);
                    }
                });
                btnDunya5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.newyorktimes));
                        startActivity(intent);
                    }
                });


                btnDunya6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.washingtonpost));
                        startActivity(intent);
                    }
                });
                btnDunya7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.independent));
                        startActivity(intent);
                    }
                });
                btnDunya8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.dailymail));
                        startActivity(intent);
                    }
                });
                btnDunya9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.telegraph));
                        startActivity(intent);
                    }
                });
                btnDunya10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.financialtimes));
                        startActivity(intent);
                    }
                });


                btnDunya11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.guardian));
                        startActivity(intent);

                    }
                });
                btnDunya12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.deutschewelle));
                        startActivity(intent);
                    }
                });
                btnDunya13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.spiegel));
                        startActivity(intent);
                    }
                });
                btnDunya14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.france24));
                        startActivity(intent);
                    }
                });
                btnDunya15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.metropolparis));
                        startActivity(intent);
                    }
                });


                btnDunya16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.rt));
                        startActivity(intent);
                    }
                });
                btnDunya17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sputnik));
                        startActivity(intent);
                    }});;
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
