/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionmeteorologica;
// esto es una version nueva
/**
 *
 * @author Carlos Gonzalez
 */
public  class EstacionMeteorologica {

    private  double temperatura[];

    public EstacionMeteorologica() {
        // crear el arreglo 6x3 
        temperatura = new double[29];
        generarTemp();
    }

    public double Alta() {
        double alta = temperatura[0];
        for (int j = 1; j < temperatura.length; j++) {
            if (alta < temperatura[j]) {
                alta = temperatura[j];
            }

        }
        return alta;
    }

    public double Baja() {
        double baja = temperatura[0];
        for (int j = 1; j < temperatura.length; j++) {
            if (baja > temperatura[j]) {
                baja = temperatura[j];
            }

        }
        return baja;
    }

    public double Media() {
        double media;

        media = (Alta() + Baja()) / 2;

        return media;
    }
    
    
 public int sobreMedia(){
     int sM = 0;
        for (int j = 0; j < temperatura.length; ++j) {
            if(Media()>temperatura[j]){
                sM++;
            }
        }
        return sM;

    }
 
 public int bajoMedia(){
     int bM = 0;
        for (int j = 0; j < temperatura.length; ++j) {
            if(Media()<temperatura[j]){
                bM++;
            }
        }
        return bM;

    }
 
    public double[] generarTemp() {
        for (int j = 0; j < temperatura.length; ++j) {
            temperatura[j] = (Math.random() * 30 + 10);
        }
        return temperatura;

    }

   
    
    
}
