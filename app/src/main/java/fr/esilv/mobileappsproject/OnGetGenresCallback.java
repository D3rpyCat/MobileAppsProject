package fr.esilv.mobileappsproject;

import java.util.List;

public interface OnGetGenresCallback {

    void onSuccess(List<Genre> genres);

    void onError();
}
