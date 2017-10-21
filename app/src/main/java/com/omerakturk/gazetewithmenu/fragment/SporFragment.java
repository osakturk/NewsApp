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
 * {@link SporFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SporFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SporFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Intent intent;
    private View view;
    private ImageView btnSpor1,btnSpor2,btnSpor3,btnSpor4,btnSpor5,btnSpor6,btnSpor7,btnSpor8
            ,btnSpor9,btnSpor10,btnSpor11,btnSpor12,btnSpor13,btnSpor14,btnSpor15,btnSpor16,
            btnSpor17,btnSpor18,btnSpor19,btnSpor20;
    public static final String GELEN_SITE = "";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SporFragment() {
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
    public static SporFragment newInstance(String param1, String param2) {
        SporFragment fragment = new SporFragment();
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
        view=inflater.inflate(R.layout.fragment_spor,container,false);
        btnSpor1= (ImageView) view.findViewById(R.id._btn_spor1);
        btnSpor2= (ImageView) view.findViewById(R.id._btn_spor2);
        btnSpor3= (ImageView) view.findViewById(R.id._btn_spor3);
        btnSpor4= (ImageView) view.findViewById(R.id._btn_spor4);
        btnSpor5= (ImageView) view.findViewById(R.id._btn_spor5);
        btnSpor6= (ImageView) view.findViewById(R.id._btn_spor6);
        btnSpor7= (ImageView) view.findViewById(R.id._btn_spor7);
        btnSpor8= (ImageView) view.findViewById(R.id._btn_spor8);
        btnSpor9= (ImageView) view.findViewById(R.id._btn_spor9);
        btnSpor10= (ImageView) view.findViewById(R.id._btn_spor10);
        btnSpor11= (ImageView) view.findViewById(R.id._btn_spor11);
        btnSpor12= (ImageView) view.findViewById(R.id._btn_spor12);
        btnSpor13= (ImageView) view.findViewById(R.id._btn_spor13);
        btnSpor14= (ImageView) view.findViewById(R.id._btn_spor14);
        btnSpor15= (ImageView) view.findViewById(R.id._btn_spor15);
        btnSpor16= (ImageView) view.findViewById(R.id._btn_spor16);
        btnSpor17= (ImageView) view.findViewById(R.id._btn_spor17);
        btnSpor18= (ImageView) view.findViewById(R.id._btn_spor18);
        btnSpor19= (ImageView) view.findViewById(R.id._btn_spor19);
        btnSpor20= (ImageView) view.findViewById(R.id._btn_spor20);

                btnSpor1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.fotomac));
                        startActivity(intent);
                    }
                });
                btnSpor2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sporx));
                        startActivity(intent);
                    }
                });
                btnSpor3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.fanatik));
                        startActivity(intent);
                    }
                });
                btnSpor4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ajansspor));
                        startActivity(intent);
                    }
                });


                btnSpor5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.aspor));
                        startActivity(intent);
                    }
                });
                btnSpor6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.beinsports));
                        startActivity(intent);
                    }
                });
                btnSpor7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.futbolarena));
                        startActivity(intent);
                    }
                });
                btnSpor8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sporoku));
                        startActivity(intent);
                    }
                });


                btnSpor9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ntvspor));
                        startActivity(intent);
                    }
                });
                btnSpor10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.trtspor));
                        startActivity(intent);
                    }
                });
                btnSpor11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.haber1903));
                        startActivity(intent);

                    }
                });
                btnSpor12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.webaslan));
                        startActivity(intent);
                    }
                });



                btnSpor13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.onikinumara));
                        startActivity(intent);
                    }
                });
                btnSpor14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.bordomavi));
                        startActivity(intent);
                    }
                });
                btnSpor15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.bursasporluyuz));
                        startActivity(intent);
                    }
                });
                btnSpor16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.fenerbahce));
                        startActivity(intent);
                    }
                });

                btnSpor17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.besiktas));
                        startActivity(intent);
                    }
                });
                btnSpor18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.galatasaray));
                        startActivity(intent);
                    }
                });
                btnSpor19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.trabzonspor));
                        startActivity(intent);
                    }
                });
                btnSpor20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.bursaspor));
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
