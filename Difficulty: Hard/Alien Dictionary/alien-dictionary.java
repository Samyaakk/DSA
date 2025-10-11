import java.util.*;

class Solution {

    public List<Integer> topoSort(int[] ind, List<List<Integer>> list, Set<Character> set) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            if (set.contains((char)(i + 'a')) && ind[i] == 0)
                q.add(i);
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node);
            for (int i : list.get(node)) {
                ind[i]--;
                if (ind[i] == 0)
                    q.add(i);
            }
        }
        return res;
    }

    public String findOrder(String[] words) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 26; i++)
            list.add(new ArrayList<>());

        Set<Character> set = new HashSet<>();
        for (String word : words) {
            for (char c : word.toCharArray())
                set.add(c);
        }

        int[] ind = new int[26];

        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];
            int len = Math.min(s1.length(), s2.length());

            // Check invalid prefix case
            if (s1.length() > s2.length() && s1.startsWith(s2))
                return "";

            for (int j = 0; j < len; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    int u = s1.charAt(j) - 'a';
                    int v = s2.charAt(j) - 'a';
                    list.get(u).add(v);
                    ind[v]++;
                    break;
                }
            }
        }

        List<Integer> topo = topoSort(ind, list, set);

        // Check for cycles
        if (topo.size() < set.size())
            return "";

        StringBuilder sb = new StringBuilder();
        for (int i : topo) {
            if (set.contains((char)(i + 'a')))
                sb.append((char)(i + 'a'));
        }

        return sb.toString();
    }
}
