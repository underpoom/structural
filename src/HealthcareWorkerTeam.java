import java.util.HashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> members = new HashSet<HealthcareServiceable>();
    
    public void addMember(HealthcareServiceable member){
        members.add(member);
    };

    public void removeMember(HealthcareServiceable member){
        members.remove(member);
    };

    public void service()
    {
        for(HealthcareServiceable member: members){
            member.service();
        }
    };
    public double getPrice() {
        double price = 0;
        for(HealthcareServiceable member: members){
            price+=member.getPrice();
        }
        return price;
    }
}
