package net.zionfox.coffeeshop;

import android.app.Activity;

/**
 * Created by Zion Fox on 24/10/2017.
 */

public class Drink extends Activity { //Activity extension needed for resources
    private String name, desc;
    private int imgResID;

    public static final Drink[] drinks = {
        new Drink(R.string.dname_latte, R.string.ddesc_late, R.drawable.latte),
        new Drink(R.string.dname_cappuccino, R.string.ddesc_cappuccino, R.drawable.cappuccino),
        new Drink(R.string.dname_filtered, R.string.ddesc_filtered, R.drawable.filter)
    };

    public Drink(int name, int desc, int img) {
        this.name = getString(name);
        this.desc = getString(desc);
        this.imgResID = img;
    }

    public String getName() { return this.name; }
    public String getDesc() { return this.desc; }
    public int getImgResID() { return this.imgResID; }
    public String toString() { return getName(); }
}
