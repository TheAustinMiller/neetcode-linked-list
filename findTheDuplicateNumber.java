public int findDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for (int x: nums) {
            int size = set.size();
            set.add(x);
            if (set.size() != size+1) {
                return x;
            }
        }
        return -1;
    }
