package students;

public class Students {

    //Atributos
    public String name;
    public int matricula;
    public Double []notas;

    public Students(String name, int matricula, Double[] notas) {
        this.name = name;
        this.matricula = matricula;
        this.notas = notas;
    }

    //Metodos

    //Metodo para calcular as médias
    public static double CalcularMedia(Double[] notas){
        int soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        return soma/notas.length;
    }

    //Metodo para verificação de aprovação
    public static boolean Aprovado(Double media){
        if(media > 7){
            return true;
        }
        return false;
    }
}

