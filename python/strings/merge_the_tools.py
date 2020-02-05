def merge_the_tools(string, k):
    block_int = len(string) //k
    output_t = []
    output_u = []

    for ind in range(0, len(string) - k +1, k):
        output_t.append(string[ind:ind + k])
    for block in output_t:
        for char in block:
            char_count = block.count(char)
            if char_count >1:
                block = block[::-1]
                block = block.replace(char, '', char_count - 1)
                block = block[::-1]
        output_u.append(block)
    print("\n".join(map(str, output_u)))
