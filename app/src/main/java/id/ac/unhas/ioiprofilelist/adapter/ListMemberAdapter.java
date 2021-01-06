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


public class ListMemberAdapter extends RecyclerView.Adapter<ListMemberAdapter.ListViewHolder> {

    private ArrayList<Member> listMember;

    public ListMemberAdapter(ArrayList<Member> list) {
        this.listMember = list;
    }

    //Ketika menekan Area List

    //Objek OnItemClickCallBack
    private OnItemClickCallback onItemClickCallback;

    //Metode Set OnItemClickCallback
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Member data);
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_member, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Member member = listMember.get(position);

        //Holder Image
        Glide.with(holder.itemView.getContext())
                .load(member.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        //Holder Nama Member
        holder.tvName.setText(member.getNamaMember());
        //Holder Detail Member
        holder.tvDetail.setText(member.getDetail());
        //HolderRating Member
        holder.tvRating.setText(member.getRating());

        //Holder SetOnClick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMember.get(holder.getAdapterPosition()));

                //Intent Ke More Detail
                Intent goToDetail = new Intent(v.getContext().getApplicationContext(), MoreDetailMembers.class);
                //Mengirim Data
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

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvRating;
        //Buat Text format

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_member);
            tvName = itemView.findViewById(R.id.nama);
            tvDetail = itemView.findViewById(R.id.keterangan);
            tvRating = itemView.findViewById(R.id.rating);

        }


    }

}