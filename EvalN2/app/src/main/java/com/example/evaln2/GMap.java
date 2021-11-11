package com.example.evaln2;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.evaln2.databinding.ActivityGmapBinding;

public class GMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityGmapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityGmapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Arica
        LatLng arica = new LatLng(-18.4746, -70.29792);
        mMap.addMarker(new MarkerOptions().position(arica).title("Arica, XV Región de Arica y Parinacota")
                                                          .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_arica)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(arica, 10));

        //Antofagasta
        LatLng antofagasta = new LatLng(-23.650000, -70.400002);
        mMap.addMarker(new MarkerOptions().position(antofagasta).title("Antofagasta, II Región de Antofagasta")
                                                                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_antofagasta)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(antofagasta, 15));

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
}