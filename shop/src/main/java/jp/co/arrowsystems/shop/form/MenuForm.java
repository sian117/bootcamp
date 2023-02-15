package jp.co.arrowsystems.shop.form;

import jp.co.arrowsystems.shop.common.AbstractBaseForm;

public class MenuForm extends AbstractBaseForm {

    private String id;
    private String password;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}
