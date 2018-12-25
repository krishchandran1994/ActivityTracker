package com.example.kchan.activitytracker.Singleton;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class User {
    private static User instance;
    private GoogleSignInAccount  account;

    public static User getInstance() {
        return instance;
    }

    private User(GoogleSignInAccount  account) {
        this.account = account;
    }

    public static void init(GoogleSignInAccount account){
        instance = new User(account);
    }
    public GoogleSignInAccount  getAccount() {
        return account;
    }

    public void setAccount(GoogleSignInAccount account) {
        this.account = account;
    }

}
