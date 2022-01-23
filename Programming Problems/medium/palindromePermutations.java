boolean solution(String inputString) {
    Set<Character> oddChars = new HashSet<>();

    for (char c : inputString.toCharArray()) {

        if (!oddChars.add(c)) {

            oddChars.remove(c);
        }
    }

    return oddChars.size() <= 1;
}
