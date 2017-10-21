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
 * {@link TeknolojiFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TeknolojiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TeknolojiFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private View view;
    private Intent intent;
    private ImageView btnTeknoloji1,btnTeknoloji2,btnTeknoloji3,btnTeknoloji4,btnTeknoloji5,btnTeknoloji6,btnTeknoloji7,btnTeknoloji8
            ,btnTeknoloji9,btnTeknoloji10,btnTeknoloji11,btnTeknoloji12,btnTeknoloji13,btnTeknoloji14;
    public static final String GELEN_SITE ="" ;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TeknolojiFragment() {
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
    public static TeknolojiFragment newInstance(String param1, String param2) {
        TeknolojiFragment fragment = new TeknolojiFragment();
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
        view=inflater.inflate(R.layout.fragment_teknoloji,container,false);
        btnTeknoloji1= (ImageView) view.findViewById(R.id._btn_teknoloji1);
        btnTeknoloji2= (ImageView) view.findViewById(R.id._btn_teknoloji2);
        btnTeknoloji3= (ImageView) view.findViewById(R.id._btn_teknoloji3);
        btnTeknoloji4= (ImageView) view.findViewById(R.id._btn_teknoloji4);
        btnTeknoloji5= (ImageView) view.findViewById(R.id._btn_teknoloji5);
        btnTeknoloji6= (ImageView) view.findViewById(R.id._btn_teknoloji6);
        btnTeknoloji7= (ImageView) view.findViewById(R.id._btn_teknoloji7);
        btnTeknoloji8= (ImageView) view.findViewById(R.id._btn_teknoloji8);
        btnTeknoloji9= (ImageView) view.findViewById(R.id._btn_teknoloji9);
        btnTeknoloji10= (ImageView) view.findViewById(R.id._btn_teknoloji10);
        btnTeknoloji11= (ImageView) view.findViewById(R.id._btn_teknoloji11);
        btnTeknoloji12= (ImageView) view.findViewById(R.id._btn_teknoloji12);
        btnTeknoloji13= (ImageView) view.findViewById(R.id._btn_teknoloji13);
        btnTeknoloji14= (ImageView) view.findViewById(R.id._btn_teknoloji14);

                btnTeknoloji1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ntvteknoloji));
                        startActivity(intent);
                    }
                });
                btnTeknoloji2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.shiftdelete));
                        startActivity(intent);
                    }
                });
                btnTeknoloji3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.webtekno));
                        startActivity(intent);
                    }
                });
                btnTeknoloji4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.chiponline));
                        startActivity(intent);
                    }
                });

                btnTeknoloji5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.teknolojioku));
                        startActivity(intent);
                    }
                });
                btnTeknoloji6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ensonhaberteknoloji));
                        startActivity(intent);
                    }
                });
                btnTeknoloji7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sabahteknoloji));
                        startActivity(intent);
                    }
                });
                btnTeknoloji8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.haber7teknoloji));
                        startActivity(intent);
                    }
                });

                btnTeknoloji9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.milliyetteknoloji));
                        startActivity(intent);
                    }
                });
                btnTeknoloji10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.hurriyetteknoloji));
                        startActivity(intent);
                    }
                });
                btnTeknoloji11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.gazetevatantekno));
                        startActivity(intent);

                    }
                });
                btnTeknoloji12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.haberturktekno));
                        startActivity(intent);
                    }
                });



                btnTeknoloji13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.yenişafaktekno));
                        startActivity(intent);
                    }
                });
                btnTeknoloji14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ahabertekno));
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
    public void initializeComponents(){
      
    }
    


}
