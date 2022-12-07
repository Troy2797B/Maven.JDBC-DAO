package models;

public class KpopGroup implements DTOInterface{
    //fields from SQL table
    private Integer id;
    private String groupName;
    private Integer debutDate;
    private String leaderName;
    private Integer singerCount;
    private Integer rapperCount;

    //construct a kpop group

    public KpopGroup(Integer id, String groupName, Integer debutDate, String leaderName, Integer singerCount, Integer rapperCount){
        this.id = id;
        this.groupName = groupName;
        this.debutDate = debutDate;
        this.leaderName = leaderName;
        this.singerCount = singerCount;
        this.rapperCount = rapperCount;
    }
    public KpopGroup(String groupName, Integer debutDate, String leaderName, Integer singerCount, Integer rapperCount){
        this.groupName = groupName;
        this.debutDate = debutDate;
        this.leaderName = leaderName;
        this.singerCount = singerCount;
        this.rapperCount = rapperCount;
    }

    //Check notes to see where you left off

    public KpopGroup(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(int debutDate) {
        this.debutDate = debutDate;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public int getSingerCount() {
        return singerCount;
    }

    public void setSingerCount(int singerCount) {
        this.singerCount = singerCount;
    }

    public int getRapperCount() {
        return rapperCount;
    }

    public void setRapperCount(int rapperCount) {
        this.rapperCount = rapperCount;
    }
}
