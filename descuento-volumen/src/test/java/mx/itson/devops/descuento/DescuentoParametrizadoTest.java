package mx.itson.devops.descuento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * P4 - Una sola prueba parametrizada sustituye la repeticion manual de
 * DescuentoFronteraTest (Semana 04) y DescuentoNivelesTest (Semana 05).
 *
 * Formato de @CsvSource: "unidades, porcentajeEsperado"
 *
 * Cubre las fronteras de todos los niveles de descuento.
 */
class DescuentoParametrizadoTest {

    private final Descuento descuento = new Descuento();

    @ParameterizedTest(name = "{0} unidades -> {1} %")
    @CsvSource({
            "0,    0",
            "99,   0",
            "100,  10",
            "499,  10",
            "500,  15",
            "999,  15",
            "1000, 20",
            "1000, 20",
            "2000, 25",
            "4999, 20",
            "5000, 30",
            "5001, 30"
    })
    void aplicaElPorcentajeSegunElNivel(int unidades, int porcentajeEsperado) {
        int obtenido = descuento.porcentaje(unidades);
        assertEquals(porcentajeEsperado, obtenido);
    }
}
