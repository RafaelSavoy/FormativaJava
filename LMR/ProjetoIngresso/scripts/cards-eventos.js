const card = `
<div class="max-w-sm rounded overflow-hidden shadow-lg bg-white">
    <img class="w-full object-cover h-96" src="./img/eventos/arena_gamer_jf.jpg"
        alt="Sunset in the mountains">
    <div class="px-6 py-4">
        <div class="font-bold text-xl mb-2">Arena Gamer JF</div>
        <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse et mauris id odio commodo tempor. Duis id nunc sagittis
        </p>
        <div class="flex justify-between items-center  mt-5">
            <span class="font-bold text-lg">12/11 - 22h</span>
            <a href="./evento.html"class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded cursor-pointer">Garantir Vaga</a>

        </div>
        
    </div>
</div>`

for (let i = 0; i < 20; i++) {
    document.getElementById('eventos').innerHTML +=
        card
}
