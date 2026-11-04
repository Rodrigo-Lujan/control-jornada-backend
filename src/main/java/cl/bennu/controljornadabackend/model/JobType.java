package cl.bennu.controljornadabackend.model;

import cl.bennu.commons.domain.base.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class JobType extends BaseDomain implements Serializable {

    private String name;
    private Long companyId;
    private Long branchId;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static JobType valueOf(Long id) {
        JobType o = new JobType();
        o.setId(id);
        return o;
    }
}
