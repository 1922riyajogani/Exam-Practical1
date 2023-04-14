package com.example.exam_practical;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.Userholder>{



    @NonNull
    @Override
    public Userholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Userholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class Userholder extends RecyclerView.ViewHolder{

        public Userholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
