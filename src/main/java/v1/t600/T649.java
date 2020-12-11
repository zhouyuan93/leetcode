package v1.t600;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yuan.zhou
 */
public class T649 {
    public String predictPartyVictory(String senate) {
        Queue<Character> unUseQueue = new LinkedList<>();
        Queue<Character> useQueue = new LinkedList<>();

        int r = 0;
        int d = 0;
        //init Queue
        for (int i = 0; i < senate.length(); i++) {
            char c = senate.charAt(i);

            switch (c) {
                case 'D':
                    if (unUseQueue.isEmpty()) {
                        unUseQueue.add(c);
                        d++;
                    }else{
                        if (unUseQueue.peek() == 'D') {
                            unUseQueue.add(c);
                            d++;
                        }else{
                            useQueue.add(unUseQueue.poll());
                        }
                    }
                    break;
                case 'R':
                    if (unUseQueue.isEmpty()) {
                        unUseQueue.add(c);
                        r++;
                    }else{
                        if (unUseQueue.peek() == 'R') {
                            unUseQueue.add(c);
                            r++;
                        }else{
                            useQueue.add(unUseQueue.poll());
                        }
                    }
                    break;
                default:
                    throw new RuntimeException("error");
            }

        }



        if (d == 0) {
            return "Radiant";
        }
        if (r == 0) {
            return "Dire";
        }

        while (!useQueue.isEmpty()) {
            Queue<Character> queue = useQueue;
            useQueue = new LinkedList<>();
            while (!queue.isEmpty()) {
                char c = queue.poll();

                if (d == 0) {
                    return "Radiant";
                }
                if (r == 0) {
                    return "Dire";
                }

                switch (c) {
                    case 'D':
                        if (unUseQueue.isEmpty()) {
                            unUseQueue.add(c);
                        }else{
                            if (unUseQueue.peek() == 'D') {
                                unUseQueue.add(c);
                            }else{
                                useQueue.add(unUseQueue.poll());
                                d--;
                            }
                        }
                        break;
                    case 'R':
                        if (unUseQueue.isEmpty()) {
                            unUseQueue.add(c);
                        }else{
                            if (unUseQueue.peek() == 'R') {
                                unUseQueue.add(c);
                            }else{
                                useQueue.add(unUseQueue.poll());
                                r--;
                            }
                        }
                        break;
                    default:
                        throw new RuntimeException("error");
                }

            }
        }

        return "";

    }
}
