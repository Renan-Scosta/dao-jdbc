package model.dao;

import db.DB;
import model.dao.impl.SellerDAOJDBC;

public class DAOfactory {

    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC(DB.getConnection());
    }

}
