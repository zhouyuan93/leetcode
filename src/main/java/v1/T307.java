package v1;

public class T307 {
    public static class NumArray {
        int[] sumNums;
        int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
            this.sumNums = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    this.sumNums[j] += nums[i];
                }
            }
        }

        public void update(int i, int val) {
            int change = val - this.nums[i];
            this.nums[i] = val;
            for (int j = i; j < this.sumNums.length; j++) {
                this.sumNums[j] += change;
            }
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return sumNums[j];
            }
            return sumNums[j] - sumNums[i-1];
        }
    }

    //完全二叉树, 拆分计算sum值,减少累加的次数, 更新节点也相应减少
    public static class NumArray_by93ms{
        private interface Merger<E>{
            E merge(E a, E b);
        }

        private class SegmentTree<E>{
            private E[] tree;
            private E[] data;
            private Merger<E> merger;

            public SegmentTree(E[] arr, Merger<E> merger) {
                this.merger = merger;

                data = (E[]) new Object[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    data[i] = arr[i];
                }

                tree = (E[]) new Object[4 * arr.length];
                buildSegmentTree(0, 0, data.length - 1);
            }

            private void buildSegmentTree(int treeIndex, int l, int r) {
                if (l == r) {
                    tree[treeIndex] = data[l];
                    return;
                }

                int leftTreeIndex = leftChild(treeIndex);
                int rightTreeIndex = rightChild(treeIndex);

                int mid = l+(r-1)/2;

                buildSegmentTree(leftTreeIndex, l, mid);
                buildSegmentTree(rightTreeIndex, mid + 1, r);

                tree[treeIndex] = merger.merge(tree[leftTreeIndex], tree[rightTreeIndex]);
            }

            public int getSize(){
                return data.length;
            }

            public E get(int index) {
                if (index < 0 || index >= data.length) {
                    throw new IllegalArgumentException("Index is illegal.");
                }
                return data[index];
            }

            private int leftChild(int index) {
                return 2 * index + 1;
            }

            private int rightChild(int index) {
                return 2 * index + 2;
            }

            public E query(int queryL, int queryR) {
                if (queryL < 0 || queryL >= data.length || queryR < 0 || queryL > queryR || queryR > data.length) {
                    throw new IllegalArgumentException("Index is illegal.");
                }

                return query(0, 0, data.length - 1, queryL, queryR);
            }

            private E query(int treeIndex, int l, int r, int queryL, int queryR) {
                if (l == queryL && r == queryR) {
                    return tree[treeIndex];
                }

                int mid = l + (r + 1) / 2;

                int leftTreeIndex = leftChild(treeIndex);
                int rightTreeIndex = rightChild(treeIndex);

                if (queryL >= mid + 1) {
                    return query(rightTreeIndex, mid + 1, r, queryL, queryR);
                } else if (queryL <= mid) {
                    return query(leftTreeIndex, l, mid, queryL, queryR);
                }

                E leftResult = query(leftTreeIndex, l, mid, queryL, mid);
                E rightResult = query(rightTreeIndex, mid + 1, r, mid + 1, queryR);

                return merger.merge(leftResult, rightResult);
            }

            public void setTree(int index, E e) {
                if (index < 0 || index >= data.length) {
                    throw new IllegalArgumentException("Index is illegal");
                }

                data[index] = e;
                set(0, 0, data.length - 1, index, e);
            }

            private void set(int treeIndex, int l, int r, int index, E e) {
                if (l == r) {
                    tree[treeIndex] = e;
                    return ;
                }

                int mid = l + (r - 1) / 2;

                int leftTreeIndex = leftChild(treeIndex);
                int rightTreeIndex = rightChild(treeIndex);

                if (index >= mid + 1) {
                    set(rightTreeIndex, mid + 1, r, index, e);
                }else{
                    set(leftTreeIndex, l, mid, index, e);
                }

                tree[treeIndex] = merger.merge(tree[leftTreeIndex], tree[rightTreeIndex]);

            }

            @Override
            public String toString() {
                StringBuilder res = new StringBuilder();
                res.append("[");
                for (int i = 0; i < tree.length; i++) {
                    if (tree[i] != null) {
                        res.append(tree[i]);
                    }else{
                        res.append("null");
                    }

                    if (i != tree.length - 1) {
                        res.append(",");
                    }
                }
                res.append("]");
                return res.toString();
            }
        }

        private SegmentTree<Integer> segmentTree;

        public NumArray_by93ms(int[] nums) {
            if (nums.length != 0) {
                Integer[] data = new Integer[nums.length];
                for (int i = 0; i < nums.length; i++) {
                    data[i] = nums[i];
                }
                segmentTree = new SegmentTree<>(data, new Merger<Integer>() {
                    @Override
                    public Integer merge(Integer a, Integer b) {
                        return a + b;
                    }
                });

            }
            System.out.println(segmentTree.toString());
        }

        public void update(int index, int val) {
            if (segmentTree == null) {
                throw new IllegalArgumentException("error");
            }
            segmentTree.setTree(index,val);
        }

        public int sumRange(int i, int j) {
            if (segmentTree == null) {
                throw new IllegalArgumentException("segment tree is null.");
            }
            return segmentTree.query(i, j);
        }


    }


}
