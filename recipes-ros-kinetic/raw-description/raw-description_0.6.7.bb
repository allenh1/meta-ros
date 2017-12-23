# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the description (mechanical, kinematic, visual,   etc.) of"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-description gazebo-ros xacro"
SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/kinetic/raw_description/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c6b6d7a4f7b0cd692170960f5817c4e"
SRC_URI[sha256sum] = "f63acc35529f87727928dc863bfd96531bf88c1d027e0d3200713b132ed871a4"
S = "${WORKDIR}/cob_common-release-release-kinetic-raw_description-0.6.7-0"

inherit catkin
