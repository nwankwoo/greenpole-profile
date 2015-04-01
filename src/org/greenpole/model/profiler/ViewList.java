/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.model.profiler;

import java.util.Map;

/**
 * This represents all the view list assigned to a view group
 * @author Yusuf Samsudeen Babashola 
 */
public class ViewList {
    private String viewTitle;
    private String viewName;
    private Map <String,RelatedTask> relatedTaskList;
    private String viewType;
    private String viewModel;
    
    public ViewList(String viewTitle, String viewName, Map<String, RelatedTask> relatedTaskList, String viewType, String viewModel) {
        this.viewTitle = viewTitle;
        this.viewName = viewName;
        this.relatedTaskList = relatedTaskList;
        this.viewType = viewType;
        this.viewModel = viewModel; 
    }

    

    /**
     * @return the viewName
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * @param viewName the viewName to set
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    /**
     * @return the relatedTaskList
     */
    public Map <String,RelatedTask> getRelatedTaskList() {
        return relatedTaskList;
    }

    /**
     * @param relatedTaskList the relatedTaskList to set
     */
    public void setRelatedTaskList(Map <String,RelatedTask> relatedTaskList) {
        this.relatedTaskList = relatedTaskList;
    }

    /**
     * @return the viewType
     */
    public String getViewType() {
        return viewType;
    }

    /**
     * @param viewType the viewType to set
     */
    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    /**
     * @return the viewTitle
     */
    public String getViewTitle() {
        return viewTitle;
    }

    /**
     * @param viewTitle the viewTitle to set
     */
    public void setViewTitle(String viewTitle) {
        this.viewTitle = viewTitle;
    }

    /**
     * @return the viewModel
     */
    public String getViewModel() {
        return viewModel;
    }

    /**
     * @param viewModel the viewModel to set
     */
    public void setViewModel(String viewModel) {
        this.viewModel = viewModel;
    }

    
}
