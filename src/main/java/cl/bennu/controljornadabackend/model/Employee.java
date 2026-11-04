package cl.bennu.controljornadabackend.model;

import cl.bennu.commons.domain.base.BaseDomain;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@EqualsAndHashCode(callSuper=true)
@Data
@NoArgsConstructor
public class Employee extends BaseDomain implements Serializable {

    

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static Employee valueOf(Long id) {
        Employee employee = new Employee();
        employee.setId(id);
        return employee;
    }
}
