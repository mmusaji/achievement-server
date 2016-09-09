package com.redhatkeynote.achievement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="achievement")
public class Achievement {
    /**
     * The achievement code
     */
    private String achievementType;
    /**
     * Has the achievement been reached?
     */
    private boolean achieved;

    public String getAchievementType() {
        return achievementType;
    }

    public void setAchievementType(String achievementType) {
        this.achievementType = achievementType;
    }

    public boolean isAchieved() {
        return achieved;
    }

    public synchronized void setAchieved(boolean achieved) {
        this.achieved = achieved;
    }
}
