package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamIntermediate06 {
    public static void main(String[] args) {
        List<Match> matchList = Arrays.asList(
                new Match("FootballMatch", 11),
                new Match("BasketballMatch", 7),
                new Match("Soccer", 7),
                new Match("Tennis", 2)
        );

        Optional<String> matchName = matchList.stream()
                .map(Match::getMatchName)
                .filter(name -> name.endsWith("Match"))
                .sorted()
                .findFirst();
        System.out.println("Result: " + matchName.orElse("match no found"));
    }
}
