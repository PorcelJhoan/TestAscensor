import javax.swing.text.StyledEditorKit;

public class Ascensor {

    private Character[]pisos ={'V','V','V'};
    private Character[]ascensor ={'A','V','V'};


    public void CrearPersona(int pisoactual, int pisodestino, Boolean boton)throws Exception{
        verificarUbicacionAscensorIniciodelDia();
        verificarLimitesedificio(pisoactual);
        verificarLimitesedificio(pisodestino);
        VerificarPersonaEnPiso(pisoactual);
        asignarpiso(pisoactual);
        PrisionaBoton(boton);
        verificarpisoactualPisoDestino(pisoactual,pisodestino);

        AsignarAscensor(pisoactual,pisodestino);

        throw  new Exception();

        //return 'f';
    }

    private void AsignarAscensor(int pisoactual, int pisodestino) {
        int pos=ObtenerPosicionAscensor();

        if(pisoactual==(pos+1)){
            ascensor[pos]='V';
            ascensor[pisodestino-1]='A';
        }
    }

    private int ObtenerPosicionAscensor() {
        for(int i=0;i< ascensor.length;i++){
            if(ascensor[i]=='A'){
                return(i);

            }

        }
        return 0;
    }

    private void verificarpisoactualPisoDestino(int pisoactual, int pisodestino) throws Exception {
        if(pisoactual==pisodestino){
            throw new Exception("el piso actual y el piso destino no pueden ser iguales");
        }
    }

    private void PrisionaBoton(Boolean boton) throws Exception {

        if(boton!=true){
            throw new Exception("No se presionó el boton");
        }

    }
    private Boolean VerificarPersonaEnPiso(int pisoactual) throws Exception {
        if(pisos[pisoactual-1]!='P'){
            throw new Exception("No hay personas en el piso "+pisoactual);
        }else{
            return true;
        }
    }


    private void asignarpiso(int piso) throws Exception {


        pisos[piso-1]='P' ;

    }

    private void verificarUbicacionAscensorIniciodelDia()throws Exception{
        if(ascensor[0]!='A'){
            throw new Exception("El ascensor no se encuentra en el primer piso");
        }
    }

    private void verificarLimitesedificio(int eje)throws Exception {
        if(eje<1 && eje>3){
            throw new Exception("el piso "+eje+" esta fuera del limite");
        }
    }

}
