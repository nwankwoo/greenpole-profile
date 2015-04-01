/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.model.profiler;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * <h1>Profiler</h1>
 * This class is responsible for building user profile
 * @author Yusuf Samsudeen Babashola 
 */
public class Profiler {
    
    private UserProfile userProfile;
    private String role;
    

    /**
     * @return the userProfile
     */
    public UserProfile getUserProfile() {
        if(this.role.equals("ROLE_ADMIN")){
            this.buildAdminProfile();
        }
        else{
            this.buildProfile();
        }
        return userProfile;
    }

    /**
     * @param userProfile the userProfile to set
     */
    private void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    
    public  void buildProfile(){
        
    }
    
    /**
     * This method builds a user profile
     */
    public void buildAdminProfile(){
        UserDetails user=new UserDetails("Samsudeen","Babashola","Yusuf","IT-Software","samsudeen.yusuf@africaprudentialregistrars.com");
        
        //User Management
        Map<String,RelatedTask> relatedTask=new HashMap();
        
        
        Map<String,ViewList> viewList=new HashMap();
        viewList.put(this.getKey(32), new ViewList("Create New User","createNewUser",relatedTask,"regular_view","org.greenpole.model.usermanagement.User"));
        viewList.put(this.getKey(32), new ViewList("Edit User","editUser",relatedTask,"regular_view",""));
        viewList.put(this.getKey(32), new ViewList("Query User","queryUser",relatedTask,"regular_view",""));
        viewList.put(this.getKey(32), new ViewList("Query User Activity Log","queryActivityLog",relatedTask,"regular_view",""));
        
        Map<String,ViewGroup> viewGroup=new HashMap();
        viewGroup.put(this.getKey(32),new ViewGroup("User Management",viewList));
        
       //Application Management
        
        relatedTask=new HashMap();
        
        viewList=new HashMap();
        viewList.put(this.getKey(32), new ViewList("Add New Requirements","addNewRequirements",relatedTask,"regular_view",""));
        viewList.put(this.getKey(32), new ViewList("Create New Requirements Group","createNewRequirementGroup",relatedTask,"regular_view",""));
        viewList.put(this.getKey(32), new ViewList("Assign Requirements to Group","assignRequirementsToGroup",relatedTask,"regular_view",""));
        viewList.put(this.getKey(32), new ViewList("Assign Requirements Group to User","assignRequirementsGroupToUser",relatedTask,"regular_view",""));
        viewList.put(this.getKey(32), new ViewList("Filter Assigned Requirements to User","filterAssignedRequirementsToUser",relatedTask,"regular_view",""));
        viewList.put(this.getKey(32), new ViewList("Filter User Assigned Requirements Related Task","filterUserAssignedRequirementsRelatedTask",relatedTask,"regular_view",""));
        
        viewGroup.put(this.getKey(32), new ViewGroup("Application Management",viewList));
        this.setUserProfile(new UserProfile(user,"regular_user","LEVEL 09",viewGroup,50000,50000));
    }
    private  String getKey(int length){
        String characters="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNONPQRSTUVWXYZ";
        String key="";
        Random rand=new Random();
        for(int i=0;i<length;i++){
            key+=characters.charAt(rand.nextInt(62)+1);
        }
        return key;
    }
}
