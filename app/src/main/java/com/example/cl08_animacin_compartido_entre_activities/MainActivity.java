package com.example.cl08_animacin_compartido_entre_activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;

import android.app.ActivityOptions;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private GridView mGridView;
    private GridAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setup the GridView and set the adapter
        mGridView = findViewById(R.id.grid);
        mGridView.setOnItemClickListener(this);
        mAdapter = new GridAdapter();
        mGridView.setAdapter(mAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Item item = (Item) adapterView.getItemAtPosition(position);

        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(Constantes.EXTRA_ID, item.getId());


        //Obtenemos una referencia a los elementos visuales que queremos transicionar
        ImageView imageViewPhoto = view.findViewById(R.id.imageview_item);
        TextView textViewTituloPhoto = view.findViewById(R.id.textview_name);
        ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                new Pair<View, String>(imageViewPhoto, Constantes.SHARED_VIEW_PHOTO),
                new Pair<View, String>(textViewTituloPhoto, Constantes.SHARED_VIEW_TITLE)
        );

        ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
    }

    private class GridAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return Item.ITEMS.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
}