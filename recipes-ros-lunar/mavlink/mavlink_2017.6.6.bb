# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=19;endline=19;md5=46dd5907f7af0af456f00c524455d867"

DEPENDS = "catkin cmake python python-future python-lxml python-setuptools"
SRC_URI = "https://github.com/mavlink/mavlink-gbp-release/archive/release/lunar/mavlink/2017.6.6-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c1f446828a90af7141307ae1971cbe75"
SRC_URI[sha256sum] = "69e456d8946d0dd8818542131a3e46ddcd440db116e34661b0fb66aaa1b0b7c4"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
