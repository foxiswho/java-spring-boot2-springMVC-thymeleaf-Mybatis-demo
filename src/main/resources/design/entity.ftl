import java.util.Date;
import java.math.BigDecimal;
import com.foxwho.demo.entity.${table.classNameUpCase};
//通过mapKey.mapKey的方式获取设置的类名，因为每一个实体类中都有classNameUpCase
//这里取Params0这个key来用
public class ${table.classNameUpCase} {
//以下为循环实体类的代码
<#list lists as value>
    //${value.comment}
    private ${value.type} ${value.column};
</#list>
<#list lists  as value>
    public ${value.type} get${value.columnNameUpCase}(){
        return ${value.column};
    }
    public void set${value.columnNameUpCase} (${value.type} ${value.column}s){
        this.${value.column} = ${value.column}s;
    }
</#list>
}