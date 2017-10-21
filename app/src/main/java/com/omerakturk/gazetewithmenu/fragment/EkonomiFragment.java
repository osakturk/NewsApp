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
 * {@link EkonomiFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link EkonomiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EkonomiFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Intent intent;
    private View view;
    private ImageView btnEkonomi1,btnEkonomi2,btnEkonomi3,btnEkonomi4,btnEkonomi5,btnEkonomi6,btnEkonomi7,btnEkonomi8
            ,btnEkonomi9,btnEkonomi10,btnEkonomi11,btnEkonomi12;
    public static String GELEN_SITE="GELEN URL: ";
    private OnFragmentInteractionListener mListener;

    public EkonomiFragment() {
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
    public static EkonomiFragment newInstance(String param1, String param2) {
        EkonomiFragment fragment = new EkonomiFragment();
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
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_ekonomi, container, false);

        btnEkonomi1= (ImageView) view.findViewById(R.id._btn_ekonomi1);
        btnEkonomi2= (ImageView) view.findViewById(R.id._btn_ekonomi2);
        btnEkonomi3= (ImageView) view.findViewById(R.id._btn_ekonomi3);
        btnEkonomi4= (ImageView) view.findViewById(R.id._btn_ekonomi4);
        btnEkonomi5= (ImageView) view.findViewById(R.id._btn_ekonomi5);
        btnEkonomi6= (ImageView) view.findViewById(R.id._btn_ekonomi6);
        btnEkonomi7= (ImageView) view.findViewById(R.id._btn_ekonomi7);
        btnEkonomi8= (ImageView) view.findViewById(R.id._btn_ekonomi8);
        btnEkonomi9= (ImageView) view.findViewById(R.id._btn_ekonomi9);
        btnEkonomi10= (ImageView) view.findViewById(R.id._btn_ekonomi10);
        btnEkonomi11= (ImageView) view.findViewById(R.id._btn_ekonomi11);
        btnEkonomi12= (ImageView) view.findViewById(R.id._btn_ekonomi12);


                btnEkonomi1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ntvekonomi));
                        startActivity(intent);
                    }
                });
                btnEkonomi2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.aaekonomi));
                        startActivity(intent);
                    }
                });
                btnEkonomi3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sabahekonomi));
                        startActivity(intent);
                    }
                });
                btnEkonomi4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.hurriyetekonomi));
                        startActivity(intent);
                    }
                });
                btnEkonomi5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.cumhuriyetekonomi));
                        startActivity(intent);
                    }
                });


                btnEkonomi6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.aksamekonomi));
                        startActivity(intent);
                    }
                });
                btnEkonomi7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.cnnekonomi));
                        startActivity(intent);
                    }
                });
                btnEkonomi8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.bloomberg));
                        startActivity(intent);
                    }
                });
                btnEkonomi9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ensonhaberekonomi));
                        startActivity(intent);
                    }
                });
                btnEkonomi10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.postaekonomi));
                        startActivity(intent);
                    }
                });

                btnEkonomi11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.milliyetekonomi));
                        startActivity(intent);

                    }
                });
                btnEkonomi12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sozcuekonomi));
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
