package com.example.androidmaterialdesign.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.androidmaterialdesign.R;


public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener{

    private static String TAG = MainActivity.class.getSimpleName();
    private FragmentDrawer drawerFragment;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
				
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
        drawerFragment.setDrawerListener(this);

        // display the first navigation drawer view on app launch
        displayView(0);

    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new MessageFragment();
                title = getString(R.string.Message);
                break;
            case 1:
                fragment = new LikesFragment();
                title = getString(R.string.Likes);
                break;
            case 2:
                fragment = new GamesFragment();
                title = getString(R.string.Games);
                break;
            case 3:
                fragment = new LablesFragment();
                title = getString(R.string.Lables);
                break;
            case 4:
                fragment = new SearchFragment();
                title = getString(R.string.Search);
                break;
            case 5:
                fragment = new OtherFragment();
                title = getString(R.string.Cloud);
                break;
            case 6:
                fragment = new OtherFragment();
                title = getString(R.string.Camara);
                break;
            case 7:
                fragment = new OtherFragment();
                title = getString(R.string.Video);
                break;
            case 8:
                fragment = new OtherFragment();
                title = getString(R.string.Groups);
                break;
            case 9:
                fragment = new OtherFragment();
                title = getString(R.string.ImportExport);
                break;
            case 10:
                fragment = new OtherFragment();
                title = getString(R.string.About);
                break;
            case 11:
                fragment = new OtherFragment();
                title = getString(R.string.Settings);
                break;
            case 12:
                fragment = new OtherFragment();
                title = getString(R.string.Help);
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(),"Clicked on Settings",Toast.LENGTH_LONG).show();
            return true;
        } if (id == R.id.action_search) {
            Toast.makeText(getApplicationContext(),"Clicked on Search",Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.action_user) {
            Toast.makeText(getApplicationContext(),"Clicked on User",Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
