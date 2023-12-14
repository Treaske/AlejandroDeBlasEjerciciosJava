package mapper;

import dto.InputTwoDTO;
import dto.OutputTwoDTO;

import java.util.List;
import java.util.stream.Collectors;

public class MapperTwo {
    // TODO: Implementar el método de mapeo aquí
    public static OutputTwoDTO mapInputToOutputTwo(InputTwoDTO inputTwoDTO) {
        // TODO: Mapear las propiedades de InputTwoDTO a OutputTwoDTO, incluyendo la transformación de habilidades
        // Ejemplo ficticio:
        // List<String> formattedSkills = inputDTO.getSkills().stream().map(skill -> skill.toUpperCase()).collect(Collectors.toList());
        // return new OutputDTO(inputDTO.getName(), inputDTO.getAge(), inputDTO.getOccupation(), formattedSkills);

        OutputTwoDTO outputToInput = new OutputTwoDTO();

        outputToInput.setFullName(inputTwoDTO.getName());
        outputToInput.setJobTitle(inputTwoDTO.getOccupation());
        outputToInput.setYearsOld(inputTwoDTO.getAge());

        List<String> formattedSkills = inputTwoDTO.getSkills().stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        outputToInput.setFormattedSkills(formattedSkills);

        return outputToInput;
    }
}
