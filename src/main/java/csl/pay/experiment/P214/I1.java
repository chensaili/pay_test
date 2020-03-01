package csl.pay.experiment.P214;

interface I1 {
    void f();
}
interface I2 {
    void f(int i);
}
interface I3 {
    int f();
}

class C{
    public int f(){
        return 1;
    }
}
class C2 implements I1,I2{

    @Override
    public void f() {
    }
    @Override
    public void f(int i) {
    }
}

class C3 extends C implements I2{

    @Override
    public void f(int i) {

    }
}
class C4 extends C implements I3{
    public int f(){
        return 1;
    }
}

/*class C5 extends C implements I1{
//会报错，仅通过返回类型不同无法区分C和I1中的方法f()
// f()' in 'csl.pay.experiment.P214.C' clashes with 'f()' in 'csl.pay.experiment.P214.I1';
}*/
