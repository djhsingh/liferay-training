import React from 'react';
import {FieldBase} from 'dynamic-data-mapping-form-field-type/FieldBase/ReactFieldBase.es';
import {useSyncValue} from 'dynamic-data-mapping-form-field-type/hooks/useSyncValue.es';


const CustomFormField = ({name, onChange, predefinedValue, readOnly, value}) =>
		<input
			className="ddm-field-form-field-module form-control form-field-module"
			disabled={readOnly}
			name={name}
			onInput={onChange}
			type="file"
			accept="image/png, image/gif, image/jpeg"
			value={value ? value : predefinedValue}/>

const Main = ({label, name, onChange, predefinedValue, readOnly, value, ...otherProps}) =>{

	const [currentValue, setCurrentValue] = useSyncValue(
		value ? value : predefinedValue
	);

	return <FieldBase
			label={label}
			name={name}
			predefinedValue={predefinedValue}
			{...otherProps}
		>
			<CustomFormField
				name={name}
				onChange={(event) => {
					setCurrentValue(event.target.value);
					onChange(event);
				}}
				predefinedValue={predefinedValue}
				readOnly={readOnly}
				value={currentValue}
			/>
		</FieldBase>
}

Main.displayName = 'CustomFormField';

export default Main;


