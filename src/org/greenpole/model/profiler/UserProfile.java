package org.greenpole.model.profiler;

import java.util.Map;

/**
 * <h1>UserProfile</h1>
 * This class represents a user profile
 * @author Yusuf Samsudeen Babashola 
 */
public class UserProfile {
    private UserDetails userDetails;   
    private String userType;    
    private String accessLevel;
    private Map <String,ViewGroup> views;
    private int maximumIndividualShareHoldings;
    private int maximumTotalShareHoldings;
    public UserProfile(UserDetails user, String userType, String accessLevel, Map<String, ViewGroup> views, int maximumIndividualShareHoldings,int maximumTotalShareHoldings) {
        this.userDetails = user;
        this.userType = userType;
        this.accessLevel = accessLevel;
        this.views = views;
        this.maximumIndividualShareHoldings = maximumIndividualShareHoldings;
        this.maximumTotalShareHoldings = maximumTotalShareHoldings;
    }

    /**
     * @return the user
     */
    public UserDetails getUser() {
        return userDetails;
    }

    /**
     * @param user the user to set
     */
    public void setUser(UserDetails user) {
        this.userDetails = user;
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the accessLevel
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * @param accessLevel the accessLevel to set
     */
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    /**
     * @return the views
     */
    public Map <String,ViewGroup> getViews() {
        return views;
    }

    /**
     * @param views the views to set
     */
    public void setViews(Map <String,ViewGroup> views) {
        this.views = views;
    }

    /**
     * @return the maximumIndividualShareHoldings
     */
    public int getMaximumIndividualShareHoldings() {
        return maximumIndividualShareHoldings;
    }

    /**
     * @param maximumIndividualShareHoldings the maximumIndividualShareHoldings to set
     */
    public void setMaximumIndividualShareHoldings(int maximumIndividualShareHoldings) {
        this.maximumIndividualShareHoldings = maximumIndividualShareHoldings;
    }

    
}
