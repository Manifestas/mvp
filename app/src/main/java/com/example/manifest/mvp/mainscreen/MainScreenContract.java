package com.example.manifest.mvp.mainscreen;

import com.example.manifest.mvp.data.Post;

import java.util.List;

public interface MainScreenContract {

    interface View {

        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {

        void loadPost();
    }
}
