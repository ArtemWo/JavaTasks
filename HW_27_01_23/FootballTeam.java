package HW_TasksJava.HW_27_01_23;

import java.util.Calendar;

class Match2 {
    private Calendar date;
    private String team1, resut, team2, watchers, stadium;

    public Match2(Calendar date, String team1, String resut, String team2, String watchers, String stadium) {
        this.date = date;
        this.team1 = team1;
        this.resut = resut;
        this.team2 = team2;
        this.watchers = watchers;
        this.stadium = stadium;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getResut() {
        return resut;
    }

    public int getResult1() {
        return Integer.parseInt(resut.split(":")[0]);
    }

    public int getResult2() {
        return Integer.parseInt(resut.split(":")[1]);
    }

    public void setResut(String resut) {
        this.resut = resut;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getWatchers() {
        if (watchers.contains("NULL"))
            return 0;
        else
            return Integer.parseInt(watchers);
    }

    public void setWatchers(String watchers) {
        this.watchers = watchers;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    @Override
    public String toString() {
        return date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DATE) + " " + team1 + " " + getResult1() + ":" + getResult2() + " " + team2 + " " + getWatchers();
    }
}