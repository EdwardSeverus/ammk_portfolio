class VotingAge {

    int eligibleAge;

    VotingAge(int age) {

        eligibleAge = age;

    }

    void isEligible(int user_age) {

        if (user_age >= eligibleAge) {

            System.out.println("You are Eligible for Voting");

        } else {

            System.out.println("You are NOT Eligible for Voting");

        }

    }

}

public class VotingAgeCon {

    public static void main(String args[]) {

        VotingAge v1 = new VotingAge(18); // for India

        v1.isEligible(22); // print Eligible

        VotingAge v2 = new VotingAge(16); // for Argentina

        v2.isEligible(15); // print Not Eligible

    }

}

