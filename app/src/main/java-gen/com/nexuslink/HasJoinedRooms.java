package com.nexuslink;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table HAS_JOINED_ROOMS.
 */
public class HasJoinedRooms {

    private Long id;
    private Integer rId;
    private String RoomName;
    private Integer PersonNum;
    private String StartTime;
    private Integer Goal;
    private Integer Type;

    public HasJoinedRooms() {
    }

    public HasJoinedRooms(Long id) {
        this.id = id;
    }

    public HasJoinedRooms(Long id, Integer rId, String RoomName, Integer PersonNum, String StartTime, Integer Goal, Integer Type) {
        this.id = id;
        this.rId = rId;
        this.RoomName = RoomName;
        this.PersonNum = PersonNum;
        this.StartTime = StartTime;
        this.Goal = Goal;
        this.Type = Type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String RoomName) {
        this.RoomName = RoomName;
    }

    public Integer getPersonNum() {
        return PersonNum;
    }

    public void setPersonNum(Integer PersonNum) {
        this.PersonNum = PersonNum;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public Integer getGoal() {
        return Goal;
    }

    public void setGoal(Integer Goal) {
        this.Goal = Goal;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

}
