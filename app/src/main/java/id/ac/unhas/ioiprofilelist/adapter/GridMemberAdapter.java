package id.ac.unhas.ioiprofilelist.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.ac.unhas.ioiprofilelist.MoreDetailMembers;
import id.ac.unhas.ioiprofilelist.model.Member;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import id.ac.unhas.ioiprofilelist.R;

import java.util.ArrayList;

public class GridMemberAdapter extends RecyclerView.Adapter<GridMemberAdapter.GridViewHolder> {
    private ArrayList<Member> listMember;

    public GridMemberAdapter(ArrayList<Member> list) {
        this.listMember = list;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Member data);
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_member, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        final Member member = listMember.get(position);
        Glide.with(holder.itemView.getContext())
                .load(listMember.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvRating.setText(member.getRating());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMember.get(holder.getAdapterPosition()));

                Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailMembers.class);
                goToDetail.putExtra("FOTO", member.getPhoto());
                goToDetail.putExtra("NAMA_MEMBER", member.getNamaMember());
                goToDetail.putExtra("ABOUT", member.getMoreDetailMember());
                goToDetail.putExtra("DESKRIPSI", member.getDetail());
                goToDetail.putExtra("RATING", member.getRating());

                v.getContext().startActivity(goToDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMember.size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvRating;

        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_member);
            tvRating = itemView.findViewById(R.id.rating);
        }
    }

}

