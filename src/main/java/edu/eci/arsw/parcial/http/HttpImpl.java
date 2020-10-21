package edu.eci.arsw.parcial.http;



import com.squareup.okhttp.OkHttpClient;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.stereotype.Service;
import java.io.IOException;
import edu.eci.arsw.parcial.modelo.*;


@Service
public class HttpImpl implements Http{

    public DatosCiudad getWeaterByCity(String city) throws Exception {
        Request request = new Request.Builder()
                .url("http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=fb628bc931e59cdf938ab90906cf2cf8")
                .get()
                .build();
        OkHttpClient client = new OkHttpClient();
        String api = null;
        Response res = null;

        try {
            res = client.newCall(request).execute();
            if (res.isSuccessful()) {
                api = res.body().string();
            }
        } catch (IOException e) {
            throw new Exception("Not Service was Found ");
        }
        Gson gson = new Gson();
        DatosCiudad stats = new DatosCiudad();
        stats = gson.fromJson(api, DatosCiudad.class);
        return stats;
    }
}
