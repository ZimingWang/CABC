    import java.util.*;

    class Interval {
        public int left;
        public int right;

        public Interval(int l, int r) {
            this.left = l;
            this.right = r;
        }
    }

    public class Log {
        public static void main(String[] args) {
            List<String[]> input = new ArrayList();
            input.add(new String[]{"f1", "start", "1"});
            input.add(new String[]{"f1", "start", "2"});
            input.add(new String[]{"f2", "start", "4"});
            input.add(new String[]{"f2", "end", "8"});
            input.add(new String[]{"f1", "end", "16"});
            input.add(new String[]{"f3", "start", "32"});
            input.add(new String[]{"f3", "end", "64"});
            input.add(new String[]{"f1", "end", "128"});

            Log sol = new Log();
            Map<String, List<Interval>> result = sol.solve(input);
            for (String k : result.keySet()) {
                System.out.print(k + " : ");
                for (Interval itv : result.get(k)) {
                    System.out.print("[" + itv.left + ", " + itv.right + "]");
                }
                System.out.println();
            }
        }

        public Map<String, List<Interval>> solve(List<String[]> input) {
            Map<String, List<Interval>> result = new HashMap();
            Stack<String[]> stack = new Stack<>();
            Integer prev = null;
            for (String[] current : input) {
            	if (stack.isEmpty()) {
            		stack.push(current);
            		prev = Integer.valueOf(current[2]);
            	} else {
            		String[] top = stack.peek();
	                if (current[1].equals("start")) {
                        if (!result.containsKey(top[0])) {
                            result.put(top[0], new ArrayList<>());
                        }
                        result.get(top[0]).add(new Interval(prev, Integer.valueOf(current[2])));
                        stack.push(current);
	                } else { // end
	                    if (!result.containsKey(top[0])) {
	                        result.put(top[0], new ArrayList<>());
	                    }
	                    stack.pop();
	                    result.get(top[0]).add(new Interval(prev, Integer.valueOf(current[2])));
	                }
            	}
        		prev = Integer.valueOf(current[2]);
            }

            for (String key : result.keySet()) {
                result.put(key, merge(result.get(key)));
            }

            return result;
        }

        private List<Interval> merge(List<Interval> list) {
            Stack<Interval> stack = new Stack();
            for (Interval itv : list) {
                if (stack.isEmpty()) {
                    stack.push(itv);
                } else {
                    if (stack.peek().right < itv.left) {
                        stack.push(itv);
                    } else {
                        Interval top = stack.pop();
                        stack.push(new Interval(Math.min(top.left, itv.left), Math.max(top.right, itv.right)));
                    }
                }
            }

            List<Interval> ret = new ArrayList();
            while (!stack.isEmpty()) {
                ret.add(stack.pop());
            }

            return ret;
        }
    }