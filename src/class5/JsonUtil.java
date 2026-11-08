package class5;

// JSON 글자에서 원하는 값만 꺼내는 아주 단순한 도우미
// (진짜 JSON 해석기는 아님 — 수업용)
public class JsonUtil {
    // json 안에서 "key": 다음 값을 처음부터 찾아 꺼낸다
    public static String getValue(String json, String key) {
        return getValue(json, key, 0);
    }
    // fromIndex 위치부터 찾는다 (같은 key가 여러 번 나올 때 사용)
    public static String getValue(String json, String key, int fromIndex) {
        String pattern = "\"" + key + "\":";
        int start = json.indexOf(pattern, fromIndex);
        if (start == -1) return null; // 못 찾음
        start = start + pattern.length();
        while (json.charAt(start) == ' ') start++; // 공백 건너뛰기
        if (json.charAt(start) == '"') { // 문자열 값: "..." 사이
            int end = json.indexOf('"', start + 1);
            return json.substring(start + 1, end);
        }
        int end = start; // 숫자·true/false 값: , } ] 앞까지
        while (end < json.length() && ",}]".indexOf(json.charAt(end)) == -1)
            end++;
        return json.substring(start, end).trim();
    }
}