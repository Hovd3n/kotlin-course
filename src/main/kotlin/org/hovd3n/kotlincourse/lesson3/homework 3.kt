package org.hovd3n.kotlincourse.lesson3

class Homework {

}

// ДЗ после 3 урока
val naming: String = "Urals Hackathon"
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
lateinit var timetable: String //График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
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
val loudMax: Int = 1000 //Максимально допустимый уровень шума в помещении хакатона.
var loud: Int = 0 //Индикатор превышения уровня шума в помещениях
var format: String = "Хакатон" //Формат мероприятия (зависит от геополитической обстановки)
var freePlaces: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
    } //Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
val planOfCommunication: String = "План взаимодействия с прессой"//План взаимодействия с прессой
val reportProjects: String by lazy { ""
} //Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.

var statusOfPermission: String = "Статус разрешений"//Статус получения всех необходимых разрешений
lateinit var openResources: String //Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
val partners: String = "Список партнеров: RMC, UMCC"//Список партнеров мероприятия
val photoReport: String by lazy { ""
}  //Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.

val prizes: String = "План призов" //План распределения призов
private val contacts: String = "Контакты"//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
val specialConditions: String = "Особые условия"//Особые условия для участников с ограниченными возможностями
val mood: String by lazy { ""
}//Общее настроение участников (определяется опросами)
lateinit var planInDetails: String //Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
lateinit var specialGuest: String //Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
val maxUsers: Int = 500 //Максимальное количество людей, которое может вместить место проведения.
var standartTimeConditions: Long = 2*60*60 //Стандартное количество часов, отведенное каждой команде для работы над проектом.