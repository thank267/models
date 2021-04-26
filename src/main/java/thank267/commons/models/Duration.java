package thank267.commons.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Duration {
	
	@Getter
	@Setter
	public Integer value;
	
	@Getter
	@Setter
	public DurationEnum unit = DurationEnum.День;
	
	
}