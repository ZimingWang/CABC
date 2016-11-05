package Algo.Math;



/**
 * Created by wangziming on 10/16/16.
 */
public class Overlap {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int innerL = Math.max(A, E);
        int innerR = Math.max(innerL, Math.min(C, G));
        int innerT = Math.max(B, F);
        int innerB = Math.max(innerT, Math.min(D, H));
        return (C - A) * (B - D) - (innerR - innerL) * (innerT - innerB) + (G -E) * (F - H);
    }

    public  boolean doOverlap(Points l1, Points r1, Points l2, Points r2)
    {
        // If one rectangle is on left side of other
        if (l1.x > r2.x || l2.x > r1.x)
            return false;

        // If one rectangle is above other
        if (l1.y < r2.y || l2.y < r1.y)
            return false;

        return true;
    }
}

class Points {
    int x;
    int y;
    public Points(int x, int y){
        this.x = x;
        this.y = y;
    }
}

/*
* public class OverLap {
// rectangle A, B
// time O(1), space O(1)
public static boolean check(Node topLeftA, Node topLeftB, Node
bottomRightA, Node bottomRightB) {
// if one rectangle is on left side of other
if (bottomRightA.y <= topLeftB.y || bottomRightB.y <=
topLeftA.y) {
return false;
}
// if one rectangle is above other
if (topLeftA.x >= bottomRightB.x || topLeftB.x >=
bottomRightA.x) {
return false;
}
return true;
}
public static class Node {
double x;
double y;
public Node(double x, double y) {
this.x = x;
this.y = y;
}
}
}
*
*
*
* */