package datastructers;


class Node{
    int coef;  // xi shu
    int expon; // zhi shu
    Node next;
}

public class twoPolynomialAddLinkedlistImpl {

   /**
     *
     *  p1 = 3x5 + 4x4 - x3      + 2x -1
     *  p2 =       2x4 + x3 - 7x + x
     *
     *  Use linked list to represent to
     *
     * p1 -> [3,5,->] -> [4,4,->] -> [-1,3,->] -> [2,1,->] -> [-1,0,/]
     * p2 -> [2,4,->] -> [1,3,->] -> [-7,1,->] -> [1,1,/]
     *
     * algorithm :
     * looping through two linked list , until finish
     * if p1.coef = p2.coef , then result.expon = p1.expon + p2.expon, copy result.expon into the result linkedlist, move both p1 , p2 to next one
     * if p1.coef > p2.coef, then move p1 to next one
     * if p2.coef > p2.coef, then move p2 to next one
     *
     * and following left node , attach to result linkedlist
     */

    public static void main(String[] args) {
        //p1 -> [3,5,->] -> [4,4,->] -> [-1,3,->] -> [2,1,->] -> [-1,0,/]
        Node f10 = new Node();
        f10.coef = 3;
        f10.expon = 5;

        Node f11 = new Node();
        f11.coef = 4;
        f11.expon = 4;

        Node f12 = new Node();
        f12.coef = -1;
        f12.expon = 3;

        Node f13 = new Node();
        f13.coef = 2;
        f13.expon = 1;

        Node f14 = new Node();
        f14.coef = -1;
        f14.expon = 0;

        f10.next = f11;
        f11.next = f12;
        f12.next = f13;
        f13.next = f14;
        f14.next = null;

        //p2 -> [2,4,->] -> [1,3,->] -> [-7,1,->] -> [1,1,/]
        Node f20 = new Node();
        f20.coef = 2;
        f20.expon = 4;

        Node f21 = new Node();
        f21.coef = 1;
        f21.expon = 3;

        Node f22 = new Node();
        f22.coef = -7;
        f22.expon = 1;

        Node f23 = new Node();
        f23.coef = 1;
        f23.expon = 1;

        f20.next = f21;
        f21.next = f22;
        f22.next = f23;
        f23.next = null;

        Node p1 = new Node();
        Node p2 = new Node();
        p1 = f10;
        p2 = f20;

        Node resHead = new Node();

        while (!(p1==null) && !(p2==null)){
            if (p1.expon == p2.expon){
                Node curr = new Node();
                int resExpon = p1.expon;
                int rescoef = p1.coef + p2.coef;
                curr.coef = rescoef;
                curr.expon = resExpon;
                resHead.next = curr;
            }

            if (p1.expon>p2.expon){
                p1 = p1.next;
            }

            if (p2.expon > p1.expon){
                p2 = p2.next;
            }
        }



    }




}
