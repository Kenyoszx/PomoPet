package com.pomopet.data;
import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private String groupName;
    private boolean streak;
    private int timeTarget;
    private int membershipCount;
    private List<Student> members;

// Construtor ->
    
    public Grupo(String groupName, int timeTarget,List<String> nomeDosMembros) {
        this.groupName = groupName;
        this.streak = false;
        this.timeTarget = timeTarget;
        this.members = new ArrayList<>();
        for (String nomeDoMembro : nomeDosMembros) {
            Student newStudent = new Student(nomeDoMembro);
            this.members.add(newStudent);
        }
    }
    
    
// Getters e Setters ->
    
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public boolean isStreak() {
        return streak;
    }

    public void setStreak(boolean streak) {
        this.streak = streak;
    }

    public int getTimeTarget() {
        return timeTarget;
    }

    public void setTimeTarget(int timeTarget) {
        this.timeTarget = timeTarget;
    }

    public int getMembershipCount() {
        return membershipCount;
    }

    public void setMembershipCount(int membershipCount) {
        this.membershipCount = membershipCount;
    }

    public List<Student> getMembers() {
        return members;
    }

    public void setMembers(List<Student> members) {
        this.members = members;
    }
    
    @Override
    public String toString() {
        return groupName + " - " + members.size() + " Membros "  + " - Meta: " + timeTarget + " min/dia";
    }
}
