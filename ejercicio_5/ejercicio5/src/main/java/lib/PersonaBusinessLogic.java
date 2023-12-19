package lib;

import dto.PersonaInputDTO;
import dto.PersonaOutputDTO;
import dto.TipoContacto;

public class PersonaBusinessLogic {
    public static void main(String[] args) {
        // Crear un objeto de entrada DTO con datos de una persona
        PersonaInputDTO inputDTOCel = new PersonaInputDTO("Zamir", "+57 300333", TipoContacto.CELULAR);
        PersonaInputDTO inputDTOEmail = new PersonaInputDTO("Jose", "zam@co", TipoContacto.EMAIL);

        // TODO: Llamar al método de negocio y mostrar el resultado en el Main
        PersonaOutputDTO outputDTOCel = procesarDatosPersona(inputDTOCel);
        PersonaOutputDTO outputDTOEmail = procesarDatosPersona(inputDTOEmail);

        // Mostrar el resultado
        System.out.println("DTO de entrada: " + inputDTOCel);
        System.out.println("DTO de salida procesado: " + outputDTOCel);
        System.out.println("DTO de entrada: " + inputDTOEmail);
        System.out.println("DTO de salida procesado: " + outputDTOEmail);
    }

    // TODO: Implementar el método de negocio aquí
    private static PersonaOutputDTO procesarDatosPersona(PersonaInputDTO inputDTO) {
        // TODO: Aplicar la lógica de negocio según los requisitos
        // Por ejemplo, para el número de contacto, extraer solo los dígitos

        String nombrePersonaDTO = inputDTO.getNombre();
        String contactoPersonaDTO = inputDTO.getContacto();
        boolean validar;

        // y para el tipo de contacto, validar y procesar según sea necesario.
        if (inputDTO.getTipoContacto() == TipoContacto.CELULAR) {
            contactoPersonaDTO = extraerNumeroCelular(contactoPersonaDTO);
        } else if (inputDTO.getTipoContacto() == TipoContacto.EMAIL) {
            validar = validarCorreoElectronico(contactoPersonaDTO);
            if (validar == false){
                contactoPersonaDTO = null;
            }
        } else {
            return null;
        }

        return new PersonaOutputDTO(nombrePersonaDTO, contactoPersonaDTO);
    }

    private static String extraerNumeroCelular(String contacto) {
        // Eliminar el prefijo y retornar solo los dígitos del número celular
        if (contacto.startsWith("+")) {
            // Utilizar substring para quitar el prefijo
            return contacto.substring(1);
        } else {
            // Devolver la cadena sin cambios si no tiene el prefijo
            return contacto;
        }
    }

    private static boolean validarCorreoElectronico(String correo) {
        // Verificar si el correo contiene el carácter "@"
        if (correo.contains("@"))
            return true;
        return false;
    }
}
