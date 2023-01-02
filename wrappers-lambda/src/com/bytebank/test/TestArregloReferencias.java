package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {

    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(23, 44);

        //                          [ new |cc |null  |null  |null  ]
        Cuenta[] cuentas = new Cuenta[5];
        cuentas[1] = cc;

        CuentaAhorros ca = new CuentaAhorros(44, 55);
		cuentas[3] = ca;

        System.out.println(cc);
        System.out.println(cuentas[1]);

        cuentas[0] = new CuentaCorriente(11, 99);
        System.out.println(cuentas[0]);
        
        // @Cast
        CuentaCorriente cuenta = (CuentaCorriente) cuentas[1];
        System.out.println(cuenta);

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println(cuentas[i]);
        }
    }

}
