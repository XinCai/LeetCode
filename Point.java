package lintcode;

class MyPoint {
        int x;
        int y;
        public MyPoint(int x, int y){
            this.x = x;
            this.y = y;
        }


    @Override
    public boolean equals(Object obj) {

            if (obj == this){
                return true;
            }

            if( !(obj instanceof MyPoint)){
                return false;
            }

            MyPoint myPoint = (MyPoint)obj;

            return  this.x == myPoint.x && this.y == myPoint.y;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.x;
        return hash;
    }
}
