
package org.greenpole.model.profiler;

/**
 * <h1>RelatedTask</h1>
 * This class represents a Related Task to a particular requirement
 * @author Yusuf Samsudeen Babashola 
 */
public class RelatedTask {
    private String taskName;
    private String taskViewName;

    public RelatedTask(String taskName, String taskViewName) {
        this.taskName = taskName;
        this.taskViewName = taskViewName;
    }

    /**
     * @return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * @return the taskViewName
     */
    public String getTaskViewName() {
        return taskViewName;
    }

    /**
     * @param taskViewName the taskViewName to set
     */
    public void setTaskViewName(String taskViewName) {
        this.taskViewName = taskViewName;
    }

   
}
