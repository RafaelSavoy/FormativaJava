

const header = ` 
<header class="w-full bg-cover bg-center backdrop-blur-sm fixed sticky top-0 z-30 w-full">
    <div class="bg-gray-900 bg-opacity-50 h-full ">
        <nav class="backdrop-blur-sm p-1">
            <div class="flex justify-around my-1">
                <a href="#" class="text-white font-sans text-2xl md:text-3xl font-bold text-xl mb-2">Gamer
                    Place</a>
                <div class="hidden -mx-4 md:flex md:items-center">
                    <a href="./index.html" class="block mx-4 mt-2 md:mt-0 text-base text-white uppercase">Home
                    </a>
                    <a href="#" class="block mx-4 mt-2 md:mt-0 text-base text-white uppercase">Meus ingressos</a>
                    <a href="#" class="block mx-4 mt-2 md:mt-0 text-base text-white uppercase">Entrar</a>
                </div>
            </div>
        </nav>
    </div>
</header>`

document.getElementById('header').innerHTML += header