package com.populargeng.trackamechanic.Service;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.populargeng.trackamechanic.Common.Common;
import com.populargeng.trackamechanic.Model.Token;

/**
 * Created by mathemartins on 3/31/2018.
 */

public class MyFirebaseIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        updateTokenToServer(refreshedToken); // get new token from firebase once token is changed
    }

    private void updateTokenToServer(String refreshedToken) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference tokens = db.getReference(Common.token_tbl);

        Token token = new Token(refreshedToken);
        if(FirebaseAuth.getInstance().getCurrentUser() != null) // check if request.user.is_authenticated()
            tokens.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(token);
    }
}
