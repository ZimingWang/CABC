package Algo.BFS.UnionFind.Graph;

import java.io.*;
import java.util.*;

class Solution {
    static class Order {
        String order;
        Order(String val) { this.order = val; }
    }

    static class OrderDependency {
        Order todo, req; // req -> todo
        OrderDependency(Order a, Order b) { this.todo = a; this.req = b; }
    }




    // Kahn's algorithm
    static List<Order> getOrders(List<OrderDependency> dependencies) {
        List<Order> result = new ArrayList<>();
        Map<Order, List<Order>> outcomingEdges = new HashMap<>();
        Map<Order, Integer> incomeCount = new HashMap<>();

        for (OrderDependency dep : dependencies) {
            Order todo = dep.todo, req = dep.req;
            // Skip invalid inputs
            if (todo.order.equals(req.order)) continue;

            // Add outcomes for this node
            if (!outcomingEdges.containsKey(req)) outcomingEdges.put(req, new ArrayList<Order>());
            outcomingEdges.get(req).add(todo);

            if (!outcomingEdges.containsKey(todo)) outcomingEdges.put(todo, new ArrayList<Order>());

            // Update incoming edge count
            if (!incomeCount.containsKey(todo)) incomeCount.put(todo, 1);
            else incomeCount.put(todo, incomeCount.get(todo) + 1);

            if (!incomeCount.containsKey(req)) incomeCount.put(req, 0);
        }

        Queue<Order> q = new LinkedList<>();
        for (Order o : incomeCount.keySet()) {
            // Add to result list if no incoming edges
            if (incomeCount.get(o) == 0) q.offer(o);
        }

        while (!q.isEmpty()) {
            Order od = q.poll();
            result.add(od);
            // Cycles through all outcoming edges from this node
            for (Order out : outcomingEdges.get(od)) {
                // Remove this incoming edge. Decrement incoming edge count.
                incomeCount.put(out, incomeCount.get(out) - 1);
                if (incomeCount.get(out) == 0) {
                    // Add to result list if no incoming edges
                    q.offer(out);
                }
            }
        }
        // Check if there's a cycle by checking remaining incoming edges for each node
        for (Integer i : incomeCount.values()) {
            if (i > 0) {
                System.out.println("There exists cycles! No topological sorting!");
                return new ArrayList<Order>();
            }
        }
        return result;
    }







    // Test
    public static void main(String[] args) {
        Order o1 = new Order("A");
        Order o2 = new Order("B");
        Order o3 = new Order("C");
        Order o4 = new Order("D");

        List<OrderDependency> list = new ArrayList<>(
                Arrays.asList(
                        new OrderDependency(o1, o2),
                        new OrderDependency(o2, o3),
                        new OrderDependency(o3, o4)
                )
        );

        for (Order o : getOrders(list)){
            System.out.println(o.order);
        }
    }
}
