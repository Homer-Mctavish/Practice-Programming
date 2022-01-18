std::vector<std::string> solution(std::vector<std::string> picture) {
  for (auto &s : picture)
    s = "*" + s + "*";
  picture.insert(picture.begin(), string(picture[0].size(), '*'));
  picture.insert(picture.end(), string(picture[0].size(), '*'));
  return picture;
}
