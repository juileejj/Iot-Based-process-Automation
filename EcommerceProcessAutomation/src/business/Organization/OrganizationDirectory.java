/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class OrganizationDirectory  {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList= new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Warehouse.getValue())){
            organization = new WarehouseOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Logistics.getValue())){
            organization = new LogisticsOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Customer.getValue()))
        {
            organization= new CustomerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
