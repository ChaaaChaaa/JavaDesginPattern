package singleton;

class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("인스턴스를 생성했습니다.");
    }
    static Singleton getInstance(){
        return singleton;
    }
}
