/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.*;

/**
 *
 * @author amry4
 */
public interface InterfaceRegionsManagement {

    public boolean insertOrUpdate(EntityRegion Er, boolean isInsert);

    public boolean delete(int id);

    public List<EntityRegion> getALL();

}
