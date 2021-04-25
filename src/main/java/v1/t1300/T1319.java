package v1.t1300;

import java.util.ArrayList;
import java.util.List;

public class T1319 {
    public class Connect {
        int type;
        Connect next = null;

        public Connect(int type) {
            this.type = type;
        }

        public Connect getEndConnect() {
            Connect end = this;
            while (end.next != null) {
                end = end.next;
            }
            return end;
        }

        public void updateNextConnect(Connect connect){
            if (this.next != null) {
                this.next.updateNextConnect(connect);
            }
            this.next = connect;
        }

    }

    public int makeConnected(int n, int[][] connections) {
        if (n - 1 > connections.length) {
            return -1;
        }
        Integer[] listIds = new Integer[n];
        List<Connect> list = new ArrayList<>();

        int newType = 1;
        int typeCount = 0;
        for (int i = 0; i < connections.length; i++) {
            int x = connections[i][0];
            int y = connections[i][1];
            if (listIds[x] == null && listIds[y] == null) {
                listIds[x] = list.size();
                listIds[y] = listIds[x];
                n -= 2;
                list.add(new Connect(newType++));
                typeCount++;
            } else if (listIds[x] == null && listIds[y] != null) {
                listIds[x] = listIds[y];
                n--;
            } else if (listIds[x] != null && listIds[y] == null) {
                listIds[y] = listIds[x];
                n--;
            } else {
                Connect cy = list.get(listIds[y]);
                Connect cx = list.get(listIds[x]);
                int typeY = cy.getEndConnect().type;
                int typeX = cx.getEndConnect().type;
                if (typeX != typeY) {
                    if (typeX < typeY) {
                        cy.updateNextConnect(cx);
                    }else{
                        cx.updateNextConnect(cy);
                    }
                    typeCount--;
                }
            }
        }

        return n + typeCount -1 ;

    }
}
