import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Random;

import static org.junit.Assert.*;

public class AscensorTest extends Ascensor {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void cuandoFueraPersonalanzarExcepcion()throws Exception{
        //1.- Preparacion de la prueba
        Ascensor ascensor=new Ascensor();


        //2.- Logica de la prueba


        //3.- Verificación o Assert

        exception.expect(Exception.class);
        ascensor.CrearPersona(2,3,true);
    }

    @Test
    public void cuandoelAscensornoEstaEnelPrimerPiso()throws Exception{
        //1.- Preparacion de la prueba
        Ascensor ascensor=new Ascensor();


        //2.- Logica de la prueba


        //3.- Verificación o Assert

        exception.expect(Exception.class);
        ascensor.CrearPersona(1,3,true);
    }

    @Test
    public void VerificarUbicacionDelAscensorAlInicioDelDia()throws Exception{
        //1.- Preparacion de la prueba
        Ascensor ascensor=new Ascensor();


        //2.- Logica de la prueba


        //3.- Verificación o Assert

        exception.expect(Exception.class);
        ascensor.CrearPersona(1,3,true);
    }

    @Test
    public void VerificarPersonaEnPiso()throws Exception{
        //1.- Preparacion de la prueba
        Ascensor ascensor=new Ascensor();


        //2.- Logica de la prueba


        //3.- Verificación o Assert

        exception.expect(Exception.class);
        ascensor.CrearPersona(1,3,true);
    }

    @Test
    public void AsignarPiso()throws Exception{
        //1.- Preparacion de la prueba
        Ascensor ascensor=new Ascensor();


        //2.- Logica de la prueba
        int min = 1;
        int max = 10;

        Random random = new Random();

        int value = random.nextInt(max + min) + min;

        //3.- Verificación o Assert

        exception.expect(Exception.class);
        ascensor.CrearPersona(value,3,true);
    }

    @Test
    public void PresionarBoton()throws Exception{
        //1.- Preparacion de la prueba
        Ascensor ascensor=new Ascensor();


        //2.- Logica de la prueba


        //3.- Verificación o Assert

        exception.expect(Exception.class);
        ascensor.CrearPersona(1,3,true);
    }
    @Test
    public void VerificarPisoActualPisoDestino()throws Exception{
        //1.- Preparacion de la prueba
        Ascensor ascensor=new Ascensor();


        //2.- Logica de la prueba


        //3.- Verificación o Assert

        exception.expect(Exception.class);
        ascensor.CrearPersona(2,2,true);
    }

    @Test
    public void AsignarAscensor()throws Exception{
        //1.- Preparacion de la prueba
        Ascensor ascensor=new Ascensor();


        //2.- Logica de la prueba


        //3.- Verificación o Assert

        exception.expect(Exception.class);
        ascensor.CrearPersona(1,3,true);
    }

}