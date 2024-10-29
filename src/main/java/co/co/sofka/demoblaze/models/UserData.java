package co.co.sofka.demoblaze.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserData {
    static String user;
    static String pass;

    public static List<UserData> setData(DataTable table){
        List<UserData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList){
            data.add(new ObjectMapper().convertValue(map, UserData.class));
        }
        return data;
    }


    public static String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
