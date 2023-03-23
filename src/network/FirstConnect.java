package network;

import java.io.IOException;
import java.net.URL;

public class
FirstConnect {
    public static void main(String[] args) throws IOException {
        ConnectURI koneksisaya = new ConnectURI();
        URL myAddres = koneksisaya.buildURL
                ("https://harber.mimoapps.xyz/api/getaccess.php");
        String response = koneksisaya.getResponseFromHttpUrl(myAddres);
        System.out.println(response);

    }
}
