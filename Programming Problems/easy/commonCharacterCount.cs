int solution(string s1, string s2) {
    return s1.Distinct().Sum(_ => Math.Min(s1.Count(l => l == _), s2.Count(l => l == _)));
}
