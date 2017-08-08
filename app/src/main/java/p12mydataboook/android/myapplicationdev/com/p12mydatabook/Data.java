package p12mydataboook.android.myapplicationdev.com.p12mydatabook;

import java.io.Serializable;

/**
 * Created by 15017470 on 8/8/2017.
 */

public class Data implements Serializable{
    private int id;
    private String data;

    public Data(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
