package javaStudy;

public class AccessObj {
        public int p = 3;      //public모든 접근 허용 (제일 약함)
        protected int p2 = 4; //protected 같은 폴더(패키지)에서만 접근 허용
                              //단,상속 받은 경우는 예외...  
        int k = 2;           // default, 같은 패키지 내에서만 허용  
        private int i = 1;   //자기 자신만 쓸수 있다.(제일 강력)
        
        
        
}
