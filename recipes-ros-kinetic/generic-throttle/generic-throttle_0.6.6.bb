# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a throttle for ROS topics"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cv-bridge rospy rostopic"
SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/kinetic/generic_throttle/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b92bd019f671a9514acebc5d8cd4cee"
SRC_URI[sha256sum] = "f4c26f732db7cbb00ddd009d1627587f916583b8c8427dfd1913734b27aa8ee3"
S = "${WORKDIR}/cob_command_tools-release-release-kinetic-generic_throttle-0.6.6-0"

inherit catkin
