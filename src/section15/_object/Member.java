package section15._object;

public class Member {
    private int memberId;
    private String memberName;

    public int getmemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member compare = (Member) obj;

            if (this.memberId == compare.memberId) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
