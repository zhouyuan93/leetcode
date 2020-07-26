package v1;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Boolean[][] memory = new Boolean[numCourses][numCourses];

        for (int[] prerequisite : prerequisites) {
            if (!validateAndCheckMemory(memory, prerequisite)) {
                return false;
            }
        }

        return true;
    }

    private boolean validateAndCheckMemory(Boolean[][] memory, int[] prerequisite) {
        int x = prerequisite[0];
        int y = prerequisite[1];
        Boolean xNeedY = memory[x][y];
        Boolean yNeedX =  memory[y][x];
        if (xNeedY == null && yNeedX == null) {
            memory[x][y] = Boolean.TRUE;
            memory[y][x] = Boolean.FALSE;
            //维护依赖相关
            for (int i = 0; i < memory[y].length; i++) {
                if (Boolean.TRUE.equals(memory[y][i])) {
                    if (!validateAndCheckMemory(memory, new int[]{x, i})) {
                        return false;
                    }
                }
            }
            return true;
        }else if(Boolean.TRUE.equals(xNeedY) && Boolean.FALSE.equals(yNeedX)){
            return true;
        }else{
            return false;
        }
    }


}
