package javacore.interfaces.classes;

public interface Tributavel {
    public static final double IMPOSTO = 0.2;// todos os atributos são considerados constantes (public static final é
                                             // opcional - ja sao interpretados dessa maneira em interface)

    void calcularImposto();
}
