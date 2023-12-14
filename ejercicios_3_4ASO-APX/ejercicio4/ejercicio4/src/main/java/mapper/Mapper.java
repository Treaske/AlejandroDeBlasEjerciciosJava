package mapper;

import dto.ContactDTO;
import dto.RequestDTO;
import dto.ResponseDTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mapper {
    /**
     * Mapea una lista de entrada a una lista de salida.
     *
     * @param requestDTO La solicitud de entrada que contiene los datos a mapear.
     * @return Una lista de objetos ResponseDTO mapeados desde la entrada.
     * @throws ParseException Si ocurre un error al analizar los datos.
     */
    public static List<ResponseDTO> mapListaEntradaToSalida(RequestDTO requestDTO) throws ParseException {
        // TODO: Implementar lógica de mapeo aquí
        List<ResponseDTO> listaSalida = new ArrayList<>();
        // Ejemplo de cómo podrías comenzar a implementar el mapeo

        ResponseDTO responseDTO = new ResponseDTO();

        for (ContactDTO contactDTO : requestDTO.getContact()) {

            responseDTO.setEmail(contactDTO.getEmail());
            responseDTO.setCel(contactDTO.getCel());

            listaSalida.add(responseDTO);
        }

        List<String> listaDatos = requestDTO.getRequest();

        for (String cadena : listaDatos) {

            //Dividimos la cadena por las "," y despues añadimos al request despues de parsear los datos correspondientes
            String[] partes = cadena.split(",");

            responseDTO.setNombre(partes[0]);
            responseDTO.setNumero(Integer.parseInt(partes[1]));

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            responseDTO.setFecha(dateFormat.parse(partes[2]));
        }

        return listaSalida;
    }
}
