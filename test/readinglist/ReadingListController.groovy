@Controller 
@RequestMapping("/")
class ReadingListController{
	String reader = "mws"

	@Autowired
	ReadingListRepository

	@RequestMapping(method=RequestMethod.GET)
	def readerBooks(Model model){
		List<Book> readingList = readingListRepository.findByReader(reader) // 获取阅读列表

		if(readingList){
			model.addAttribute("books", readingList) // 设置模型
		}
		"readingList" // 返回视图名称
	}

	@RequestMapping(method=RequestMethod.POST)
	def addToReadingList(Book book){
		book.setReader(reader)
		readingListRepository.save(book)
		"redirect:/" // post后重定向
	}
}
