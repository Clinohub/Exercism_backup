import math

def cipher_text(plain_text):
  # lower text
  plain_text = plain_text.lower()
  text = ""
  
  # remove spaces and punctuations
  for elem in plain_text:
    if elem.isalpha() or elem.isnumeric():
      text += elem

  # return empty string
  if not text:
    return text

  text_length = len(text)
  text_list = []
  
  #find square root or near
  rows = int(math.sqrt(text_length))
  columns = rows

  # Rectangle of normalized text
  if rows*rows == text_length:
    for row in range(rows):
      text_list.append(text[row*rows: (row+1)*rows])
  else:
    columns += 1

    print("c", columns)
    
    if columns*columns - text_length < text_length - rows*columns:
      rows = columns

    print("r", rows)
    
    index = 0
    column = columns
    for row in range(rows - 1):
      text_list.append(text[index:column])
      index = column
      column += columns
    text_list.append(text[index: text_length])

    for blank in range(columns*rows - text_length):
      text_list[-1] += " "


  #encode message
  encode_txt = ""
  for column in range(columns):
    row_str = ""
    for row in range(rows):
      a_letter = text_list[row][column]
      if a_letter.isalpha() or a_letter.isnumeric():
        row_str += a_letter
    encode_txt += row_str

  #padding to perfect rectangle
  pads = columns*rows - text_length

  #decode
  message = ""
  index = 0
  end = rows
  for num in range(columns):
    code_section = ""
    if num < (columns - pads):
      code_section += encode_txt[index: end]
      index = end
      end += rows
    else:
      end -= 1
      code_section += (encode_txt[index: end] + " ")
      index = end
      end += rows
      
    message += (code_section + " ")

    
  return message[:-1]