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
 * {@link SeyahatFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SeyahatFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SeyahatFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private View view;
    private Intent intent;
    private ImageView btnSeyahat1,btnSeyahat2,btnSeyahat3,btnSeyahat4,btnSeyahat5,btnSeyahat6,btnSeyahat7,btnSeyahat8;
    public static final String GELEN_SITE ="" ;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SeyahatFragment() {
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
    public static SeyahatFragment newInstance(String param1, String param2) {
        SeyahatFragment fragment = new SeyahatFragment();
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
        view=inflater.inflate(R.layout.fragment_seyahat,container,false);
        btnSeyahat1= (ImageView) view.findViewById(R.id._btn_seyahat1);
        btnSeyahat2= (ImageView) view.findViewById(R.id._btn_seyahat2);
        btnSeyahat3= (ImageView) view.findViewById(R.id._btn_seyahat3);
        btnSeyahat4= (ImageView) view.findViewById(R.id._btn_seyahat4);
        btnSeyahat5= (ImageView) view.findViewById(R.id._btn_seyahat5);
        btnSeyahat6= (ImageView) view.findViewById(R.id._btn_seyahat6);
        btnSeyahat7= (ImageView) view.findViewById(R.id._btn_seyahat7);
        btnSeyahat8= (ImageView) view.findViewById(R.id._btn_seyahat8);

                btnSeyahat1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.cnnseyahat));
                        startActivity(intent);
                    }
                });
                btnSeyahat2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ntvseyahat));
                        startActivity(intent);
                    }
                });
                btnSeyahat3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ensonhaberseyahat));
                        startActivity(intent);
                    }
                });
                btnSeyahat4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.dunyacom));
                        startActivity(intent);
                    }
                });


                btnSeyahat5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.nationalturk));
                        startActivity(intent);
                    }
                });
                btnSeyahat6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.superhaber));
                        startActivity(intent);
                    }
                });
                btnSeyahat7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.skyscanner));
                        startActivity(intent);
                    }
                });
                btnSeyahat8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sozcuseyahat));
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
