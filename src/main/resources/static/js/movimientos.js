$(document).ready(function(){
    cargarMovimientos();
    $('#movimientos').DataTable();
    });


async function cargarMovimientos(){

    const request = await fetch('movimientos',{
    method: 'GET',
    headers:{
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    },
    });
    const movimientos = await request.json();

    let listadoHtml = '';
    for (let movimiento of movimientos){
    let movimientoHtml = '<tr><td>'+movimiento.id+'</td><td>'+movimiento.movimiento+'</td><td>'+movimiento.fecha+'</td><td>'+movimiento.monto+'</td><td>'+movimiento.categoria+'</td><td>'+movimiento.descripcion+'</td><td><button type="button" class="btn btn-success">Editar</button><button type="button" class="btn btn-danger">Eliminar</button></td></tr>';
    listadoHtml += movimientoHtml;

    }


document.querySelector('#movimientos tbody').outerHTML = listadoHtml;

}