package week2_homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();
        String first = br.readLine();
        sb.append("[ ").append(first).append(" ");
        int i = 0;

        while (true) {

            String input = br.readLine();

            // 종료 조건
            if (input.equals("끝")) break;

            if (first.equals("List")) {
                list.add(input);
            } else if (first.equals("Set")) {
                if(i == 0){
                    set.add( "으로 저장된" + input + " ]");
                } else {
                    set.add((i) +". " + input);
                }
                set.stream().forEach(e-> sb.append(e).append("\n"));
                set.clear();
                i++;

            } else if (first.equals("Map")) {
                map.put(i, input);
                i++;
            }
        }

        if (first.equals("Map")) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getKey() == 0) {
                    sb.append("으로 저장된 ")
                            .append(entry.getValue())
                            .append(" ]")
                            .append("\n");
                } else {
                    sb.append(entry.getKey())
                            .append(". ")
                            .append(entry.getValue())
                            .append("\n");
                }
            }
        } else if (first.equals("List")) {
            for (int j = 0; j < list.size(); j++) {
                if (j == 0) {
                    sb.append("으로 저장된 ")
                            .append(list.get(j))
                            .append(" ]")
                            .append("\n");
                } else {
                    sb.append(j)
                            .append(". ")
                            .append(list.get(j))
                            .append("\n");
                }

            }
        }

        System.out.println(sb.toString());
    }

}
