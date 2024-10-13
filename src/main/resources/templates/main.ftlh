<#-- textInput macro for html input -->
<#macro textInput id placeholder="" value="">
    <input type="text" id="${id}" placeholder="${placeholder}" value="${value}">
</#macro>

<#-- table macro for html table -->
<#macro table id rows>
    <table id="${id}">
        <#list rows as row>
            <tr>
                <td>${row?index + 1}</td>
                <#list row as field>
                    <td>${field}</td>
                </#list>
            </tr>
        </#list>
    </table>
</#macro>
