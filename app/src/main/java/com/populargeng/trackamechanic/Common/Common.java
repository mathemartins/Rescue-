package com.populargeng.trackamechanic.Common;

import com.populargeng.trackamechanic.Remote.FCMClient;
import com.populargeng.trackamechanic.Remote.IFCMService;

/**
 * Created by mathemartins on 3/29/2018.
 */

public class Common {

    public static final String mechanic_tbl = "Mechanics";
    public static final String user_mechanic_tbl = "MechanicInformation";
    public static final String user_client_tbl = "ClientsInformation";
    public static final String repair_request_tbl = "RepairRequest";
    public static final String token_tbl = "Tokens";

    public static final String fcmURL = "https://fcm.googleapis.com/";

    public static IFCMService getFCMService() {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
