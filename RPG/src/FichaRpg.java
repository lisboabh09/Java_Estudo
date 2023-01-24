import java.security.spec.EncodedKeySpec;

import javax.lang.model.util.ElementScanner6;

public class FichaRpg {
    public static void main(String[] args) {
        String nomePersonagem = "Vagante Noturno";
        String raca = "Humano";
        String classePersonagem = "Guerreiro";

        //Valor dos atributos do personagem.

        int forca = 15;
        int destreza = 14;
        int constituicao = 12;
        int inteligencia = 11;
        int sabedoria = 9;
        int carisma = 7;
        int classeArmadura = 9;
        int pontosVida = 12;

        //modificadores de atributos
        int mFor = 1;
        int mDes = 1;
        int mCons = 1;
        int mInt = 1;
        int mSab = 1;
        int mCar =1;
        



       System.out.println ("---------------------------------------- ");
       System.out.println ("Os atributos do seu personagem são:");
       System.out.println ("O nome do Personagem: " + nomePersonagem);
       System.out.println ("A raça do Personagem: " + raca);
       System.out.println ("Este Personagem é da classe: " + classePersonagem);
       System.out.println ("---------------------------------------- ");
       System.out.println ("Atributos do Personagem");
       System.out.println ("Força: " + forca + mFor);
       System.out.println ("Destreza: " + destreza + mDes);
       System.out.println ("Constituição: " + constituicao + mCons);
       System.out.println ("Inteligencia: " + inteligencia + mInt);
       System.out.println ("Sabedoria: " + sabedoria + mSab);
       System.out.println ("Carisma: " + carisma + mCar);
       System.out.println ("Classe de Amardura: " + classeArmadura);
       System.out.println ("Pontos de Vida: " + pontosVida);

    }

    }

