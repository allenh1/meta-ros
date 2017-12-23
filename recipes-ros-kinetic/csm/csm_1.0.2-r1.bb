# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This is a ROS 3rd-party wrapper  of Andrea Censi's CSM package.       From :"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cmake libgsl"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.0.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2da00ac373bd9c15040b14b700c02764"
SRC_URI[sha256sum] = "39ee77142fe54c5f9913ba6f88aa6a387b71f3331603e638c324f1cd87992688"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.0.2-1"

inherit catkin
