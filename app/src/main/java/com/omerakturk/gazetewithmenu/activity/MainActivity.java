package com.omerakturk.gazetewithmenu.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.omerakturk.gazetewithmenu.R;
import com.omerakturk.gazetewithmenu.fragment.DunyaFragment;
import com.omerakturk.gazetewithmenu.fragment.EkonomiFragment;
import com.omerakturk.gazetewithmenu.fragment.GaleriFragment;
import com.omerakturk.gazetewithmenu.fragment.GundemFragment;
import com.omerakturk.gazetewithmenu.fragment.KadinFragment;
import com.omerakturk.gazetewithmenu.fragment.KulturSanatFragment;
import com.omerakturk.gazetewithmenu.fragment.MagazinFragment;
import com.omerakturk.gazetewithmenu.fragment.SeyahatFragment;
import com.omerakturk.gazetewithmenu.fragment.SporFragment;
import com.omerakturk.gazetewithmenu.fragment.TeknolojiFragment;
import com.omerakturk.gazetewithmenu.fragment.VideoFragment;


public class MainActivity extends AppCompatActivity {

    private static final String TAG_EKONOMI ="ekonomi" ;
    private static final String TAG_DUNYA ="dünya" ;
    private static final String TAG_KADIN ="kadin" ;
    private static final String TAG_SPOR ="spor" ;
    private static final String TAG_TEKNOLOJI ="teknoloji" ;
    private static final String TAG_MAGAZIN ="magazin" ;
    private static final String TAG_KULTUR ="kultur" ;
    private static final String TAG_SEYAHAT ="seyahat" ;
    private static final String TAG_VIDEO ="video" ;
    private static final String TAG_GALERI ="galeri" ;
    private NavigationView navigationView;
    private Intent email;
    private DrawerLayout drawer;
    private View navHeader;
    private ImageView imgNavHeaderBg, imgProfile;
    private TextView txtName, txtWebsite;
    private Toolbar toolbar;
    private FloatingActionButton fab,fabphone;
    private static final String urlNavHeaderBg = "http://api.androidhive.info/images/nav-menu-header-bg.jpg";
    public static int navItemIndex = 0;
    private static final String TAG_GUNDEM ="gundem" ;
    private static final String TAG_HOME = "home";
    public static String CURRENT_TAG = TAG_GUNDEM;
    private String[] activityTitles;
    private boolean shouldLoadHomeFragOnBackPress = true;
    private Handler mHandler;




    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mHandler = new Handler();
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fabphone= (FloatingActionButton) findViewById(R.id.fabphone);
        navHeader = navigationView.getHeaderView(0);
        txtName = (TextView) navHeader.findViewById(R.id.name);
        txtWebsite = (TextView) navHeader.findViewById(R.id.website);
        imgNavHeaderBg = (ImageView) navHeader.findViewById(R.id.img_header_bg);
       // imgProfile = (ImageView) navHeader.findViewById(R.id.img_profile);
        activityTitles = getResources().getStringArray(R.array.nav_item_activity_titles);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "İletişim sayfasına yönlendiriliyorsunuz", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                String[] emails = {"omerakturk@outlook.com.tr"};
                String subject = "Sorununuzu bildiriniz";
                String message = "";

