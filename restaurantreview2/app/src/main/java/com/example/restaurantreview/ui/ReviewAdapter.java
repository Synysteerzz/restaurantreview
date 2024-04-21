package com.example.restaurantreview.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantreview.R;
import com.example.restaurantreview.data.response.CustomerReviewsItem;
import com.example.restaurantreview.databinding.ItemReviewBinding;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {
    private final ArrayList<String> listReview;
    public ReviewAdapter(ArrayList<String> listReview) {
        this.listReview = listReview;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_review, viewGroup, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final
    int position) {
        viewHolder.tvItem.setText(listReview.get(position));
    }

    @Override
    public int getItemCount() {
        return listReview.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvItem;

        public ViewHolder(View view) {
            super(view);
            tvItem = view.findViewById(R.id.tvItem);
        }
    }

//    public class ReviewAdapter extends ListAdapter<CustomerReviewsItem, ReviewAdapter.MyViewHolder>(DIFF_CALLBACK) {
//
//            @override
//            fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHolder {
//            val binding = ItemReviewBinding.inflate(LayoutInflater.from(parent.context), parent, false);
//            return MyViewHolder(binding);
//            }
//            @override
//            fun onBindViewHolder(holder: MyViewHolder, position: Int){
//            val review = getItem(position);
//            holder.bind(review);
//        }
//
//        class MyViewHolder(private val binding: ItemReviewBinding): RecyclerView.ViewHolder(binding.root) {
//            fun bind(review: CustomerReviewsItem){
//                binding.tvItem.text = "${review.review}\n- ${review.name}";
//
//            }
//        }
//
//        companion object {
//            val DIFF_CALLBACK = object : DiffUtil.ItemCallback<CustomerReviewsItem>() {
//                override fun areItemsTheSame(oldItem: CustomerRevie wsItem, newItem:CustomerReviewsItem): Boolean {
//                    return oldItem == newItem;
//                }
//
//                override fun areContentsTheSame(oldItem: CustomerRe viewsItem, newItem: CustomerReviewsItem): Boolean {
//                    return oldItem == newItem;
//                }
//            }
//        }
//
//    }

}
