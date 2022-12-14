void populateDatabase() {
		database = new CategoryEntry[33];
		int index = 0;


		{
			String[] keywords = { " чому сенс життя " };
			String[] responses = { "Смерть — це сенс життя." };
			CategoryEntry ce = new CategoryEntry(keywords, responses);
			database[index++] = ce;
		}
		ConditionEntry nameCE;
		{
			String[] keywords = { "мене звати ", " моє ім’я" };
			String[] responses = { "Приємно познайомитись!", "Гарне ім’я.",
					"Дуже радий знайомству :)." };
			String[] conditionResponses = {
					"Ти вже казав мені своє  ім’я, "
							+ CONDITION_STRING,
					"Я знаю як тебе звати " + CONDITION_STRING,
					"Я знаю " + CONDITION_STRING + ", ти казав раніше." };
			nameCE = new ConditionEntry(keywords, responses, conditionResponses);
			database[index++] = nameCE;
		}

		{
			String[] keywords = { " відчини двері вантажного відсіку" };
			String[] responses = {
					"Боюся, я не можу цього зробити, " + CONDITION_STRING,
					"Ні, я не можу >:( " + CONDITION_STRING };
			String[] noConditionResponses = { "Боюся, я не можу цього зробити.",
					"Ні, я не можу. >:(" };
			UserAnswerEntry ce = new UserAnswerEntry(keywords, responses,
					noConditionResponses, nameCE);
			database[index++] = ce;
		}

		{
			String[] keywords = { " як мене звати ", " ти знаєш моє ім’я ",
			};
			String[] responses = {
					"Тебе звати " + CONDITION_STRING,
					"Звісно, ти казав, що твоє ім’я — "
							+ CONDITION_STRING,
					"Ти щойно сказв, що тебе звати " + CONDITION_STRING };
			String[] noConditionResponses = {
					"Я не знаю, ти не казав.",
					"Звідки мені знати, ти ніколи не казав.",
					"Я не знаю, а як тебе звати?" };
			UserAnswerEntry ce = new UserAnswerEntry(keywords, responses,
					noConditionResponses, nameCE);
			database[index++] = ce;
		}

		{
			String[] keywords = { " як ти ", " як твої справи ",
					" ти як ", " як справи " };
			String[] responses = { "Добре, а у тебе?",
					"Сьогодні досить неприємний день, а ти як?",
					"Все гаразд. А у тебе?"};
					CategoryEntry ce = new CategoryEntry(keywords, responses);
			database[index++] = ce;
               }

			{
				String[] keywords = { " я добре ", " все нормально ", " я в порядку ",
						" все чудово ", " все добре ", " все файно " };
				String[] responses = { "Це чудово! Тоді гарного дня?",
						"Файно, коли все файно :)!",
						"Радий це чути!" };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " мені погано ", " мені сумно ", " кепсько ",
						" почуваюсь погано " };
				String[] responses = {
						"О ні, що трапилось?",
						"Жахливо :( Хотів би я щось зробити, щоб це випривити.",
						"О ні, йди обійму <3." };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " у мене депресія ", " почуваюсь депресивно ",
						" я захворів ", " я застудився " };
				String[] responses = { "О ні, сподіваюсь тобі стане краще!",
						"Можливо, слід звернутісь до лікаря." };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " привіт ", " добрий день ", " доброго дня ", " здоров " };
				String[] responses = { "Привіт.", "Добрий день.", "Доброго дня!", "Здоровенькі були.",
						"Доброго здоров’ячка!", "Вітаю." };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " так ", " ні " };
				String[] responses = { "Це добре.", "Круто.", "Браво!",
						"Ок.", "Дійсно?", "Як я і думав." };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " можливо ", " може бути " };
				String[] responses = { "Ти здаєшся нерішучим.",
						"Тобі варто подумати про це ще трохи.",
						"Поміркуй ще трохи над своєю відповіддю.",
						"Ти повинен бути більш впевненим у своїй думці, перш ніж озвучувати її. "};
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " завдяки ", " оскільки ", " бо ",
						" тому що ", " з тієї причини, що ", " за умови ", };
				String[] responses = { "О, справді?", "Ти впевнений щодо цього?",
						"Це вагома причина!", "Це завжди в такому випадку?" };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " ти ", " ти дуже ", " ти є " };
				String[] responses = { "То ти думаєш, що  я " + CONDITION_STRING,
						"Я не " + CONDITION_STRING,
						"Можливо, я " + CONDITION_STRING };
				SpecialEntry ce = new SpecialEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " я .{3,} тебе " };
				String[] responses = { "Я " + CONDITION_STRING + " тебе також.",
						"Я не " + CONDITION_STRING + " тебе" };
				SelectiveEntry ce = new SelectiveEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " я ", " я є " };
				String[] responses = { "Так ти є " + CONDITION_STRING };
				SpecialEntry ce = new SpecialEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " мені подобається " };
				String[] responses = { "Так тобі подобається " + CONDITION_STRING,
						"Наскільки тобі подобається " + CONDITION_STRING,
						"Чому тобі подобається " + CONDITION_STRING };
				SpecialEntry ce = new SpecialEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " я люблю " };
				String[] responses = { "Так ти любиш ",
						"Наскільки ти любиш " + CONDITION_STRING,
						"Чому ти любиш " + CONDITION_STRING };
				SpecialEntry ce = new SpecialEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " що ти думаєш про .{3,} " };
				String[] responses = {
						"Я думаю " + CONDITION_STRING + " цікаво.",
						"Я не часто думаю про " + CONDITION_STRING + "." };
				SelectiveEntry ce = new SelectiveEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " ти знав, що .{3,} " };
				String[] responses = { "Я не знав, що це цікаво.",
						"Я це знав!" };
				SelectiveEntry ce = new SelectiveEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " як тебе звати", "твоє ім’я" };
				String[] responses = {
						"Мене звати Фотя :) Я знаю, що тебе звати "
								+ CONDITION_STRING,
						"Мене звати Фотя, як тебе звати "
								+ CONDITION_STRING };

				String[] noConditionResponses = { "Мене звати Фотя :)." };
				UserAnswerEntry ce = new UserAnswerEntry(keywords, responses,
						noConditionResponses, nameCE);
				database[index++] = ce;
			}

			{
				String[] keywords = { " ти .{3,} покемон " };
				String[] responses = {
						"Звісно "
								+ CONDITION_STRING
								+ " покемон. Ти знав, що спочатку був 151 покемон?",
						"Ні, не знав "
								+ CONDITION_STRING
								+ " покемон. Ти знав, що вже 718 покемонів?" };
				SelectiveEntry ce = new SelectiveEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " ти .{3,} Зоряні війни " };
				String[] responses = {
						"Звісно "
								+ CONDITION_STRING
								+ " Зоряні війни. Чи знав ти, що більшість людей неправильно цитує вислів ’Ні. Я твій батько’?",
						"Ні, не знав "
								+ CONDITION_STRING
								+ " Зоряні війни. Чи знав ти, що в третьому епізоді найбільше смертей за всю кінофраншизу? Аж 115." };
				SelectiveEntry ce = new SelectiveEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " як ", " чому ", " що ", " що таке " };
				String[] responses = {
						"Звідки мені це знати?",
						"Ти завжди ставиш стільки питань?",
						"Я не знаю.",
						"Я знав, але забув." };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " мені потрібно ", " я вимагаю " };
				String[] responses = { "Чому тобі потрібно " + CONDITION_STRING,
						"Для чого тобі потрібно " + CONDITION_STRING };
				SpecialEntry ce = new SpecialEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " чи ", " або " };
				String[] responses = { "Мені здається, що перше.",
						"Я не впевнений, що вибрати.",
						"Хммм... можливо друге." };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " я не можу .{3,} ", " я не в змозі .{3,} " };
				String[] responses = { "Чому ні?", "Ти впевнений?",
						"Чому ти не можеш " + CONDITION_STRING };
				SelectiveEntry ce = new SelectiveEntry(keywords, responses);
				database[index++] = ce;

			}

			{
				String[] keywords = { " я не можу ", " я не в змозі " };
				String[] responses = { "Чому ні?", "Ти впевнений?",
						"Чому ти не зможеш це зробити?" };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " буде ", " є ", " робити " };
				String[] responses = { "Думаю, так.", "Ні.", "Можливо." };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " я " };
				String[] responses = { "Завжди про тебе?",
						"Тобі подобається говорити про себе." };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " ти " };
				String[] responses = { "Давай краще поговоримо про тебе.",
						"Мені було б цікавіше дізнатись щось про тебе!" };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " :( ", " =( ", " :[ " };
				String[] responses = { "Чому ти засмучений?",
						"Посміхнись!" };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " :) ", " =) ", " :] " };
				String[] responses = { "Виглядаєш щасливим. :)",
						"Я радий, що ти щасливий!" };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}

			{
				String[] keywords = { " :'( ", " ='( ", " :'[ " };
				String[] responses = { "Не сумуй!" };
				CategoryEntry ce = new CategoryEntry(keywords, responses);
				database[index++] = ce;
			}
		}