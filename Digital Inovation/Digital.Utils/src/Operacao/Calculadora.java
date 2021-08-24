package Operacao;

import Operacao.Internal.DivHelper;
import Operacao.Internal.MultHelper;
import Operacao.Internal.SubHelper;
import Operacao.Internal.SumHelper;

public class Calculadora {
    private DivHelper DivHelper;
    private MultHelper MultHelper;
    private SubHelper SubHelper;
    private SumHelper SumHelper;

    public Calculadora() {
        DivHelper = new DivHelper();
        MultHelper = new MultHelper();
        SubHelper = new SubHelper();
        SumHelper = new SumHelper();
    }

    public int Sum(int a, int b){
        return SumHelper.execute(a, b);
    }
    public int Sub(int a, int b){
        return SubHelper.execute(a, b);
    }
    public int Mult(int a, int b){
        return MultHelper.execute(a, b);
    }
    public int Div(int a, int b){
        return DivHelper.execute(a, b);
    }
}