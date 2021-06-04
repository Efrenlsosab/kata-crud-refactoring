package co.com.sofka.crud.mapper;

import co.com.sofka.crud.dto.TodoListaDTO;
import co.com.sofka.crud.entity.TodoListageneral;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TodoListaMapper {

  /*  @Mappings({
            @Mapping(source = "idlista", target = "idlista"),
            @Mapping(source = "nombre", target = "nombre")
    })*/
    TodoListaDTO convertiraDTO(TodoListageneral todoListageneral);
    Iterable<TodoListaDTO> toTodoListaDTOs (Iterable<TodoListageneral> TodoListageneral);
    @InheritConfiguration
    TodoListageneral aTodoListageneral (TodoListaDTO todoListaDTO);


}
