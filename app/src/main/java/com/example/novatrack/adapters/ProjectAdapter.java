package com.example.novatrack.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.novatrack.R;
import com.example.novatrack.models.Project;

import java.util.List;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {

    private List<Project> projectList;
    private OnProjectLongClickListener listener;

    public interface OnProjectLongClickListener {
        void onProjectLongClick(Project project, View view);
    }

    public ProjectAdapter(List<Project> projectList, OnProjectLongClickListener listener) {
        this.projectList = projectList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_project, parent, false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        Project project = projectList.get(position);
        holder.bind(project, listener);
    }

    @Override
    public int getItemCount() {
        return projectList.size();
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder {
        TextView titleText, progressText, statusText, updateTimeText;
        ProgressBar progressBar;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.projectTitle);
            progressText = itemView.findViewById(R.id.progressText);
            statusText = itemView.findViewById(R.id.statusText);
            updateTimeText = itemView.findViewById(R.id.updateTimeText);
            progressBar = itemView.findViewById(R.id.progressBar);
        }

        public void bind(Project project, OnProjectLongClickListener listener) {
            titleText.setText(project.getTitle());
            progressText.setText(project.getProgress() + "%");
            statusText.setText(project.getStatus());
            progressBar.setProgress(project.getProgress());

            String timeAgo = getTimeAgo(project.getUpdatedAt());
            updateTimeText.setText("Updated " + timeAgo);

            if (project.getStatus().equals("Completed")) {
                statusText.setBackgroundResource(R.drawable.bg_status_completed);
            } else {
                statusText.setBackgroundResource(R.drawable.bg_status_in_progress);
            }

            itemView.setOnLongClickListener(v -> {
                listener.onProjectLongClick(project, v);
                return true;
            });
        }

        private String getTimeAgo(long timestamp) {
            long now = System.currentTimeMillis();
            long diff = now - timestamp;

            long seconds = diff / 1000;
            long minutes = seconds / 60;
            long hours = minutes / 60;
            long days = hours / 24;

            if (days > 0) {
                return days + "d ago";
            } else if (hours > 0) {
                return hours + "h ago";
            } else if (minutes > 0) {
                return minutes + "m ago";
            } else {
                return "Just now";
            }
        }
    }
}