                email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, emails);
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "E-Mail Sağlayıcısı Seçiniz :"));
            }
        });

        fabphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumber="0123456789";
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("tel:%s", phonenumber)));
                startActivity(in);
            }
        });
        loadNavHeader();
        setUpNavigationView();
        if (savedInstanceState == null) {
            navItemIndex = 0;
            CURRENT_TAG = TAG_GUNDEM;
            loadHomeFragment();
        }
    }
    private void loadNavHeader() {
        // name, website
        txtName.setText("Gazete Uygulamasına Hoş Geldiniz");

        Glide.with(this).load(urlNavHeaderBg)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imgNavHeaderBg);

    }
    private void loadHomeFragment() {
        selectNavMenu();
        setToolbarTitle();
        if (getSupportFragmentManager().findFragmentByTag(CURRENT_TAG) != null) {
            drawer.closeDrawers();
            toggleFab();
            return;
        }
        Runnable mPendingRunnable = new Runnable() {
            @Override
            public void run() {
                // update the main content by replacing fragments
                Fragment fragment = getHomeFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                        android.R.anim.fade_out);
                fragmentTransaction.replace(R.id.frame, fragment, CURRENT_TAG);
                fragmentTransaction.commitAllowingStateLoss();
            }
        };
        if (mPendingRunnable != null) {
            mHandler.post(mPendingRunnable);
        }
        toggleFab();
        drawer.closeDrawers();
        invalidateOptionsMenu();
    }

    private Fragment getHomeFragment() {

        switch (navItemIndex) {
            case 0:
                GundemFragment gundemFragment =new GundemFragment();
                return gundemFragment;
            case 1:
                EkonomiFragment ekonomifragment=new EkonomiFragment();
                return ekonomifragment;
            case 2:
                DunyaFragment dunyaFragment=new DunyaFragment();
                return dunyaFragment;
            case 3:
                KadinFragment kadinFragment=new KadinFragment();
                return kadinFragment;
            case 4:
                SporFragment sporFragment=new SporFragment();
                return sporFragment;
            case 5:
                TeknolojiFragment teknolojiFragment=new TeknolojiFragment();
                return teknolojiFragment;
            case 6:
                MagazinFragment magazinFragment=new MagazinFragment();
                return magazinFragment;
            case 7:
                KulturSanatFragment kulturSanatFragment=new KulturSanatFragment();
                return kulturSanatFragment;
            case 8:
                SeyahatFragment seyahatFragment=new SeyahatFragment();
                return seyahatFragment;
            case 9:
                VideoFragment videoFragment=new VideoFragment();
                return videoFragment;
            case 10:
                GaleriFragment galeriFragment=new GaleriFragment();
                return galeriFragment;
            default:
                return new GundemFragment();
        }

    }

    private void setToolbarTitle() {
        getSupportActionBar().setTitle(activityTitles[navItemIndex]);
    }

    private void selectNavMenu() {
        navigationView.getMenu().getItem(navItemIndex).setChecked(true);
    }

    private void setUpNavigationView() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.nav_gundem:
                        navItemIndex=0;
                        CURRENT_TAG=TAG_GUNDEM;
                        break;
                    case R.id.nav_ekonomi:
                        navItemIndex=1;
                        CURRENT_TAG=TAG_EKONOMI;
                        break;
                    case R.id.nav_dunya:
                        navItemIndex=2;
                        CURRENT_TAG=TAG_DUNYA;
                        break;
                    case R.id.nav_kadin:
                        navItemIndex=3;
                        CURRENT_TAG=TAG_KADIN;
                        break;
                    case R.id.nav_spor:
                        navItemIndex=4;
                        CURRENT_TAG=TAG_SPOR;
                        break;
                    case R.id.nav_teknoloji:
                        navItemIndex=5;
                        CURRENT_TAG=TAG_TEKNOLOJI;
                        break;
                    case R.id.nav_magazin:
                        navItemIndex=6;
                        CURRENT_TAG=TAG_MAGAZIN;
                        break;
                    case R.id.nav_kultur:
                        navItemIndex=7;
                        CURRENT_TAG=TAG_KULTUR;
                        break;
                    case R.id.nav_seyahat:
                        navItemIndex=8;
                        CURRENT_TAG=TAG_SEYAHAT;
                        break;
                    case R.id.nav_video:
                        navItemIndex=9;
                        CURRENT_TAG=TAG_VIDEO;
                        break;
                    case R.id.nav_galeri:
                        navItemIndex=10;
                        CURRENT_TAG=TAG_GALERI;
                        break;
                    default:
                        navItemIndex = 0;
                        CURRENT_TAG = TAG_GUNDEM;
                }
                if (menuItem.isChecked()) {
                    menuItem.setChecked(false);
                } else {
                    menuItem.setChecked(true);
                }
                menuItem.setChecked(true);
                loadHomeFragment();
                return true;
            }
        });
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer) {

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        drawer.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawers();
            return;
        }
        if (shouldLoadHomeFragOnBackPress) {

            if (navItemIndex != 0) {
                navItemIndex = 0;
                CURRENT_TAG = TAG_GUNDEM;
                loadHomeFragment();
                return;
            }
        }
        super.onBackPressed();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (navItemIndex == 0) {
            getMenuInflater().inflate(R.menu.main, menu);
        }
        if (navItemIndex == 3) {
            getMenuInflater().inflate(R.menu.notifications, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_mark_all_read) {
            Toast.makeText(getApplicationContext(), "All notifications marked as read!", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.action_clear_notifications) {
            Toast.makeText(getApplicationContext(), "Clear all notifications!", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
    private void toggleFab() {
        if (navItemIndex == 0){
            fab.show();
            fabphone.show();
        }

        else{
            fab.hide();
            fabphone.hide();
        }

    }
}



