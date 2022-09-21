import java.util.List;
import java.util.Map;

public class DID {
    private String seasonName;
    private List<String> brandPartners;
    private Map <ParticipantsBean, String>participants ;

    public DID() {
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public List<String> getBrandPartners() {
        return brandPartners;
    }

    public void setBrandPartners(List<String> brandPartners) {
        this.brandPartners = brandPartners;
    }

    public Map<ParticipantsBean, String> getParticipants() {
        return participants;
    }

    public void setParticipants(Map<ParticipantsBean, String> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "DID{" +
                "seasonName='" + seasonName + '\'' +
                ", brandPartners=" + brandPartners +
                ", participants=" + participants +
                '}';
    }
}
