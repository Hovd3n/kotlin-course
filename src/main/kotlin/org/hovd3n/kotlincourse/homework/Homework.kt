package org.hovd3n.kotlincourse.homework

class Homework {

    // сюда можно записать дз
}

// ДЗ после 3 урока
val name: String = "Urals Hackathon"
var date: String = "28th of September"
val place: String = "Ekspo center"
var budgetInDetails: String = "Аренда - 20000,  Оборудование - 30000, Кейтеринг - 10000, Иное - 15000"
var users: Int = 0
    get() = field
    private set(value) {field = value}
var duration: Long = 8*60*60 // длительность в секундах
private var contactInformation: String = "Телефон" // Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
var status: String = "Не начат" // Текущее состояние хакатона
val sponsors: String = "Список спонсоров: RMC, UMCC"
var budget: String = "75000 рублей"
var internetAccessLevel: Int = 10 // Текущий уровень доступа к интернету
var info: String = "Информация о том, о сем"// Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
var teamCount: Int = 0 //количество команд
val tasks: String = "1. Выполнить это 2. Сделать то 3. Быть молодцом" //перечень задач
val evacuationPlan: String = "План эвакуации"//План эвакуации
val equipment: String = "Список доступного оборудования"//Список доступного оборудования
var freeEquipment: String = "Список свободного оборудования"//Список свободного оборудования
lateinit var timetable: String = //График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
val plan: String = "План мероприятия" //План мероприятий на случай сбоев
var experts: String = "Список экспертов"//Список экспертов и жюри
var methods: String = "Методы"//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
val policy: String = "Политика конфендициальности"//Политика конфиденциальности
val feedback: String by lazy { "" } //Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
var temperature: Int = 20 //Текущая температура в помещении
var monitoringNetwork: String = "" //Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var lightLevel: String = "Светло"//Уровень освещения
private var log: String = "Лог"//Лог событий мероприятия
var ambulance: String = "Доступно"//Доступность медицинской помощи
private val procedure: String = "Процедура"//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
val number: Int = 1 //Регистрационный номер мероприятия
val loud: Int = 1000 //Максимально допустимый уровень шума в помещении хакатона.
//Индикатор превышения уровня шума в помещениях
//Формат мероприятия (зависит от геополитической обстановки)
//Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
//План взаимодействия с прессой
//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
//Статус получения всех необходимых разрешений
//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
//Список партнеров мероприятия
//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
//План распределения призов
//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
//Особые условия для участников с ограниченными возможностями
//Общее настроение участников (определяется опросами)
lateinit var planInDetails: String //Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
lateinit var specialGuest: String //Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
//Максимальное количество людей, которое может вместить место проведения.
//Стандартное количество часов, отведенное каждой команде для работы над проектом.