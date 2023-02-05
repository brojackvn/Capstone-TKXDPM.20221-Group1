package subsystem.interbanksystem;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.json.JSONException;

import java.io.IOException;

public class InterbankBoundary {

    public JSONObject request(String transactionRequest) throws IOException, JSONException {
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpPatch httpPatch = new HttpPatch(Config.BASE_URL + "/api/card/processTransaction");
//        httpPatch.setEntity(new StringEntity(transactionRequest, ContentType.APPLICATION_JSON));
//        HttpResponse httpResponse = httpClient.execute(httpPatch);
//        int statusCode = httpResponse.getStatusLine().getStatusCode();
//
//        if (statusCode != 200)
//        {
//            throw new RuntimeException("Failed with HTTP error code : " + statusCode);
//        }
//        HttpEntity httpEntity = httpResponse.getEntity();
//        return new JSONObject(EntityUtils.toString(httpEntity));
        JSONObject tr = new JSONObject(transactionRequest);
        String contentTransaction = tr.get("transaction").toString();
        String response = "{\"errorCode\":00,\"transaction\":" + contentTransaction + "}";
        return new JSONObject(response);
    }
}
