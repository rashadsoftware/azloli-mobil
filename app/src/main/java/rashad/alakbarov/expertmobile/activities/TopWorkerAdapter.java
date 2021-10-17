package rashad.alakbarov.expertmobile.activities;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import rashad.alakbarov.expertmobile.R;

public class TopWorkerAdapter extends RecyclerView.Adapter<TopWorkerAdapter.ViewHolder>{

    TopWorkerData[] topWorkerData;
    Context context;

    public TopWorkerAdapter(TopWorkerData[] topWorkerDatas, MainActivity activity) {
        this.topWorkerData=topWorkerDatas;
        this.context=activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.top_worker_list_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final TopWorkerData topWorkerDataList=topWorkerData[position];
        holder.workerImage.setImageResource(topWorkerDataList.getWorkerImage());
        holder.workerPosition.setText(topWorkerDataList.getWorkerProfessional());
        holder.workerName.setText(topWorkerDataList.getWorkerName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, topWorkerDataList.getWorkerName(), Toast.LENGTH_SHORT).show();
                v.getContext().startActivity(new Intent(v.getContext(), ProfileDetailActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return topWorkerData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView workerImage;
        TextView workerName;
        TextView workerPosition;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            workerImage=itemView.findViewById(R.id.imgThumblProfile);
            workerName=itemView.findViewById(R.id.textimgThumblName);
            workerPosition=itemView.findViewById(R.id.textThumblProfessional);
        }
    }
}
