package org.greenpole.model.profiler;

import java.util.Map;

/**
 * <h1>ViewGroup</h1>
 * This represents a view group
 * @author Samsudeen.Yusuf
 */
public class ViewGroup  {
    private String groupName;
    private Map <String,ViewList> viewList;

    public ViewGroup(String groupName, Map<String, ViewList> viewList) {
        this.groupName = groupName;
        this.viewList = viewList;
    }

    /**
     * @return the groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @return the viewList
     */
    public Map <String,ViewList> getViewList() {
        return viewList;
    }

    /**
     * @param viewList the viewList to set
     */
    public void setViewList(Map <String,ViewList> viewList) {
        this.viewList = viewList;
    }

    
}
