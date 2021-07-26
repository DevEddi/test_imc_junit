package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IMCTest {
        IMC imc;

         @BeforeEach
         public void setUp() throws Exception{
             imc = new IMC();
         }

         @Test
         public void abaixoDoPeso(){
             imc.setPeso(51);
             imc.setAltura(1.65);
             assertEquals("Abaixo do peso" ,imc.saudavel());
         }


        @Test
        public void pesoIdeal(){
            imc.setPeso(69);
            imc.setAltura(1.65);
            assertEquals("Abaixo do peso" ,imc.saudavel());
        }

        @Test
        public void marginalmenteAcimaDoPeso(){
            imc.setPeso(73);
            imc.setAltura(1.65);
            assertEquals("Abaixo do peso" ,imc.saudavel());
        }

        @Test
        public void acimaDoPesoIdeal(){
            imc.setPeso(87);
            imc.setAltura(1.65);
            assertEquals("Abaixo do peso" ,imc.saudavel());
        }

        @Test
        public void Obeso(){
            imc.setPeso(90);
            imc.setAltura(1.65);
            assertEquals("Abaixo do peso" ,imc.saudavel());
        }

}