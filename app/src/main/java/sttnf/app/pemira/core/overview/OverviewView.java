package sttnf.app.pemira.core.overview;

import sttnf.app.pemira.model.Login;


/**
 * Created by isfaaghyth on 11/16/17.
 * github: @isfaaghyth
 */

interface OverviewView {
    void onSuccess(Login res);
    void onError(String err);

    void nimCanged(String s);
}
