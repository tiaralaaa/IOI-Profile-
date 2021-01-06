package id.ac.unhas.ioiprofilelist.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.ac.unhas.ioiprofilelist.model.Member;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import id.ac.unhas.ioiprofilelist.MoreDetailMembers;
import id.ac.unhas.ioiprofilelist.R;

import java.util.ArrayList;

public class CardViewMemberAdapter extends RecyclerView.Adapter<CardViewMemberAdapter.CardViewViewHolder> {
    private ArrayList<Member> listMember;
    private CardViewMemberAdapter.OnItemClickCallback onItemClickCallback;

    public CardViewMemberAdapter(ArrayList<Member> list) {
        this.listMember = list;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Member data);
    }

    public void setOnItemClickCallback(CardViewMemberAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_member, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        final Member member = listMember.get(position);

        Glide.with(holder.itemView.getContext())
                .load(member.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(member.getNamaMember());
        holder.tvDetail.setText(member.getDetail());
        holder.tvRating.setText(member.getRating());

        holder.btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), listMember.get(holder.getAdapterPosition()).getNamaMember(), Toast.LENGTH_SHORT).show();

                Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailMembers.class);
                goToDetail.putExtra("FOTO", member.getPhoto());
                goToDetail.putExtra("NAMA_MEMBER", member.getNamaMember());
                goToDetail.putExtra("ABOUT", member.getMoreDetailMember());
                goToDetail.putExtra("DESKRIPSI", member.getDetail());
                goToDetail.putExtra("RATING", member.getRating());

                v.getContext().startActivity(goToDetail);
            }
        });

        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), listMember.get(holder.getAdapterPosition()).getNamaMember() + " is added to your Favorite list!", Toast.LENGTH_SHORT).show();
            }
        });

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


    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvRating;
        Button btnMore, btnFavorite;


        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_member);
            tvName = itemView.findViewById(R.id.judul);
            tvDetail = itemView.findViewById(R.id.keterangan);
            btnMore = itemView.findViewById(R.id.more);
            btnFavorite = itemView.findViewById(R.id.favorite);
            tvRating = itemView.findViewById(R.id.rating);
        }

    }

}
