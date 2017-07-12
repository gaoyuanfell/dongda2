package moka.menu.bo;

import moka.basic.bo.IdEntity;

import java.io.Serializable;

/**
 * Created by moka on 2017/7/12 0012.
 */
public class MenuRole extends IdEntity implements Serializable{
    private int menuid;

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }
}
