package model.dao;

import model.dao.impl.SellerDAOJDBC;

public class DAOfactory {

    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC();
    }

}
