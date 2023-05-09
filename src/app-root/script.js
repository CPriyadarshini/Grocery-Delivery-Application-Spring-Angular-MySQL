const chatboxToggle = document.querySelector('.chatbox-toggle');
  const chatboxMessage = document.querySelector('.menu');

  chatboxToggle.addEventListener('click', function() {
    chatboxMessage.classList.toggle('show')
  })