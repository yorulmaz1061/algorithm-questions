package codewarsQuestions.highLevel;

public class TrilingualDemocracy {
    public static void main(String[] args) {
        char[] gr = {'F', 'K', 'I'};

        System.out.println(trilingualDemocracy(gr));

    }

    public static char trilingualDemocracy(char[] group) {
        if (group[0] == group[1]) return group[2];
        if (group[0] == group[2]) return group[1];
        if (group[1] == group[2]) return group[0];
        for (char ch : new char[] { 'D', 'F', 'I', 'K' }) {
            if (group[0] != ch && group[1] != ch && group[2] != ch) return ch;
        }
        return '?';
    }
}








