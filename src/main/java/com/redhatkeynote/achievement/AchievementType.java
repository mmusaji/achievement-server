package com.redhatkeynote.achievement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="achievementType")
public class AchievementType {
    /**
     * The achievement type
     */
    private String achievementType;
    /**
     * The description of the achievement
     */
    private String description;

    public String getAchievementType() {
        return achievementType;
    }

    public void setAchievementType(String achievementType) {
        this.achievementType = achievementType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
