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
 * {@link KulturSanatFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link KulturSanatFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KulturSanatFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Intent intent;
    private View view;
    private ImageView btnKultur1,btnKultur2,btnKultur3,btnKultur4,btnKultur5,btnKultur6,btnKultur7,btnKultur8
            ,btnKultur9,btnKultur10,btnKultur11,btnKultur12,btnKultur13,btnKultur14,btnKultur15;
    public static final String GELEN_SITE ="" ;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public KulturSanatFragment() {
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
    public static KulturSanatFragment newInstance(String param1, String param2) {
        KulturSanatFragment fragment = new KulturSanatFragment();
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
        view=inflater.inflate(R.layout.fragment_kultur_sanat,container,false);
        btnKultur1= (ImageView) view.findViewById(R.id._btn_kultur1);
        btnKultur2= (ImageView) view.findViewById(R.id._btn_kultur2);
        btnKultur3= (ImageView) view.findViewById(R.id._btn_kultur3);
        btnKultur4= (ImageView) view.findViewById(R.id._btn_kultur4);
        btnKultur5= (ImageView) view.findViewById(R.id._btn_kultur5);
        btnKultur6= (ImageView) view.findViewById(R.id._btn_kultur6);
        btnKultur7= (ImageView) view.findViewById(R.id._btn_kultur7);
        btnKultur8= (ImageView) view.findViewById(R.id._btn_kultur8);
        btnKultur9= (ImageView) view.findViewById(R.id._btn_kultur9);
        btnKultur10= (ImageView) view.findViewById(R.id._btn_kultur10);
        btnKultur11= (ImageView) view.findViewById(R.id._btn_kultur11);
        btnKultur12= (ImageView) view.findViewById(R.id._btn_kultur12);
        btnKultur13= (ImageView) view.findViewById(R.id._btn_kultur13);
        btnKultur14= (ImageView) view.findViewById(R.id._btn_kultur14);
        btnKultur15= (ImageView) view.findViewById(R.id._btn_kultur15);

                btnKultur1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.cumhuriyetkultur));
                        startActivity(intent);
                    }
                });
                btnKultur2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.t24kultur));
                        startActivity(intent);
                    }
                });
                btnKultur3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.aksamkultur));
                        startActivity(intent);
                    }
                });
                btnKultur4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.milliyetkultur));
                        startActivity(intent);
                    }
                });

                btnKultur5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sozcukultur));
                        startActivity(intent);
                    }
                });
                btnKultur6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.haberturkkultur));
                        startActivity(intent);
                    }
                });
                btnKultur7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.hurriyetkultur));
                        startActivity(intent);
                    }
                });
                btnKultur8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.trtkultur));
                        startActivity(intent);
                    }
                });

                btnKultur9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ensonhaberkultur));
                        startActivity(intent);
                    }
                });
                btnKultur10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.radikalkultur));
                        startActivity(intent);
                    }
                });
                btnKultur11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sabahkultur));
                        startActivity(intent);

                    }
                });
                btnKultur12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ntvkultur));
                        startActivity(intent);
                    }
                });


                btnKultur13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.istanbulnet));
                        startActivity(intent);
                    }
                });
                btnKultur14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.devlettiyatro));
                        startActivity(intent);
                    }
                });
                btnKultur15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.bienal));
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
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    public void initializeComponents(){
       

    }
    

}
