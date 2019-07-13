    static class TestDataEmptyArray {
        public static int[] get_array() {
            // complete this function
            int[] a ={};
            return a;
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            // complete this function
            int[] a = {1,2,3};
            return a;
        }

        public static int get_expected_result() {
            // complete this function
            int[] a = get_array();
            return minimum_index(a);
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            // complete this function
            int[] a = {1,2,3,1};
            return a;
        }

        public static int get_expected_result() {
            // complete this function
            int[] a = get_array();
            return minimum_index(a);
        }
    }