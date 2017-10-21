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
 * {@link KadinFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link KadinFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KadinFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Intent intent;
    private View view;
    private ImageView btnkadin1,btnkadin2,btnkadin3,btnkadin4,btnkadin5,btnkadin6,btnkadin7,btnkadin8
            ,btnkadin9;
    public static final String GELEN_SITE ="" ;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public KadinFragment() {
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
    public static KadinFragment newInstance(String param1, String param2) {
        KadinFragment fragment = new KadinFragment();
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
        view=inflater.inflate(R.layout.fragment_kadin,container,false);
        btnkadin1= (ImageView) view.findViewById(R.id._btn_kadin1);
        btnkadin2= (ImageView) view.findViewById(R.id._btn_kadin2);
        btnkadin3= (ImageView) view.findViewById(R.id._btn_kadin3);
        btnkadin4= (ImageView) view.findViewById(R.id._btn_kadin4);
        btnkadin5= (ImageView) view.findViewById(R.id._btn_kadin5);
        btnkadin6= (ImageView) view.findViewById(R.id._btn_kadin6);
        btnkadin7= (ImageView) view.findViewById(R.id._btn_kadin7);
        btnkadin8= (ImageView) view.findViewById(R.id._btn_kadin8);
        btnkadin9= (ImageView) view.findViewById(R.id._btn_kadin9);


                btnkadin1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.kadinhaberler));
                        startActivity(intent);
                    }
                });
                btnkadin2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sabahkadin));
                        startActivity(intent);
                    }
                });
                btnkadin3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.mynetkadin));
                        startActivity(intent);
                    }
                });
                btnkadin4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.htkadin));
                        startActivity(intent);
                    }
                });
                btnkadin5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.kadinhaberleri));
                        startActivity(intent);
                    }
                });


                btnkadin6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.yenikadin));
                        startActivity(intent);
                    }
                });
                btnkadin7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.hurriyetkadin));
                        startActivity(intent);
                    }
                });
                btnkadin8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.kadinvekadin));
                        startActivity(intent);
                    }
                });
                btnkadin9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.leyditürk));
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
