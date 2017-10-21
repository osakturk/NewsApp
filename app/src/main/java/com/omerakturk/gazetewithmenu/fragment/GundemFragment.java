package com.omerakturk.gazetewithmenu.fragment;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.omerakturk.gazetewithmenu.R;
import com.omerakturk.gazetewithmenu.activity.WebHaberActivity;
import com.omerakturk.gazetewithmenu.entity.utility.DBContext;
import com.omerakturk.gazetewithmenu.other.AbstractLocationListener;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GundemFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GundemFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GundemFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Intent intent;
    private View view;
    private TextView txtKoordinat;
    private Location location;
    private LocationManager locationManager;
    private LocationListener locationListener;
    private ImageView btnGndm1,btnGndm2,btnGndm3,btnGndm4,btnGndm5,btnGndm6,btnGndm7,btnGndm8,btnGndm9,btnGndm10,btnGndm11,
            btnGndm12,btnGndm13,btnGndm14,btnGndm15,btnGndm16,btnGndm17,btnGndm18,btnGndm19,btnGndm20;
    public static String GELEN_SITE="GELEN URL: ";


    private OnFragmentInteractionListener mListener;

    public GundemFragment() {
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
    public static GundemFragment newInstance(String param1, String param2) {
        GundemFragment fragment = new GundemFragment();
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
        view=inflater.inflate(R.layout.fragment_gundem, container, false);

        btnGndm1= (ImageView) view.findViewById(R.id._btn_gundem1);
        btnGndm2= (ImageView) view.findViewById(R.id._btn_gundem2);
        btnGndm3= (ImageView) view.findViewById(R.id._btn_gundem3);
        btnGndm4= (ImageView) view.findViewById(R.id._btn_gundem4);
        btnGndm5= (ImageView) view.findViewById(R.id._btn_gundem5);
        btnGndm6= (ImageView) view.findViewById(R.id._btn_gundem6);
        btnGndm7= (ImageView) view.findViewById(R.id._btn_gundem7);
        btnGndm8= (ImageView) view.findViewById(R.id._btn_gundem8);
        btnGndm9= (ImageView) view.findViewById(R.id._btn_gundem9);
        btnGndm10= (ImageView) view.findViewById(R.id._btn_gundem10);
        btnGndm11= (ImageView) view.findViewById(R.id._btn_gundem11);
        btnGndm12= (ImageView) view.findViewById(R.id._btn_gundem12);
        btnGndm13= (ImageView) view.findViewById(R.id._btn_gundem13);
        btnGndm14=(ImageView) view.findViewById(R.id._btn_gundem14);
        btnGndm15=(ImageView) view.findViewById(R.id._btn_gundem15);
        btnGndm16=(ImageView) view.findViewById(R.id._btn_gundem16);
        btnGndm17= (ImageView) view.findViewById(R.id._btn_gundem17);
        btnGndm18= (ImageView) view.findViewById(R.id._btn_gundem18);
        btnGndm19= (ImageView) view.findViewById(R.id._btn_gundem19);
        btnGndm20= (ImageView) view.findViewById(R.id._btn_gundem20);

                btnGndm1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(), WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ensonhaber));startActivity(intent);
                    }
                });
                btnGndm2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sabah));startActivity(intent);
                    }
                });
                btnGndm3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.ntv));startActivity(intent);
                    }
                });
                btnGndm4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.aa));startActivity(intent);
                    }
                });

                btnGndm5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.takvim));startActivity(intent);
                    }
                });
                btnGndm6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.akit));startActivity(intent);
                    }
                });
                btnGndm7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.hurriyet));startActivity(intent);
                    }
                });
                btnGndm8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.sozcu));startActivity(intent);
                    }
                });

                btnGndm9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.cumhuriyet));startActivity(intent);
                    }
                });
                btnGndm10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.aksam));startActivity(intent);
                    }
                });
                btnGndm11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.cnn));startActivity(intent);
                    }
                });
                btnGndm12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.star));startActivity(intent);
                    }
                });

                btnGndm13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.karar));startActivity(intent);
                    }
                });
                btnGndm14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.milliyet));startActivity(intent);
                    }
                });
                btnGndm15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.posta));startActivity(intent);
                    }
                });
                btnGndm16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.haberturk));startActivity(intent);
                    }
                });

                btnGndm17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.yenisafak));startActivity(intent);
                    }
                });
                btnGndm18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.radikal));startActivity(intent);
                    }

                });
                btnGndm19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.trthaber));startActivity(intent);
                    }
                });
                btnGndm20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent=new Intent(getActivity(),WebHaberActivity.class);
                        intent.putExtra(GELEN_SITE,getResources().getString(R.string.t24));startActivity(intent);
                    }
                });
        initizalizeComponents();
        manageActions();

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
    public void manageActions()
    {

        locationManager = (LocationManager) getActivity().getSystemService(getActivity().LOCATION_SERVICE);
        final Criteria locationCriteria = new Criteria();
        String bestProvider=locationManager.getBestProvider(locationCriteria,true);
        if(bestProvider!=null){
            location=locationManager.getLastKnownLocation(bestProvider);
        }
        locationListener = new AbstractLocationListener(getActivity()) {
            @Override
            public void onLocationChanged(Location loc) // Konum degistirildiginde tetiklenir.
            {
                if (loc!=null){
                    location=loc;
                    txtKoordinat.setText("Boylam : " +location.getLongitude()+" \nEnlem: " + location.getLatitude());

                    DBContext.getInstance(getActivity()).lokasyonEkle(location);
                    Toast.makeText(getActivity(), "Veritabanına Başarıyla Eklendi", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getActivity(), location.getLongitude()+" "+location.getLatitude(), Toast.LENGTH_SHORT).show();
                    List<Location> lokasyonListesi=DBContext.getInstance(getActivity()).lokasyonGoster(location);
                    Toast.makeText(getActivity(), lokasyonListesi.get(0).toString(), Toast.LENGTH_LONG).show();
                    DBContext.getInstance(getActivity()).showAllDatabases();

                }

            }

            @Override
            public void onProviderDisabled(String provider) // Saglayicinin aktif olmamasi durumunda tetiklenir.
            {
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent);
            }
        };

        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,locationListener);

        controlPermission(); // izinleri bu metot ile kontrol edecegiz.
    }


    public void initizalizeComponents()
    {


        txtKoordinat = (TextView)view.findViewById(R.id.txt_konum);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if(requestCode == 42)
        {
            controlPermission();
        }
    }

    @TargetApi(23)
    private void controlPermission()
    {
        if(  ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED  &&
                ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED  )
        {
            // Burada, SDK 6.0'dan buyuk mu diye bakiyoruz.
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                String izinDizisi[] = {Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.INTERNET};
                requestPermissions(izinDizisi, 42);
            }

            return;
        }

    }


}
