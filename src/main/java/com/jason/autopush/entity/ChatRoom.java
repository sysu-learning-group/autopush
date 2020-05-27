package com.jason.autopush.entity;

public class ChatRoom {
    private Integer id;

    private String name;

    private String explain;

    private String icon;

    private Byte isHot;

    private Byte roomType;

    private Integer sort;

    private Byte saveDb;

    private Byte noSay;

    private String admins;

    private Byte state;

    private Byte joinType;

    private Byte userLevel;

    private Byte agentLevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    public Byte getRoomType() {
        return roomType;
    }

    public void setRoomType(Byte roomType) {
        this.roomType = roomType;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Byte getSaveDb() {
        return saveDb;
    }

    public void setSaveDb(Byte saveDb) {
        this.saveDb = saveDb;
    }

    public Byte getNoSay() {
        return noSay;
    }

    public void setNoSay(Byte noSay) {
        this.noSay = noSay;
    }

    public String getAdmins() {
        return admins;
    }

    public void setAdmins(String admins) {
        this.admins = admins == null ? null : admins.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getJoinType() {
        return joinType;
    }

    public void setJoinType(Byte joinType) {
        this.joinType = joinType;
    }

    public Byte getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Byte userLevel) {
        this.userLevel = userLevel;
    }

    public Byte getAgentLevel() {
        return agentLevel;
    }

    public void setAgentLevel(Byte agentLevel) {
        this.agentLevel = agentLevel;
    }
}