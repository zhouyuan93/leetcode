package v1.t600;

/**
 * @author yuan.zhou
 */
public class T659 {

    public boolean isPossible(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        ResModel model = new ResModel();

        int x = nums[0];
        int xCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != x) {
                if (!model.addNum(x, xCount)) {
                    return false;
                }
                x = nums[i];
                xCount = 0;
            }
            xCount++;
        }

        //最后一个数
        if (!model.addNum(x, xCount)) {
            return false;
        }

        return model.p1 == 0 && model.p2 == 0;

    }

    class ResModel {
        int p1;
        int p2;
        int p3;
        Integer nextNum;

        public boolean addNum(int num, int numCount) {
            //model为空
            if (nextNum == null) {
                p1 = numCount;
                p2 = 0;
                p3 = 0;
                nextNum = num + 1;
                return true;
            }

            //nextNum存在
            if (nextNum != num) {
                if (p1 != 0 || p2 != 0) {
                    return false;
                }
                p1 = numCount;
                p2 = 0;
                p3 = 0;
                nextNum = num + 1;
                return true;
            }

            // nextNum与num相等
            if (p1 + p2 > numCount) {
                return false;
            }

            int tempP2 = p1;
            int tempP3 = p2;

            numCount -= p1;
            numCount -= p2;
            int min = Math.min(numCount, p3);
            tempP3 += min;
            numCount -= min;
            int tempP1 = numCount;

            p1 = tempP1;
            p2 = tempP2;
            p3 = tempP3;

            nextNum = num + 1;

            return true;
        }

    }


//    /**
//     * 题目理解出错, 如下解题 1,2,5 也认为连续了
//     * @param nums
//     * @return
//     */
//    public boolean isPossible(int[] nums) {
//        if (nums == null || nums.length < 3) {
//            return false;
//        }
//
//        DetailModel model = new DetailModel();
//
//        int x = nums[0];
//        int xCount = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (x != nums[i]) {
//                model.addNewNum(xCount);
//                x = nums[i];
//                xCount = 1;
//                continue;
//            }
//            xCount++;
//        }
//        model.addNewNum(xCount);
//
//        return model.p1 == 0;
//    }
//
//    class DetailModel {
//        int p1 = 0;
//        int p2 = 0;
//
//        int list3 = 0;
//        int list4 = 0;
//        int list5 = 0;
//
//        public void addNewNum(int insertCount) {
//
//            int tempList3 = list3;
//            int tempList4 = list4;
//            int tempList5 = list5;
//
//            int keepP2 = 0;
//
//            //先消除p中未成组的
//            if (p1 > 0 && p2 > 0) {
//                int newList = Math.min(Math.min(p1, p2), insertCount);
//                tempList3 += newList;
//                p1 -= newList;
//                p2 -= newList;
//                insertCount -= newList;
//                if (p1 == 0) {
//                    p1 = p2;
//                    p2 = 0;
//                }
//            }
//            if (p1 > 0 && p2 == 0) {
//                if (p1 > insertCount) {
//                    keepP2 = insertCount;
//                    insertCount = 0;
//                } else {
//                    keepP2 = p1;
//                    insertCount -= p1;
//                }
//            }
//
//            //如果insertCount>0 , 尝试用list3,4,5处理
//            if (insertCount > 0 && list5 > 0) {
//                int newList = Math.min(list5, insertCount);
//                tempList5 -= newList;
//                insertCount -= newList;
//                tempList3 += newList * 2;
//            }
//            if (insertCount > 0 && list4 > 0) {
//                int newList = Math.min(list4, insertCount);
//                tempList4 -= newList;
//                insertCount -= newList;
//                tempList5 += newList;
//            }
//            if (insertCount > 0 && list3 > 0) {
//                int newList = Math.min(list3, insertCount);
//                tempList3 -= newList;
//                insertCount -= newList;
//                tempList4 += newList;
//            }
//
//            //如果temp>0,  更新到p中
//            insertCount += keepP2;
//            if (p1 == 0) {
//                p1 = insertCount;
//            } else {
//                p2 = insertCount;
//            }
//
//            //变更回写
//            list3 = tempList3;
//            list4 = tempList4;
//            list5 = tempList5;
//
//        }
//
//
//    }


}
