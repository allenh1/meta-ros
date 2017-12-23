# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The teraranger package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native dynamic-reconfigure roscpp sensor-msgs serial std-msgs"
SRC_URI = "https://github.com/Terabee/${PN}-release/archive/release/kinetic/${PN}/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ac395bd7b20c9526c2f2134c7fc16579"
SRC_URI[sha256sum] = "4176998d6bae6b867f1c501a7cc9c76534e36c643df19d6440d8e51dba523e48"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.1.0-0"

inherit catkin
